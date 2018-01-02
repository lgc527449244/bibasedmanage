package com.jmu.bibasedmanage.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.jmu.bibasedmanage.dao.BmStudentDao;
import com.jmu.bibasedmanage.pojo.BmStudent;
import com.jmu.bibasedmanage.pojo.BmTeacherGroup;
import com.jmu.bibasedmanage.service.TeacherService;
import com.jmu.bibasedmanage.util.ResponseUtil;
import com.jmu.bibasedmanage.vo.JsonResponse;

@Controller
@RequestMapping("/teacher")
public class BmTeacherController {
	@Resource
	private TeacherService teacherService;
	@Resource
	private BmStudentDao  bmStudentdao;
	/**
	 * 点击查看答辩组的信息。
	 * @param teacherId
	 * @return
	 * Created by hhq on 2018-1-2.
	 */
	 @RequestMapping("/seacherGroup")
	 public ModelAndView searchGroup(String teacherId){
		 BmTeacherGroup teacherGroup = teacherService.searchGroup(teacherId);
		 BmStudent student = bmStudentdao.selectByPrimaryKey("1");
		 ModelAndView modelAndView = new ModelAndView("/test.html");
		 modelAndView.addObject("teacherGroup", teacherGroup);
		 modelAndView.addObject("student", student);
		return modelAndView;
		 
	 }
	 /**
	  * 查看该组学生的信息包括对应的课设题目
	  * @param teacherId
	  * @return
	  * Created by hhq on 2018-1-2.
	  */
	 @RequestMapping("/seacherStudents")
	 public ModelAndView searchStudent(String teacherId){
		 BmTeacherGroup teacherGroup = teacherService.searchStudent(teacherId);
		 ModelAndView modelAndView = new ModelAndView("/test2.html");
		 modelAndView.addObject("teacherGroup", teacherGroup);
		return modelAndView;
	 }
     /**
      * 添加答辩的评价和评分
      * @param studentId
      * @return
      * Created by hhq on 2018-1-2.
      */
	 @RequestMapping("/saveAnswer")
	 @ResponseBody
	 public JsonResponse addAnswerInfo(HttpServletRequest request){
		  String answerEvaluate = request.getParameter("answerEvaluate");
		 String studentId = request.getParameter("studentId");
		 int  answerScore = Integer.parseInt(request.getParameter("answerScore"));
		 teacherService.saveAnswerInfo(studentId,answerEvaluate,answerScore);
		return ResponseUtil.success();
	 }
}
