package com.jmu.bibasedmanage.controller;

import com.jmu.bibasedmanage.pojo.BmStudent;
import com.jmu.bibasedmanage.service.StudentService;
import com.jmu.bibasedmanage.util.ResponseUtil;
import com.jmu.bibasedmanage.vo.JsonResponse;
import com.jmu.bibasedmanage.vo.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by ljc on 2017/12/18.
 */
@Controller
@RequestMapping("/student")
public class BmStudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/list.html", method = RequestMethod.GET)
    public ModelAndView list(){
        return new ModelAndView("");
    }

    /**
     * 学生列表
     * @param map（pageNo:当前页，pageSize:每页条数）
     * @param page
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse listData(@RequestParam Map<String, Object> map, Page<BmStudent> page){
        return ResponseUtil.success(studentService.list(map, page));
    }

    @RequestMapping(value = "/add.html", method = RequestMethod.GET)
    public ModelAndView add(){
        return new ModelAndView("");
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse addData(BmStudent bmStudent){
        studentService.add(bmStudent);
        return ResponseUtil.success();
    }
    @RequestMapping(value = "/update.html",method = RequestMethod.GET)
    public ModelAndView update(){
        return new ModelAndView("");
    }
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    @ResponseBody
    public JsonResponse updateData(BmStudent bmStudent){
        studentService.update(bmStudent);
        return ResponseUtil.success();
    }
    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public JsonResponse delete(String id){
        studentService.delete(id);
        return ResponseUtil.success();
    }


}
