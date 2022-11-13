package com.yp.sx.common.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

/**
 * @author yp
 * @since 2022/11/13
 **/
@Data
public class UserAddDto extends PlatformDto{

    @Pattern(regexp = "^1(3[0-9]|4[01456879]|5[0-35-9]|6[2567]|7[0-8]|8[0-9]|9[0-35-9])\\d{8}$",message = "亲，请输入合法的手机号")
    private String phone;

    @NotEmpty(message = "亲，密码不能为空")
    private String pass;
}
