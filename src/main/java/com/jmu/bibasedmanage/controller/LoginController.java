package com.jmu.bibasedmanage.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ljc on 2017/12/24.
 */
@Controller
@RequestMapping("/")
public class LoginController {

    private final Logger log = LoggerFactory.getLogger(LoginController.class);

    @RequestMapping(value = "login.html", method = RequestMethod.GET)
    public ModelAndView loginHtml(){
        return new ModelAndView("login.html");
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(String username, String password){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try {
            subject.login(token);
        }catch (AuthenticationException ae){
            log.debug("登录失败：{}",ae.getMessage());
            return "/loginFail.html";
        }
        return "/loginSuccess.html";
    }

    @RequestMapping("logout")
    public String logout() {
        return "redirect:/login";
    }
}
