package com.qa.accountaapplication.services;
import java.util.HashMap;
import java.util.Map;

import com.qa.accountaapplication.Account;

public class MapService {

	private Map<Integer, Account> map = new HashMap<Integer, Account>();

	
	public void addAccount(Account acc, int fName) {
		map.put(fName, acc);
	}
	
	public Account getAccount(int key) {
		return map.get(key);
		
	}
	
	public Map<Integer, Account> getMap() {
		return this.map;
	}
}
