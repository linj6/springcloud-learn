package com.lnjecit.serviceribbon.web;

import com.lnjecit.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author
 * @create 2018-03-08 10:42
 **/
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    public HelloController() {

    }

    @RequestMapping("/hi")
    public String hi(String name) {
        return helloService.hiService(name);
    }
}
