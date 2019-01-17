package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountRepository;
import com.qa.util.JSONUtil;

public class AccountServiceImpl implements AccountService {
	
	@Inject
	private AccountRepository repo;
	
	@Inject
	private JSONUtil util;

	public String getAllAccounts() {
		return repo.getAllAccounts();
	}

	public String addAccount(String account) {
		Account toCheck = util.getObjectForJSON(account, Account.class);
		if(checkAccountNo(toCheck.getAccoutnNo())) {
			return repo.addAccount(account);
		}
		return "{\"message\": \"Account number used\"}";
	}

	public String removeAccountByName(String fName) {
		return repo.removeAccountByName(fName);
	}

	public Account findAccount(int id) {
		return repo.findAccount(id);
	}

	public String upDateAccount(int id, String account) {
		Account toCheck = util.getObjectForJSON(account, Account.class);
		if(checkAccountNo(toCheck.getAccoutnNo())) {
			return repo.upDateAccount(id, account);
		}
		return "{\"message\": \"Account number used\"}";
		
	}
	
	public Boolean checkAccountNo(int accNo) {
		if(accNo == 9999) {
			return false;
		}
		return true;
	}
}
