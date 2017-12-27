package com.jmu.bibasedmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 访问错误
 * Created by ljc on 2017/12/18.
 */
@Controller
@RequestMapping("/error")
public class ErrorController {
    @RequestMapping(produces = "text/html")
    public String errorPage() {
        return "error/error.html";
    }

    @RequestMapping(value = "/404", produces = "text/html")
    public String page404() {
        return "error/404.html";
    }
}
