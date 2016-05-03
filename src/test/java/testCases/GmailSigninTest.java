package testCases;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

import pageObjects.BaseClass;
import pageObjects.PasswordPage;
import pageObjects.SigninPage;
import utility.ExcelUtils;
//import utility.Log;
import utility.Verification;

public class GmailSigninTest  {
	
	//static Logger mainLogger=LogManager.getLogger(GmailSigninTest.class.getName());
	//Logging features
	
	
	static Logger log=Logger.getLogger(GmailSigninTest.class.getName());
	static Appender append;
	

	WebDriver driver=new FirefoxDriver();
	String baseUrl="https://mail.google.com";
	
/*	--------------------------------------------------------------------
SigninPage signpage;
	SigninPage signpage=PageFactory.initElements(driver, SigninPage.class);
	PasswordPage passwordpage=PageFactory.initElements(driver, PasswordPage.class);
	
	-------------------------------------------------------------------------*/
	
	
	SigninPage signpage=new SigninPage(driver);
	PasswordPage passwordpage=new PasswordPage(driver);
	

	
	Verification verify=new Verification();
	ExcelUtils excel=new ExcelUtils();
	String Path="c://MyFolder//ExcelRead.xls";
	//static Appender append;
	
	
	
   @BeforeMethod
   public  void testSetUp() throws InterruptedException
   
{
	   
final PatternLayout layout=new PatternLayout();
layout.setConversionPattern("%d{yyyy-mm-dd} --%-10p %c -%m%n");
		
	   append=new ConsoleAppender(layout);
	   log.addAppender(append);
	   
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get(baseUrl);
	  Thread.sleep(1000);
	
}

	@AfterMethod
	
	public void tearDown()
	{
		log.info("this log is from tear down");
	driver.quit();
	
		}
	
	
	

	
@Test
public void GmailTitle0()
	{	
	
		
		
		
		signpage.geteMail().sendKeys("talakola");
		log.info("This will display error message in test method");
		//Thread.sleep(2000);
		signpage.getNextButton();
		passwordpage.getpassWord().sendKeys("Citra1234");
		passwordpage.getSignIn();	
		String ComposeMailPage =driver.getCurrentUrl();
		String ComposeMailTitleName=driver.getTitle();
		System.out.println(ComposeMailPage);
		System.out.println(ComposeMailTitleName);
		log.info("END OF TEST");
		verify.verifyEquals("Gmail sign in test", driver.getTitle(), "Gmail");
		
	}
	
	@Test(dataProvider="fieldsInputs")
	public void GmailTitle(String userid, String password) throws Exception
	{	
	
		
		
		
		signpage.geteMail().sendKeys(userid);
		log.info("This will display error message in test method");
		Thread.sleep(2000);
		signpage.getNextButton();
		passwordpage.getpassWord().sendKeys(password);
		passwordpage.getSignIn();	
		String ComposeMailPage =driver.getCurrentUrl();
		String ComposeMailTitleName=driver.getTitle();
		System.out.println(ComposeMailPage);
		System.out.println(ComposeMailTitleName);
		log.info("END OF TEST");
		verify.verifyEquals("Gmail sign in test", driver.getTitle(), "Gmail");
		
	}


	

	

	
	

}
