package com.jyh.piloteer.security.config;


import com.jyh.piloteer.security.dao.UserDao;
import com.jyh.piloteer.security.entity.UserEntity;
import com.jyh.piloteer.security.service.SecurityUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 重载loadUserByUsername，并返回自定义的SecurityUser,
 * 通过SecurityUser来完成用户的身份认证
 *
 * @author JYH
 * 2018/9/9 14:46
 */
@Service
public class AnyUserDetailService implements UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        UserEntity user = userDao.findByName(userName);
        if (user == null) {
            throw new UsernameNotFoundException("UserName" + userName + "not found");
        }
        return new SecurityUser(user);
    }
}
