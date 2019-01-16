package com.qa.accountaaplication.managers;

import java.util.HashMap;
import java.util.Map;

import com.qa.accountaapplication.Account;

public class AccountManager {
	
	private int count =0;
	private Map<String, Account> accounts = new HashMap<String, Account>();

	public void addAccounts(Map<String, Account> map) {
		setAccounts(map);
		setCount(map.size());
		
	}
	
	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Map<String, Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(Map<String, Account> accounts) {
		this.accounts = accounts;
	}

	public void findAccount(String getfName) {
		// TODO Auto-generated method stub
		
	}

}
