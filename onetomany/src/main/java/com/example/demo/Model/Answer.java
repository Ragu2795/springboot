package com.example.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Answer {

	@Id
	private int ansNo;
	private String answer;
	public int getAnsNo() {
		return ansNo;
	}
	public void setAnsNo(int ansNo) {
		this.ansNo = ansNo;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}