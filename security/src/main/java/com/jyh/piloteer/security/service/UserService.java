package com.jyh.piloteer.security.service;


import com.jyh.piloteer.security.entity.UserEntity;

/**
 * @author JYH
 * 2018/9/10 19:24
 */
public interface UserService {

    /**
     * 添加新用户
     * <p>
     * username 唯一，默认USER 权限
     */
    boolean insert(UserEntity userEntity);

    /**
     * 查询用户信息
     *
     * @param username
     * @return
     */
    UserEntity getByUsername(String username);
}