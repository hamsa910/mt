package com.demo_scripts;

import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	ChromeDriver driver;
	
	public ChromeDriver WebDriverLoad(){
		String absolutepath = System.getProperty("user.dir");
		String filepath = absolutepath+"\\chromedriver.exe";
		//String filepath = absolutepath+"\\Drivers"+"\\chromedriver.exe";
		System.out.println(filepath);
		System.setProperty("Webdriver.chrome.driver", filepath);
		//System.setProperty("Webdriver.chrome.driver","C:\\SeleniumTraining\\Workspace\\HCL_Mercury_Tours\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
}
}
