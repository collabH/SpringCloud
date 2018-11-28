package com.springcloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME com.springcloud.configclient
 * @PROJECT_NAME sc-f-chapter1
 * @创建人 huang
 * @创建时间 2018/11/28
 */
@RestController
public class Test {
    @Value("${foo}")
    String foo;

    @RequestMapping("/hi")
    public String hi(){
        return foo;
    }
}
