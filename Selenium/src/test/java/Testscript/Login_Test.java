package Testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import automationCore.TestNgBase;

public class Login_Test extends TestNgBase{
	@Test
	public void verifyLoginWithValidCredential()
	{
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();
	}
	@Test
	public void verifyLoginWithvalidUsernameInvalidPassword()
	{
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret");
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();
	}
	@Test
	public void verifyInvalidUsernameValidPassword()
	{
		WebElement username=driver.findElement(By.id("user-name"));
		username.sendKeys("invaliduser");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("standard_user");
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();
		
	}
	@Test
	public void verifyLoginWithInvalidUsernameValidPassword() {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("invaliduser");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_sasae");
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();
	}
	@Test
	public void verifyLoginWithInValidCredentials() {
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("user1");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("secret_Key");
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		loginBtn.click();

}
}