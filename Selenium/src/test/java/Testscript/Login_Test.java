package Testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationCore.TestNgBase;
import pages.LoginPage;
import utilities.ExcelUtility;

public class Login_Test extends TestNgBase{
	@Test
	public void verifyLoginWithValidCredential() throws IOException
	{
		//WebElement =driver.findElement(By.id(""));
		//
		/*WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();*/
		String userNameValue=ExcelUtility.getStringData(0, 0, "LoginPage");
		String PasswordValue=ExcelUtility.getStringData(0, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsername(userNameValue);
		loginpage.enterPasswordOnPassword(PasswordValue);
		loginpage.enterLoginButtonCLick();
	}
	@Test
	public void verifyLoginWithvalidUsernameInvalidPassword() throws IOException
	{
		/*WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret");
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();*/
		String userNameValue=ExcelUtility.getStringData(1, 0, "LoginPage");
		String PasswordValue=ExcelUtility.getStringData(1, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsername(userNameValue);
		loginpage.enterPasswordOnPassword(PasswordValue);
		loginpage.enterLoginButtonCLick();
		
	}
	@Test
	public void verifyInvalidUsernameValidPassword() throws IOException
	{
		/*WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("invaliduser");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("standard_user");
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();*/
		String userNameValue=ExcelUtility.getStringData(2, 0, "LoginPage");
		String PasswordValue=ExcelUtility.getStringData(2, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsername(userNameValue);
		loginpage.enterPasswordOnPassword(PasswordValue);
		loginpage.enterLoginButtonCLick();
		
	}
	@Test
	public void verifyLoginWithInvalidCredentials() throws IOException {
		/*WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("invaliduser");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sasae");
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();*/
		String userNameValue=ExcelUtility.getStringData(3, 0, "LoginPage");
		String PasswordValue=ExcelUtility.getStringData(3, 1, "LoginPage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterUsernameOnUsername(userNameValue);
		loginpage.enterPasswordOnPassword(PasswordValue);
		loginpage.enterLoginButtonCLick();
	}
	

}
