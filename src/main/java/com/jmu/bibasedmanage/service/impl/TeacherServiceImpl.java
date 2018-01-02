package com.jmu.bibasedmanage.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jmu.bibasedmanage.dao.BmStudentDao;
import com.jmu.bibasedmanage.dao.BmTeacherGroupDao;
import com.jmu.bibasedmanage.pojo.BmStudent;
import com.jmu.bibasedmanage.pojo.BmTeacherGroup;
import com.jmu.bibasedmanage.service.TeacherService;
/**
 * 
 * @author chongzi
 *
 */
@Service
public class TeacherServiceImpl implements TeacherService{
	@Resource
    private BmTeacherGroupDao bmTeacherGroupDao;
	@Resource
	private BmStudentDao bmStudentDao;
	/**
	 * 点击查看答辩组的信息。
	 * @param teacherId
	 * @return
	 * Created by hhq on 2018-1-2.
	 */
	public BmTeacherGroup searchGroup(String teacherId){
				return bmTeacherGroupDao.selectByTeacherid(teacherId);
	}
	/**
	 * 点击查看答辩组学生的信息。
	 * @param teacherId
	 * @return
	 * Created by hhq on 2018-1-2.
	 */
	 public BmTeacherGroup searchStudent(String teacherId){
		 return bmTeacherGroupDao.searchStudent(teacherId).get(0);
	 }
	    /**
		 * 增加对该学生的评价和评分
		 * @param teacherId
		 * @return
		 * Created by hhq on 2018-1-2.
		 */
	 public void saveAnswerInfo(String studentId,String answerEvaluate,int answerScore){
		 BmStudent bmStudent= bmStudentDao.selectByPrimaryKey(studentId);
		 bmStudent.setAnswerEvaluate(answerEvaluate);
		 bmStudent.setAnswerScore(answerScore);
		 bmStudentDao.updateByPrimaryKeySelective(bmStudent);
	 }
	 
	 
}
