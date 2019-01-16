package com.qa.accountaapplication.services;

import java.util.Map;
import com.google.gson.Gson;
import com.qa.accountaapplication.Account;

public class GsonTranslator {

	Gson gson = new Gson();
	
	
	public String toJsonMap(Map<Integer, Account> map) {
		return gson.toJson(map);
		
	}

	
}
