package com.yp.sx.common.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @author yp
 * @since 2022/11/13
 **/
@Data
public class PlatformDto {

    @NotNull(message = "亲，ip地址不能为空")
    private String ip;


    private int pid;
}
