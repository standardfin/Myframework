package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.internal.Utils;
import org.testng.annotations.Test;
public class PasswordPage extends BaseClass {
	
private static WebElement element = null;
	
	public WebDriver driver;
	//Utils util=new Utils();
	//WebDriver driver=new FirefoxDriver();
	
// Constructor  to initialize object variables
	
	public PasswordPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(how=How.ID,using="Passwd")
	private WebElement passWord;
	
	
	public WebElement getpassWord()
	{
		return passWord;
	}
	

	@FindBy(how=How.ID,using="signIn")
	private WebElement signIn;
	
	public void getSignIn()
	
	{
		//util.w
		 signIn.click();
	}
	
	
	

}
