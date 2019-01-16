package com.qa.accountaapplication;

import com.qa.accountaapplication.services.*;;

/**
 * Hello world!
 *
 */
public class App 
{
	private App() {}
	
    public static void main( String[] args )
    {
		Account john = new Account("John", "Smith", 1234);
		MapService map = new MapService();
		Printer print = new Printer();
		map.addAccount(john, john.getfName());
		String toPrint = print.toString(map.getAccount(john.getfName()));
		print.console(toPrint);
		GsonTranslator gson = new GsonTranslator();
		String result = gson.toJsonMap(map.getMap());
		System.out.println(result);
    }
}
