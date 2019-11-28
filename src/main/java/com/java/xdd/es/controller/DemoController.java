package com.java.xdd.es.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xdd
 * @date 2019/11/28
 */
@RestController
@RequestMapping("test")
public class DemoController {

    @RequestMapping("test")
    public String test() {
        return "test";
    }
}
