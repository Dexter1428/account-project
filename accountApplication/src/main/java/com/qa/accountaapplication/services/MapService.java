package com.qa.accountaapplication.services;

import java.util.HashMap;

import com.qa.accountaapplication.Account;

public class MapService {

	private HashMap<Integer, Account> map = new HashMap<Integer, Account>();

	
	public void addAccount(Account acc, int id) {
		map.put(id, acc);
	}
	
	public Account getAccount(int key) {
		
		return map.get(key);
		
	}
	
	
}
