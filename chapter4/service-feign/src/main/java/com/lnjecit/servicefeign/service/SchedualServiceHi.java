package com.lnjecit.servicefeign.service;

import com.lnjecit.servicefeign.service.impl.ScheduleServiceHiHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * SchedualServiceHi
 *
 * @author
 * @create 2018-03-08 13:48
 **/
@FeignClient(value = "service-hi", fallback = ScheduleServiceHiHystrix.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam("name") String name);
}
