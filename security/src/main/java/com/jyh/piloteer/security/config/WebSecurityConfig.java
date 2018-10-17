package com.jyh.piloteer.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


/**
 * @author JYH
 * 2018/9/4 21:41
 */

@Configuration
@EnableWebSecurity
//@EnableWebSecurity 注解使得SpringMVC集成了Spring Security的web安全支持

public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private AnyUserDetailService anyUserDetailService;


    /**
     * 匹配 "/" 路径，不需要权限即可访问
     * 匹配 "/user" 及其以下所有路径，都需要 "USER" 权限
     * 登录地址为 "/login"，登录成功默认跳转到页面 "/user"
     * 退出登录的地址为 "/logout"，退出成功后跳转到页面 "/login"
     * 默认启用 CSRF
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()  //请求
                .antMatchers("/", "/home").permitAll()
                .antMatchers("/user/**").hasRole("USER")
//                .anyRequest().authenticated() //authenticated() 允许认证过的用户访问  如果用户没有认证，filter会捕获请求重定向到登录界面
                .anyRequest().permitAll()
                .and() //用来连接配置
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/user")
                .and()
                .logout()
                //无条件允许访问
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login");
//                .and()
//            .rememberMe() //記住登录的状态
//                //记住时间的秒数
//                .tokenValiditySeconds(86400)
//                .tokenRepository(tokenRepository());

    }


    /**
     * 添加 UserDetailsService， 实现自定义登录校验
     */
    @Autowired
    @Override
    public void configure(AuthenticationManagerBuilder builder) throws Exception {
        builder
                .userDetailsService(anyUserDetailService)
                .passwordEncoder(bCryptPasswordEncoder());
        builder.eraseCredentials(false);

    }

    /**
     * 密码加密
     */
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
