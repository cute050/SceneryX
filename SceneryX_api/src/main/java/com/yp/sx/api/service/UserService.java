package com.yp.sx.api.service;

import com.yp.sx.common.dto.UserAddDto;
import com.yp.sx.common.dto.UserLoginDto;
import com.yp.sx.common.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(value = "sx-authServer")
public interface UserService {

    @GetMapping("/server/auth/user/all.do")
    R getAll();

    @PostMapping("/server/auth/user/save.do")
    R save(@RequestBody UserAddDto dto);

    @PostMapping("/server/auth/user/login.do")
    R login(@RequestBody UserLoginDto dto);
}
