package com.yp.sx.auth.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户基本信息(User)表实体类
 *
 * @author makejava
 * @since 2022-11-12 18:20:08
 */
@NoArgsConstructor
@Data
@TableName("t_user")
public class User {
    //主键
    @TableId(type = IdType.AUTO)
    private Long id;
    //创建时间
    private Date ctime;
    //修改时间
    private Date mtime;
    //状态：1.正常，0.禁用
    private Integer flag;
    //手机号
    private String phone;
    //密码
    private String password;
    //用户来源t_platform(id)
    private Integer pid;


    public User(String phone, String password, Integer pid) {
        this.phone = phone;
        this.password = password;
        this.pid = pid;
        this.flag=1;
        this.ctime=new Date();
        this.mtime=new Date();
    }
}

