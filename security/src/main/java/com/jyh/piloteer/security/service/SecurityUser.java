package com.jyh.piloteer.security.service;


import com.jyh.piloteer.security.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 继承实体对象，并实现Spring Security 的 UserDetail
 * 同时重载getAuthorities(),用来取得为用户分配的角色列表，用于后面的权限验证
 *
 * @author JYH
 * 2018/9/9 15:28
 */
public class SecurityUser extends UserEntity implements UserDetails {

    @Autowired
    private UserEntity user;

    public SecurityUser(UserEntity user) {
        this.user = user;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//        List<RoleEntity> roleEntities=this.getRoles();
//        if(roleEntities != null){
//            for (RoleEntity role:roleEntities){
//                SimpleGrantedAuthority authority=new SimpleGrantedAuthority(role.getName());
//                authorities.add(authority);
//            }
//
//        }
        return authorities;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
