package com.qa.persistence.domain;

import javax.persistence.*;

@Entity
public class Account {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int userId;
	private String fName;
	private String sName;
	private int accoutnNo;

	public Account() {
		//needed for importing sql
	}
	
	public Account(String fName, String sName, int accountNo) {
		setfName(fName);
		setsName(sName);
		setAccoutnNo(accountNo);

	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getAccoutnNo() {
		return accoutnNo;
	}

	public void setAccoutnNo(int accoutnNo) {
		this.accoutnNo = accoutnNo;
	}

}
