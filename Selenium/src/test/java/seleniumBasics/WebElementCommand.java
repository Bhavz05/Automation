package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommand extends Base {
public void verifyCommand()
{
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement messageBox= driver.findElement(By.xpath("//input [@id='single-input-field']"));
	messageBox.sendKeys("Hai");
	WebElement showMessagebtn=driver.findElement(By.xpath("//button [@id='button-one']"));
	showMessagebtn.click();
	WebElement yourMsgTxt=driver.findElement(By.xpath("//div [@id='message-one']"));
	System.out.println(yourMsgTxt.getText());
	System.out.println(showMessagebtn.getTagName());
	System.out.println(showMessagebtn.getCssValue("color"));
	//messageBox.clear();
}
	
	public static void main(String[] args) {
		WebElementCommand command= new WebElementCommand();
		command.initializeBrowser();
		command.verifyCommand();

	}

}
