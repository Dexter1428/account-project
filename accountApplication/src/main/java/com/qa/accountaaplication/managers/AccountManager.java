package com.qa.accountaaplication.managers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.qa.accountaapplication.Account;

public class AccountManager {

	private int count = 0;
	private int occurences = 0;
	private ArrayList<Account> found = new ArrayList<Account>();
	private Map<Integer, Account> accounts = new HashMap<Integer, Account>();

	public void addAccounts(Map<Integer, Account> map) {
		setAccounts(map);
		setCount(map.size());

	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setAccounts(Map<Integer, Account> accounts) {
		this.accounts = accounts;
	}

	public Account getAccount(int id) {
		return accounts.get(id);
	}

	public void findAccount(String fname) {
		for (int i = 1; i <= count; i++) {
			Account a = getAccount(i);
			if (a.getfName().equals(fname)) {
				setOccurences(getOccurences() + 1);
				searchedAccounts(a);
			}
		}
	}

	public int getOccurences() {
		return occurences;
	}

	public void setOccurences(int occurences) {
		this.occurences = occurences;
	}

	public ArrayList<Account> getFound() {
		return found;
	}

	public void searchedAccounts(Account found) {
		this.found.add(found);
	}

}
