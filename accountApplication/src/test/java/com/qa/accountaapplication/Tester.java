package com.qa.accountaapplication;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.qa.accountaaplication.managers.AccountManager;
import com.qa.accountaapplication.Account;
import com.qa.accountaapplication.Printer;
import com.qa.accountaapplication.services.GsonTranslator;
import com.qa.accountaapplication.services.MapService;


public class Tester {

	private Account test;
	private Account test2;
	private Account test3;
	private MapService map;
	private GsonTranslator g;
	private Printer p;
	private AccountManager m;
	
	@Before
	public void setup() {
		test = new Account("first", "second", 123);
		test2 = new Account("Bill", "Good", 4321);
		test3 = new Account("Bill", "Bad", 1423);
		map = new MapService();
		p = new Printer();
		m = new AccountManager();
		g = new GsonTranslator();
	}
	
	@Test
	public void addingAccounts() {
		map.addAccount(test, test.getId());
		Account toTest = map.getAccount(test.getId());
		assertEquals("first", toTest.getfName());
	}

	@Test
	public void testPersonCreation() {
		assertEquals("first", test.getfName());
		assertEquals("second", test.getsName());
		assertEquals(123, test.getAccoutnNo());
	}
	
	@Test
	public void testPrinter() {
		assertEquals("Name: first second Account number: 123", p.toString(test));
		
	}
	@Test
	public void testID() {
		Account.incId();
		assertEquals(4,Account.getGlobalId() );
	}
	
	@Test
	public void gson() {
		map.addAccount(test, test.getId());
		assertEquals("{\"17\":{\"userId\":17,\"fName\":\"first\",\"sName\":\"second\",\"accoutnNo\":123}}", g.toJsonMap(map.getMap()));
	}
	
	@Test
	public void counter() {
		map.addAccount(test, test.getId());
		map.addAccount(test2, test2.getId());
		m.addAccounts(map.getMap());
		assertEquals(2, m.getCount());
	}
	
	@Test
	public void counter2() {
		map.addAccount(test, test.getId());
		map.addAccount(test2, test2.getId());
		m.findAccount(test.getfName());
		assertEquals(0, m.getCount());
	}
	
	@Test
	public void counter3() {
		map.addAccount(test, test.getId());
		map.addAccount(test2, test2.getId());
		map.addAccount(test3, test3.getId());
		m.findAccount(test2.getfName());
		assertEquals(0, m.getCount());	
	}
	
	
	
	
	
}
