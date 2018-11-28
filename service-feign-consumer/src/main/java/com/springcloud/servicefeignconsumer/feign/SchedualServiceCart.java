package com.springcloud.servicefeignconsumer.feign;

import com.springcloud.servicefeignconsumer.hystric.SchedualServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @PACKAGE_NAME com.springcloud.servicefeignconsumer.feign
 * @PROJECT_NAME sc-f-chapter1
 * @创建人 huang
 * @创建时间 2018/11/27
 */
@FeignClient(value = "service-cart",fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceCart {
    @GetMapping(value = "/hi")
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
