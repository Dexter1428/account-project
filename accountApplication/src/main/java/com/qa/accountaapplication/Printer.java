package com.qa.accountaapplication;

public class Printer {
	
	public String toString(Account acc) {
		return "Name: " + acc.getfName() + " " + acc.getsName() + " Account number: " + acc.getAccoutnNo();
	}
	
	
	public void console(String str) {
		System.out.println(str);
	}
	
}
