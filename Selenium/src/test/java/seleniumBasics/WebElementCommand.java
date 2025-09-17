package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommand extends Base {
public void verifyCommand()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement messagebox=driver.findElement(By.xpath("//input[@id='single-input-field']"));
	messagebox.sendKeys("Bhavana");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommand command= new WebElementCommand();
		command.initializeBrowser();
		command.verifyCommand();

	}

}
