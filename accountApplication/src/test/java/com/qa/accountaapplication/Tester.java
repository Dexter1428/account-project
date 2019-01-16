package com.qa.accountaapplication;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.accountaaplication.managers.AccountManager;
import com.qa.accountaapplication.Account;
import com.qa.accountaapplication.Printer;
import com.qa.accountaapplication.services.GsonTranslator;
import com.qa.accountaapplication.services.MapService;


public class Tester {

	
	
	
	@Test
	public void addingAccounts() {
		Account test = new Account("first", "second", 123);
		MapService map = new MapService();
		map.addAccount(test, test.getfName());
		Account toTest = map.getAccount(test.getfName());
		assertEquals("first", toTest.getfName());
	}

	@Test
	public void testPersonCreation() {
		Account test = new Account("first", "second", 123);
		assertEquals("first", test.getfName());
		assertEquals("second", test.getsName());
		assertEquals(123, test.getAccoutnNo());
	}
	
	@Test
	public void testPrinter() {
		Account test = new Account("first", "second", 123);
		Printer p = new Printer();
		assertEquals("Name: first second Account number: 123", p.toString(test));
		
	}
	@Test
	public void testID() {
		Account.incId();
		assertEquals(1,Account.getGlobalId() );
	}
	
	@Test
	public void gson() {
		Account test = new Account("John", "Smith", 1234);
		MapService map = new MapService();
		map.addAccount(test, test.getfName());
		GsonTranslator g = new GsonTranslator();
		assertEquals("{\"John\":{\"userId\":4,\"fName\":\"John\",\"sName\":\"Smith\",\"accoutnNo\":1234}}", g.toJsonMap(map.getMap()));
	}
	
	@Test
	public void counter() {
		Account test = new Account("John", "Smith", 1234);
		Account test2 = new Account("Bill", "Good", 4321);
		MapService map = new MapService();
		map.addAccount(test, test.getfName());
		map.addAccount(test2, test.getfName());
		AccountManager m = new AccountManager();
		m.addAccounts(map.getMap());
		assertEquals(2, m.getCount());
	}
	
	
	
	
	
}
