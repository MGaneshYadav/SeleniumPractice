package testNG;

import org.testng.annotations.Test;

public class LearningTestNGAttributes {
	
	@Test(alwaysRun = true,groups = "smoke")
	public void loginTest()
	{
		System.out.println("login Test");
	}
	@Test(invocationCount = 2,threadPoolSize = 2,priority = 1)
	public void registerTest()
	{
		System.out.println("register Test");
	}
	@Test(dependsOnMethods = "registerTest")
	public void cartTest()
	{
		System.out.println("cart Test");
	}
	@Test(enabled  = true,priority = 3)
	public void wishlistTest()
	{
		System.out.println("wishlist Test");
	}
	@Test(groups = "functional")
	public void buynowTest()
	{
		System.out.println("buynow Test");
	}

}
