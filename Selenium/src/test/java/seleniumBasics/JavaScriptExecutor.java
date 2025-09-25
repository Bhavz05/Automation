package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor extends Base{
	public void verifyJavascriptExecutor()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement showMessageBtn=driver.findElement(By.xpath("//button[@id='button-one')"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", showMessageBtn);
		js.executeScript("window.scrollBy(0,350)", "");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaScriptExecutor js= new JavaScriptExecutor();
		js.initializeBrowser();
		js.verifyJavascriptExecutor();
	}

}
