/*******************************************************************************
 * Copyright (c) 2015 Unilever.
 *
 * All rights reserved. Do not distribute any of these files without prior consent from Unilever.
 *
 * Contributors:
 *     Publicis.Sapient - Configuration auther and implementation
 *******************************************************************************/
package com.unilever.d2.configurations.domains;

/**
 * @author ssi234 Created Date Jul 29, 2016
 *         com.unilever.d2.configurations.domains SearchOptions
 */
public class SearchOptions {
	private String option;
	private String optionName;

	public SearchOptions() {

	}

	public SearchOptions(String option, String optionName) {
		this.option = option;
		this.optionName = optionName;
	}

	public String getOption() {
		return option;
	}

	public String getOptionName() {
		return optionName;
	}

	public void setOption(String option) {
		this.option = option;
	}

	public void setOptionName(String optionName) {
		this.optionName = optionName;
	}
}
