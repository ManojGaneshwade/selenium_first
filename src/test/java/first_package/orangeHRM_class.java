package first_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class orangeHRM_class {
	
	//instance method , can be accessed in any method.
		WebDriver driver;
		
		@Test(priority = 1)
		public void login()
		{
			
			 driver=new ChromeDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					
			//enter username
			driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");	
			
			//enter pass
			driver.findElement(By.name("password")).sendKeys("admin123");
				
			//click log in button
			driver.findElement(By.cssSelector("button.oxd-button")).click();
		}
		
		
		@Test(priority = 2)
		public void adminpage()
		{
			driver.findElement(By.linkText("Admin")).click();
			boolean b=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[1]/label")).isDisplayed();
			Assert.assertTrue(b);
		}
		
		@Test(priority=3)
		public void logout()
		{
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();	
			driver.findElement(By.linkText("Logout")).click();
		}
	

}
