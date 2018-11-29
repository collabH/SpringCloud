package com.springcloud.servicefeignconsumer.hystric;

import com.springcloud.servicefeignconsumer.feign.SchedualServiceCart;
import org.springframework.stereotype.Component;

/**
 * SchedualServiceHiHystric需要实现SchedualServiceHi 接口，并注入到Ioc容器中
 * @PACKAGE_NAME com.springcloud.servicefeignconsumer.hystric
 * @PROJECT_NAME sc-f-chapter1
 * @创建人 huang
 * @创建时间 2018/11/27
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceCart {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry"+name+"找不到服务了~~~";
    }

    @Override
    public String getName(String name) {
        return "sorry"+name+"找不到了";
    }
}
