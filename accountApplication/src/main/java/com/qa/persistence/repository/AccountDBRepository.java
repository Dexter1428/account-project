package com.qa.persistence.repository;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import com.qa.persistence.domain.Account;
import com.qa.util.*;


@Transactional(SUPPORTS)
@Default
public class AccountDBRepository implements AccountRepository {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	@Inject
	private JSONUtil util;
	private MapService ms;
	
	public String getAllAccounts() {
		Query query = manager.createQuery("SELECT a FROM Account a");
		@SuppressWarnings("unchecked")
		Collection<Account> accounts = (Collection<Account>) query.getResultList();
		return util.getJSONForObject(accounts);
	}
 
	@Transactional(REQUIRED)
	public String addAccount(String account) {
		Account newAccount = util.getObjectForJSON(account, Account.class);
		manager.persist(newAccount);
		return "{\"message\": \"Account added\"}";
	}

	@Transactional(REQUIRED)
	public String removeAccountByName(String fName) {
		Account toDelete = ms.findAccountByName(fName);
		if(toDelete != null) {
			manager.remove(toDelete);
			return "{\"message\": \"Account removed\"}";
		}

		return "{\"message\": \"Account not found\"}";
	}
	
	@Transactional(REQUIRED)
	public Account findAccount(int id) {
		return manager.find(Account.class, id);
	}

}
