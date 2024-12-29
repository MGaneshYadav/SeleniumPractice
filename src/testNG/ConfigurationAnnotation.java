package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotation {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("before suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before Test");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("after Test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before Class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test1 annotation");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test2 annotation");
	}
	
	@Test
	public void test3()
	{
		System.out.println("Test3 annotation");
	}
	
	
}
