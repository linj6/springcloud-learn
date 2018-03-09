package com.lnjecit.servicefeign.service.impl;

import com.lnjecit.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * ScheduleServiceHiHystrix
 *
 * @author
 * @create 2018-03-08 15:20
 **/
@Component
public class ScheduleServiceHiHystrix implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "Sorry," + name;
    }
}
