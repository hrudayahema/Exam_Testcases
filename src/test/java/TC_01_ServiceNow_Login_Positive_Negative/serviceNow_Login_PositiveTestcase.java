package TC_01_ServiceNow_Login_Positive_Negative;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class serviceNow_Login_PositiveTestcase extends BaseTest{
	
	@Test
	
// Verify title is ServiceNow
	 public void Login() throws Exception {
	 
		 System.out.println("verify title page, application title: " + driver.getTitle());
		 
//Verify username text field has label of User name
	
		  
		 WebElement labelText = driver.findElement(By.xpath("//span[contains(text(),'Email')]"));
		String Email = labelText.getText();
		 System.out.println("label of Username: " + Email);
		 

		 
// Enter username/email
		 Thread.sleep(4000);
		 //driver.findElement(By.name("email")).clear();
		 Thread.sleep(2000);
		 
		//driver.findElement(By.name("email")).sendKeys("hrudayahema@gmail.com");
	
//Verify password text field has label of Password
		
		 WebElement password = driver.findElement(By.xpath("//span[contains(text(),'Password')]"));
		String s = password.getText();
		System.out.println("password label is:" +s);
		
// Enter password
		 
		 driver.findElement(By.id("sign_in_password")).sendKeys("Test@12345");
		 System.out.println("password entered");
		 
//verify forgot password is visible to the user
		 WebElement forgotpassword = driver.findElement(By.linkText("Forgot your password?"));
			String f = forgotpassword.getText();
			System.out.println("forgot password is visible to the user as:" +f);
		 
//Verify user can see the login button
			WebElement loginbutton = driver.findElement(By.linkText("Sign In"));
			String lb = loginbutton.getText();
			System.out.println("user can see the login button as: " +lb);
		 
		 
//sign button
		 
		 driver.findElement(By.linkText("Sign In")).click();

		 
	 
		 

		

		
		
		 
		

		 
}
	
}
    
