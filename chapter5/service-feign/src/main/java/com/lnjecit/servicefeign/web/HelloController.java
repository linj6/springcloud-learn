package com.lnjecit.servicefeign.web;

import com.lnjecit.servicefeign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * HelloController
 *
 * @author
 * @create 2018-03-08 13:54
 **/
@RestController
public class HelloController {

    @Autowired
    private SchedualServiceHi schedualServiceHi;

    @GetMapping("/hi")
    public String sayHi(@RequestParam("name") String name) {
        return schedualServiceHi.sayHiFromClientOne(name);
    }
}
