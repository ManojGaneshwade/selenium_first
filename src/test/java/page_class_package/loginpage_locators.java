package page_class_package;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentReports;

import extent_report_package.ExtentReportUtils;
import test_class_package.parent_class_pom;

public class loginpage_locators {

	//username
	@FindBy(css="input[name='username']")
	WebElement username;
	
	//password
	@FindBy(name="password")
	WebElement password;
	
	//button
	@FindBy(css="button.oxd-button")
	WebElement button;
	
	//constructor
	public loginpage_locators()
	{
		PageFactory.initElements(parent_class_pom.driver,this);
	}
	
	
	
	
	Logger log=LogManager.getLogger(loginpage_locators.class); 
	////actions
	public void login(String uname,String upass)
	{
		username.sendKeys(uname);
		log.info("username enterd");
		//ExtentReportUtils.addStep("step-1 username entered");
		
		password.sendKeys(upass);
		log.info("password entered");
		//ExtentReportUtils.addStep("step-2 passsword entered");
		
		button.click();	
		log.info("button clicked");
		//ExtentReportUtils.addStep("step-3 log in button clicked");
	}
	
	
	
	
}
