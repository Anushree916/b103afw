package scripts;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

public class TC3 
{
	
	@BeforeMethod
	public void m1(Method m)
	{
		String mn = m.getName();
		System.out.println("The next method is:"+mn);
	}
	
	@AfterMethod
	public void m2(ITestResult r) 
	{
		int s=r.getStatus();
		if(s==1) 
		{
			System.out.println("Hi this is PASS");
		}
		else 
		{
			System.out.println("Hi this is FAIL");
		}
		
	}
	
	@Test
	public void testLogin()
	{
		System.out.println("test login....");
	}
	
	@Test
	public void testlogout()
	{
		System.out.println("test logout");
		Assert.fail();
	}
}
