package com.jmu.bibasedmanage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by ljc on 2017/12/14.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/index")
    public ModelAndView test(){
        return new ModelAndView("test.html");
    }
}
