package com.qa.accountaapplication;

public class Account {

	private static int id = 0;
	private int userId;
	private String fName;
	private String sName;
	private int accoutnNo;

	public Account(String fName, String sName, int accountNo) {
		setfName(fName);
		setsName(sName);
		setAccoutnNo(accountNo);
		incId();
		setUserId();
		
	}

	public static void incId() {
		id += 1;
	}
	
	public static int getGlobalId() {
		return id;
	}
	
	public void setUserId() {
		this.userId = id;
	}
	
	public int getId() {
		return this.userId;
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
