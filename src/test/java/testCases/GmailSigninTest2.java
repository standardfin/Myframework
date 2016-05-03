package testCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.PasswordPage;
import pageObjects.SigninPage;

public class GmailSigninTest2  {
	
	
	
	WebDriver driver= new FirefoxDriver();
	String baseUrl="https://accounts.google.com/";
	
	SigninPage signpage=new SigninPage(driver);
	PasswordPage passwordpage=new PasswordPage(driver);
	
	
	
   @BeforeTest
   
  void testSetUp() throws InterruptedException
   
   {
  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get(baseUrl);
	  Thread.sleep(1000);
	
}

	@AfterMethod
	
	public void tearDown()
	{
	
	driver.quit();
	
		}
	
	
@Test
public void GmailTitleTestText() throws InterruptedException
	{	

	    signpage.geteMail().sendKeys("talakola");
		//log.info("This will display error message in test method");
		Thread.sleep(2000);
		signpage.getNextButton();
		passwordpage.getpassWord().sendKeys("Citra1234");
		passwordpage.getSignIn();
		Thread.sleep(2000);
		String ComposeMailPage =driver.getCurrentUrl();
		String ComposeMailTitleName=driver.getTitle();
		System.out.println(ComposeMailPage);
		System.out.println(ComposeMailTitleName);
		
	}
	
	


	

	

	
	

}
