package com.springcloud.netflixeruekaprovider.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME com.springcloud.netflixeruekaprovider.controller
 * @PROJECT_NAME SpringCloud
 * @创建人 huang
 * @创建时间 2018/11/29
 */
@RestController
public class HelloController {

    @GetMapping(value = "findUser/{name}")
    public String getName(@PathVariable("name") String name){
        return name;
    }

}
