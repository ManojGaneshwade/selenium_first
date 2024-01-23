package test_class_package;

import org.testng.annotations.Test;

import page_class_package.loginpage_locators;

public class loginPage_testCase extends parent_class_pom{
	
	@Test
	public void login()
	{
		loginpage_locators lin=new loginpage_locators();
		lin.login("Admin","admin123");
	}

}
