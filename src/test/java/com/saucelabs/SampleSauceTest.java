package com.saucelabs;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SampleSauceTest {
	
	public static final String USERNAME="talakola";
	public static final String ACCESS_KEY="27347e92-1acc-4c39-91cc-672766b18f5b";
	public static final String URL="http://"+USERNAME+":"+ ACCESS_KEY+ "@ondemand.saucelabs.com:80/wb/hub";
	
	//WebDriver driver=new RemoteWebdriver(new URL(URL),caps);
	public static void main(String[] args) throws MalformedURLException
	{
		
		DesiredCapabilities caps=DesiredCapabilities.chrome();
		caps.setCapability("platform", "Windows XP");
		caps.setCapability("version","43.0");
		WebDriver driver=new RemoteWebdriver(new URL(URL),caps);
		driver.get("https://saucelabs.com/test/guinea-pig");
		System.out.println("Title of this page is:" +driver.getTitle());
		driver.quit();
	}
	

}
