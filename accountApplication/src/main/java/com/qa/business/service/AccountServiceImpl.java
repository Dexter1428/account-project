package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.domain.Account;
import com.qa.persistence.repository.AccountRepository;

public class AccountServiceImpl implements AccountService {
	
	@Inject
	private AccountRepository repo;

	public String getAllAccounts() {
		return repo.getAllAccounts();
	}

	public String addAccount(String account) {
		return repo.addAccount(account);
	}

	public String removeAccountByName(String fName) {
		return repo.removeAccountByName(fName);
	}

	public Account findAccount(int id) {
		return repo.findAccount(id);
	}

}
