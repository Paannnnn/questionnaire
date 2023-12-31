package com.example.questionnaire.vo;

import java.util.List;

import com.example.questionnaire.constants.RtnCode;

public class QuizRes {
	

private List<QuizVo> quizVoList;

	private RtnCode rtncode;

	public RtnCode getRtncode() {
		return rtncode;
	}

	public void setRtncode(RtnCode rtncode) {
		this.rtncode = rtncode;
	}

	public QuizRes(RtnCode rtncode) {
		super();
		this.rtncode = rtncode;
	}

	public QuizRes() {
		super();
	}

	public List<QuizVo> getQuizVoList() {
		return quizVoList;
	}

	public void setQuizVoList(List<QuizVo> quizVoList) {
		this.quizVoList = quizVoList;
	}

	public QuizRes(List<QuizVo> quizVoList, RtnCode rtncode) {
		super();
		this.quizVoList = quizVoList;
		this.rtncode = rtncode;
	}

	
	
	
	
}

