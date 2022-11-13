package com.yp.sx.api.controller;

import com.yp.sx.api.service.UserService;
import com.yp.sx.common.dto.UserAddDto;
import com.yp.sx.common.dto.UserLoginDto;
import com.yp.sx.common.vo.R;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author yp
 * @since 2022/11/13
 **/
@RestController
@RequestMapping("/api/auth")
@Api(value = "实现认证操作",tags = "实现认证操作")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/all.do")
    public R all(){
        return userService.getAll();
    }

    @PostMapping("/save.do")
    public R save(@RequestBody UserAddDto dto){
        return userService.save(dto);
    }

    @PostMapping("/login.do")
    public R login(@RequestBody UserLoginDto dto){
        return userService.login(dto);
    }
}
