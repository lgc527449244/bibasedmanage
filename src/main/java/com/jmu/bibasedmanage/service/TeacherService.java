package com.jmu.bibasedmanage.service;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.jmu.bibasedmanage.pojo.BmStudent;
import com.jmu.bibasedmanage.pojo.BmTeacherGroup;

public interface TeacherService {
	 public BmTeacherGroup searchGroup(String teacherId);
	 public BmTeacherGroup searchStudent(String teacherId);
	 public void saveAnswerInfo(String studentId,String answerEvaluate,int answerScore);
}
