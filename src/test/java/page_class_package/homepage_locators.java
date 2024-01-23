package page_class_package;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import extent_report_package.ExtentReportUtils;
import test_class_package.parent_class_pom;

public class homepage_locators  {
	
	//profile icon
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")
	WebElement profileIcon;
	
	//logout option
	@FindBy(linkText = "Logout")
	WebElement logoutOption;
	
	//constructor
	public homepage_locators()
	{
		PageFactory.initElements(parent_class_pom.driver,this);
	}
	
	
	
	Logger log=LogManager.getLogger(homepage_locators.class);
	
	//actions
	public void logout()
	{
		profileIcon.click();
		log.info("profile icon clicked.");
		//ExtentReportUtils.addStep("step-1 profile icon clicked.");
		
		logoutOption.click();
		log.info("log out clicked.");
		//ExtentReportUtils.addStep("step-2 log out option clicked.");
		}
	

}
