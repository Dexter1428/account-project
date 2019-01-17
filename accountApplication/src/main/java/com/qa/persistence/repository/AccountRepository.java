package com.qa.persistence.repository;

import com.qa.persistence.domain.Account;

public interface AccountRepository {

	String getAllAccounts();
	String addAccount(String account);
	String removeAccountByName(String fName);
	Account findAccount(int id);
	String upDateAccount(int id, String account);
}
