package com.qa.accountApplication;

import com.qa.accountApplication.*;
import com.qa.accountApplication.services.*;;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		Account john = new Account("John", "Smith", 1234);
		MapService map = new MapService();
		Printer print = new Printer();
		map.addAccount(john, john.getId());
		String toPrint = print.toString(map.getAccount(john.getId()));
		print.console(toPrint);
    }
}
