package test_class_package;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import page_class_package.homepage_locators;

public class homePage_testCase extends parent_class_pom{
	
	@Test
	public void logoutfromApp()
	{
		homepage_locators hpage=new homepage_locators();
		hpage.logout();
	}
	
	
	/*
	public void admin()
	{
		boolean b=parent_class_pom.driver.findElement(By.id("")).isDisplayed();
	}
   */

}
