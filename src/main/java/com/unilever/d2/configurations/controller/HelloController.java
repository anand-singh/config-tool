/*******************************************************************************
 * Copyright (c) 2015 Unilever.
 *
 * All rights reserved. Do not distribute any of these files without prior consent from Unilever.
 *
 * Contributors:
 *     Publicis.Sapient - Configuration auther and implementation
 *******************************************************************************/
package com.unilever.d2.configurations.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ssi234
 * Created Date Jul 13, 2016
 * com.unilever.d2.configuration.controller
 * HelloController
 */
@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String index() {
        return "Greetings from Spring Boot Loader!";
    }
    
    @RequestMapping("/home")
    @ResponseBody
    public String home() {
        return "Welcome Home!";
    }
    
    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "Testing Boot Loader!";
    }
    
}