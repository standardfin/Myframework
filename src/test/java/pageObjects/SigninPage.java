package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utility.Utils;

public class SigninPage  extends BaseClass{
	private static WebElement element = null;
	
	Utils util=new Utils();
	
	public WebDriver driver;
	//WebDriver driver=new FirefoxDriver();
	
// Constructor  to instantiate  driver
	
	public SigninPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
		
		
	}
	 
	
	@FindBy(how=How.ID,using="Email")
	private WebElement eMail;
	
	
	public  WebElement geteMail()
	
	{
		util.waitForElementLoading(eMail);
		return eMail;
	}
	
	@FindBy(how=How.ID,using="next")
	private WebElement next;
	
	
	public void getNextButton()
	
	{
		
	util.waitForElementLoading(next);
	 next.click();
	}
	
//	
//	@FindBy(how=How.ID,using="")
//	private WebElement eMail;
//	
//	
//	public WebElement geteMail()
//	{
//		return eMail;
//	}
	
	
	
	
	
	

}
