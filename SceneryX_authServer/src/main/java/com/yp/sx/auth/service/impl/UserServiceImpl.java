package com.yp.sx.auth.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yp.sx.auth.dao.UserDao;
import com.yp.sx.auth.entity.User;
import com.yp.sx.auth.service.intf.UserService;
import com.yp.sx.auth.util.JwtUtil;
import com.yp.sx.common.config.SystemConfig;
import com.yp.sx.common.config.redisKeyConfig;
import com.yp.sx.common.dto.UserAddDto;
import com.yp.sx.common.dto.UserLoginDto;
import com.yp.sx.common.util.PassUtil;
import com.yp.sx.common.vo.R;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * 用户基本信息(User)表服务实现类
 *
 * @author makejava
 * @since 2022-11-12 18:20:08
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Resource
    private RedisTemplate redisTemplate;

    @Override
    public R all() {
        return R.ok(userDao.selectList(null));
    }

    @Override
    public R loginV1(UserLoginDto dto) {

        //查询数据库
        User user = userDao.selectOne(new QueryWrapper<User>().eq("phone",dto.getPhone()));
        //验证用户是否存在
        if (user != null) {
            //校验密码 密文比较
            if (Objects.equals(user.getPassword(), PassUtil.aesenc(SystemConfig.PASS_KEY,dto.getPass()))) {
                //生成令牌
                String token = JwtUtil.createToken(user.getId()+"",604800016L);
                //存储令牌 有效期
                redisTemplate.boundValueOps(redisKeyConfig.LOGIN_PHONE+dto.getPhone())
                        .set(token,redisKeyConfig.LOGIN_TOKEN_TIME, TimeUnit.MINUTES);
                redisTemplate.boundListOps(redisKeyConfig.LOGIN_TOKEN+token)
                        .leftPushAll(JSON.toJSONString(user),1);
                return R.ok(token);
            }
        }
        return R.fail();
    }

    @Override
    public R loginV2(UserLoginDto dto) {
        return null;
    }

    @Override
    public R add(UserAddDto dto) {

        User user = new User(dto.getPhone(), PassUtil.aesenc(SystemConfig.PASS_KEY,dto.getPass()), dto.getPid());
        if (userDao.insert(user)>0){
            return R.ok();
        }
        return R.fail();
    }
}

