package com.jmu.bibasedmanage.controller;

import com.jmu.bibasedmanage.exception.BusinessException;
import com.jmu.bibasedmanage.util.ResponseUtil;
import com.jmu.bibasedmanage.vo.JsonResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

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
    @RequestMapping("/data")
    @ResponseBody
    public JsonResponse data(){
        String key1 = "test";
        Map<String, String> map = new HashMap<String, String>();
        map.put("ss","111");
        map.put("te","22");
        return ResponseUtil.successMap(key1, map);
    }
    @RequestMapping("/exception")
    public void exception(){
        throw new BusinessException("测试");
    }
}
