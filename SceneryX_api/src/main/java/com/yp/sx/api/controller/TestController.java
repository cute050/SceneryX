package com.yp.sx.api.controller;

import com.yp.sx.api.service.TestService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yp
 * @since 2022/11/12
 **/

@RestController
@RequestMapping("/api/test")
@Api(value = "实现测试操作",tags = "实现测试操作")
public class TestController {

    @Resource
    private TestService service;

    @GetMapping("/t1.do")
    public String ti1(){
        return service.t1();
    }
}
