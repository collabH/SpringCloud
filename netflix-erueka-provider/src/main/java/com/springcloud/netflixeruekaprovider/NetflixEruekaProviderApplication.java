package com.springcloud.netflixeruekaprovider;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient  //表明自己是一个eurekaclient.
@RestController
@EnableHystrix //注解开启断路器
@EnableHystrixDashboard //开启HystrixDashboard
@EnableCircuitBreaker //
public class NetflixEruekaProviderApplication {

    /**
     * 访问地址 http://localhost:9000/actuator/hystrix.stream
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(NetflixEruekaProviderApplication.class, args);
    }

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String home(@RequestParam(value = "name", defaultValue = "黄世民") String name) {
        return "hi" + name + ",i am from port:" + port;
    }

    public String hiError(String name) {
        return "hi." + name + ",sorry,error!";
    }
}
