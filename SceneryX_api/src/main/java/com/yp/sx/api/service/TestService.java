package com.yp.sx.api.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "sx-authServer")
public interface TestService {

    @GetMapping("/server/auth/test.do")
    String t1();
}
