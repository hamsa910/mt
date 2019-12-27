package com.demo_package;

import org.openqa.selenium.WebDriver;

import com.demo_scripts.BaseTest;

public class Launch_Browser extends BaseTest{
	
	WebDriver driver = WebDriverLoad();
	
	public WebDriver LaunchURL(){
		String baseurl = "http://newtours.demoaut.com/mercurysignon.php";
		driver.get(baseurl);
		driver.manage().window().maximize();
		return driver;
	}

}
