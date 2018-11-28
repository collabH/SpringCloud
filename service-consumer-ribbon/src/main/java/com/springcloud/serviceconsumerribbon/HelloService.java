package com.springcloud.serviceconsumerribbon;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @PACKAGE_NAME com.springcloud.serviceconsumerribbon
 * @PROJECT_NAME sc-f-chapter1
 * @创建人 huang
 * @创建时间 2018/11/27
 */
@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError") //服务挂掉后 进入的方法名
    public String hiService(String name){
        return restTemplate.getForObject("http://SERVICE-CART/hi?name="+name,String.class);
    }

    public String hiError(String name){
        return "hi,"+name+",sorry,error!";
    }
}
