package com.qa.business.service;

import com.qa.persistence.domain.Account;

public interface AccountService {
	String getAllAccounts();
	String addAccount(String account);
	String removeAccountByName(String fName);
	Account findAccount(int id);
}
