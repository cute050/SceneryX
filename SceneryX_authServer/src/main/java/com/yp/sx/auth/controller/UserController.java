package com.yp.sx.auth.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yp.sx.auth.entity.User;
import com.yp.sx.auth.service.intf.UserService;
import com.yp.sx.common.dto.UserAddDto;
import com.yp.sx.common.dto.UserLoginDto;
import com.yp.sx.common.vo.R;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 用户基本信息(User)表控制层
 *
 * @author makejava
 * @since 2022-11-12 18:20:08
 */
@RestController
@RequestMapping("/server/auth/user")
public class UserController  {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    @GetMapping("/all.do")
    public R getAll(){

        return userService.all();
    }

    @PostMapping("/save.do")
    public R save(@RequestBody UserAddDto dto){
        return userService.add(dto);
    }

    @PostMapping("/login.do")
    public R login(@RequestBody UserLoginDto dto){
        return userService.loginV1(dto);
    }


}

