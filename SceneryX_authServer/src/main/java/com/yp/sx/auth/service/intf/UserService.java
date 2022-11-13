package com.yp.sx.auth.service.intf;


import com.yp.sx.auth.entity.User;
import com.yp.sx.common.dto.UserAddDto;
import com.yp.sx.common.dto.UserLoginDto;
import com.yp.sx.common.vo.R;

/**
 * 用户基本信息(User)表服务接口
 *
 * @author makejava
 * @since 2022-11-12 18:20:08
 */

public interface UserService extends IService {

    //第一版
    R loginV1(UserLoginDto dto);

    //第二版 完善业务
    R loginV2(UserLoginDto dto);

    //新增
    R add(UserAddDto dto);
}

