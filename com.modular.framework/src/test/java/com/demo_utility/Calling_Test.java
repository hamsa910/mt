package com.demo_utility;

import org.testng.annotations.Test;

import com.demo_package.FlighReservation_Main_Page;

public class Calling_Test {

	FlighReservation_Main_Page CallMainPage = new FlighReservation_Main_Page();
	
	@Test
	public void Call_All_Test() throws InterruptedException{
		CallMainPage.Login();
		CallMainPage.bookticket();
		CallMainPage.CloseBrowser();
	}
}
