package com.yp.sx.common.config;

/**
 * @author yp
 * @since 2022/11/13
 **/
public class redisKeyConfig {

    //记录令牌 List类型 令牌和用户信息 1用户信息 2 次数 用户注销
    public static final String LOGIN_TOKEN = "ps:auth:token:"; //追加令牌
    public static final String LOGIN_PHONE = "ps:auth:phone:"; //追加手机号

    public static final int LOGIN_TOKEN_TIME =30; //有效期30分钟
}
