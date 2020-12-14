package com.kgc.dubbo.hrmanagerconsumer.controller;

import com.kgc.dubbo.service.HrManagerService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;

/**
 * @author shkstart
 * @create 2020-12-14 18:54
 */
@Controller
public class HrManagerController {
    @Reference
    HrManagerService hrManagerService;
}
