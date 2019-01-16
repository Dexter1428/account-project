package com.qa.accountaapplication.services;
import java.util.HashMap;
import java.util.Map;

import com.qa.accountaapplication.Account;

public class MapService {

	private Map<String, Account> map = new HashMap<String, Account>();

	
	public void addAccount(Account acc, String fName) {
		map.put(fName, acc);
	}
	
	public Account getAccount(String key) {
		return map.get(key);
		
	}
	
	public Map<String, Account> getMap() {
		return this.map;
	}
}
