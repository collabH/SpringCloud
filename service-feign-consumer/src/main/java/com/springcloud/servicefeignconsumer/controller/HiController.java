package com.springcloud.servicefeignconsumer.controller;

import com.springcloud.servicefeignconsumer.feign.SchedualServiceCart;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PACKAGE_NAME com.springcloud.servicefeignconsumer.controller
 * @PROJECT_NAME sc-f-chapter1
 * @创建人 huang
 * @创建时间 2018/11/27
 */
@RestController
public class HiController {

    //编译器报错，无视。 因为这个Bean是在程序启动的时候注入的，编译器感知不到，所以报错。
    @Autowired
    SchedualServiceCart schedualServiceCart;

    @GetMapping(value = "/hi")
    public String sayHi(@RequestParam("name") String name){
        return schedualServiceCart.sayHiFromClientOne(name);
    }

    @GetMapping(value = "/findUser/{name}")
    public String getName(@PathVariable("name") String name){
        return schedualServiceCart.getName(name);
    }
}
