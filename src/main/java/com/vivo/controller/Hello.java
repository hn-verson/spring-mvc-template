package com.vivo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by verson on 2017/7/15.
 */
@Controller
public class Hello {

    private final static Logger LOGGER = LoggerFactory.getLogger(Hello.class);

    @RequestMapping(path = "/hello", method = RequestMethod.GET)
    @ResponseBody
    public String hello() {
        return "hello";
    }

}
