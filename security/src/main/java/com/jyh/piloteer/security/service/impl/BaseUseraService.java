package com.jyh.piloteer.security.service.impl;


import com.jyh.piloteer.security.constant.RoleConstant;
import com.jyh.piloteer.security.dao.UserDao;
import com.jyh.piloteer.security.entity.UserEntity;
import com.jyh.piloteer.security.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


/**
 * @author JYH
 * 2018/9/10 19:27
 */
public class BaseUseraService implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public boolean insert(UserEntity userEntity) {
        String username = userEntity.getName();
        if (exist(username)) {
            return false;
        }
        encryptPassword(userEntity);
        userEntity.setRoles(RoleConstant.ROLE_USER);
        userDao.save(userEntity);
        return true;
    }

    @Override
    public UserEntity getByUsername(String username) {
        return userDao.findByName(username);
    }

    /**
     * 判断用户是否存在
     *
     * @param username
     * @return
     */
    private boolean exist(String username) {
        UserEntity userEntity = userDao.findByName(username);
        return (userEntity != null);
    }

    private void encryptPassword(UserEntity userEntity) {

        String password = userEntity.getPassword();
        password = new BCryptPasswordEncoder().encode(password);
        userEntity.setPassword(password);
    }

}
