package com.example.demo.Model;



import java.util.List;

import jakarta.persistence.*;

@Entity
public class Question {

	@Id
	private int qNo;
	private String qName;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn
	private List<Answer> ans;

	public int getqNo() {
		return qNo;
	}

	public void setqNo(int qNo) {
		this.qNo = qNo;
	}

	public String getqName() {
		return qName;
	}

	public void setqName(String qName) {
		this.qName = qName;
	}

	public List<Answer> getAns() {
		return ans;
	}

	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}

	
	
	
}