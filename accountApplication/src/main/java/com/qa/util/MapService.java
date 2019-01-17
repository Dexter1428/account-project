package com.qa.util;
import java.util.HashMap;
import java.util.Map;

import com.qa.persistence.domain.Account;

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
	
	public Account findAccountByName(String fName) {
		for(int i=0; i<=map.size(); i++) {
			Account a = getAccount(i);
			if(a.getfName().equals(fName)) {
				return a;
			}
		}
		return null;
	}
}
