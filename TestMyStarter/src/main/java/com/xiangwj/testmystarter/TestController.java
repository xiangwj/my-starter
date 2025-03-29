package com.xiangwj.testmystarter;

import com.xiangwj.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private MyService myService;
    @GetMapping("/test")
    public String test() {
        return myService.wrap("test my-spring-boot-start");
    }
}
