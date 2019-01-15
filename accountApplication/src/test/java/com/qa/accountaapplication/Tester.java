package com.qa.accountaapplication;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.accountaapplication.Account;
import com.qa.accountaapplication.Printer;
import com.qa.accountaapplication.services.MapService;


public class Tester {

	
	
	
	@Test
	public void addingAccounts() {
		Account test = new Account("first", "second", 123);
		MapService map = new MapService();
		map.addAccount(test, test.getId());
		Account toTest = map.getAccount(test.getId());
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
}