package com.jyh.piloteer.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @author JYH
 * 2018/9/11 9:06
 */
@Controller
public class LoginController {
    @RequestMapping(value = "/login", method = GET)
    public String login() {

        return "login";
    }

    @GetMapping("/home")
    public String home() {

        return "home";
    }
}
