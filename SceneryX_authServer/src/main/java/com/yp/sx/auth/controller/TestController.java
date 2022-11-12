package com.yp.sx.auth.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author yp
 * @since 2022/11/12
 **/

@RestController
@RequestMapping("/server/auth")
public class TestController {

    @GetMapping("/test.do")
    public String t1(){
        return "问天地好在"+new Date();
    }
}
