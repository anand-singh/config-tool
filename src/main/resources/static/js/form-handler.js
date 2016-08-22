/**
 * 
 */

jQuery.validator.setDefaults({
	highlight : function(element, errorClass, validClass) {
		if (element.type === "radio") {
			this.findByName(element.name).addClass(errorClass).removeClass(validClass);
		} else {
			$(element).closest('.form-group').removeClass('has-success has-feedback').addClass('has-error has-feedback');
			$(element).closest('.form-group').find('i.fa').remove();
			$(element).closest('.form-group').append('<i class="fa fa-exclamation fa-lg form-control-feedback"></i>');
		}
	},
	unhighlight : function(element, errorClass, validClass) {
		if (element.type === "radio") {
			this.findByName(element.name).removeClass(errorClass).addClass(validClass);
		} else {
			$(element).closest('.form-group').removeClass('has-error has-feedback').addClass('has-success has-feedback');
			$(element).closest('.form-group').find('i.fa').remove();
			$(element).closest('.form-group').append('<i class="fa fa-check fa-lg form-control-feedback"></i>');
		}
	}
});

var $configToolForm = $("#configToolForm");
var $root = $("#root");
var $component = $("#component");
var $environment = $("#environment");
var $brand = $("#brand");
var $locale = $("#locale");
var $entity = $("#entity");

$configToolForm.validate();

$("#locale").rules("add", { required : true });

var rootFieldConditions = function() {
	resetFormConditions();
	$root.rules("add", { required : true });
	$component.rules("remove");
	$environment.rules("remove");
	$brand.rules("remove");
	$locale.rules("remove");
	$entity.rules("remove");
	//$configToolForm.validate();
}

var componentFieldConditions = function() {
	resetFormConditions();
	$root.rules("add", { required : true });
	$component.rules("add", { required : true });
	$environment.rules("remove");
	$brand.rules("remove");
	$locale.rules("remove");
	$entity.rules("remove");
	//$configToolForm.validate();
}

var environmentFieldConditions = function() {
	resetFormConditions();
	$root.rules("add", { required : true });
	$component.rules("add", { required : true });
	$environment.rules("add", { required : true });
	$brand.rules("remove");
	$locale.rules("remove");
	$entity.rules("remove");
	//$configToolForm.validate();
}

var brandFieldConditions = function() {
	resetFormConditions();
	$root.rules("add", { required : true });
	$component.rules("add", { required : true });
	$environment.rules("add", { required : true });
	$brand.rules("add", { required : true });
	$locale.rules("remove");
	$entity.rules("remove");
	//$configToolForm.validate();
}

var localeFieldConditions = function() {
	resetFormConditions();
	$root.rules("add", { required : true });
	$component.rules("add", { required : true });
	$environment.rules("add", { required : true });
	$brand.rules("add", { required : true });
	$locale.rules("add", { required : true });
	$entity.rules("remove");
	//$configToolForm.validate();
}

var entityFieldConditions = function() {
	resetFormConditions();
	$root.rules("add", { required : true });
	$component.rules("add", { required : true });
	$environment.rules("add", { required : true });
	$brand.rules("add", { required : true });
	$locale.rules("add", { required : true });
	$entity.rules("add", { required : true });
	//$configToolForm.validate();
}

var resetFormConditions = function() {
	$root.rules("remove");
	$component.rules("remove");
	$environment.rules("remove");
	$brand.rules("remove");
	$locale.rules("remove");
	$entity.rules("remove");
}


