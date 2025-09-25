package seleniumBasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotation {
@Test

	public void SampleTest()
	{
		System.out.println("This is a testcase");
	}
@BeforeMethod
public void beforeMethod() {
	System.out.println("This is before method.");
}
@AfterMethod
public void afterMethod() {
	System.out.println("This is after method");
}
@BeforeTest
public void beforeTest()
{
	System.out.println("This is beforetest");
}
@AfterTest
public void afterTest()
{
System.out.println("This is after test");
}
@AfterClass
public void afterclass()
{
	System.out.println("This is afterclass");
}
@BeforeClass
public void beforeclass()
{
	System.out.println("This is beforeclass");
}
@BeforeSuite
public void beforesuite()
{
	System.out.println("This is before suite");
}
@AfterSuite
public void Aftersuite()
{
	System.out.println("This is after suite");
}
}
