package com.qa.accountApplication;

public class Account {

	private String fName;
	private String sName;
	private int accoutnNo;

	public Account(String fName, String sName, int accountNo) {
		setfName(fName);
		setsName(sName);
		setAccoutnNo(accountNo);
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
