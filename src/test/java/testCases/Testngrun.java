package testCases;

import org.testng.annotations.Test;

public class Testngrun {
	
	
	@Test(priority = 3, enabled = true)
	public void testCase1()
	{
		System.out.println("Test this");	
	}
	
	
	@Test(priority = 1, enabled = true)
	public void testCase2()
	{
		System.out.println("Test this second test case");
	}
	
	
	@Test(priority = 2, enabled = true)
	public void testCase3()
	{
		System.out.println("Test this second test case");
	}

}
