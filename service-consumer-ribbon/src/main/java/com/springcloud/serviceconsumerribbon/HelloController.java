package com.springcloud.serviceconsumerribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME com.springcloud.serviceconsumerribbon
 * @PROJECT_NAME sc-f-chapter1
 * @创建人 huang
 * @创建时间 2018/11/27
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    @GetMapping(value = "/hi")
    public String hi(@RequestParam String name) {
        return helloService.hiService(name);
    }
}
