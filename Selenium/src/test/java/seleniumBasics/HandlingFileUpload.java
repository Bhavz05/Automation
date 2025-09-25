package seleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base {
	public void fileUploadUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement fileUploadbtn=driver.findElement(By.id("uploadfile_0pdf"));
		fileUploadbtn.sendKeys("C:\\Users\\user\\git\\Automation\\Selenium\\src\\test\\resources\\user story.pdf");
		WebElement checkBoxitem=driver.findElement(By.id("terms"));
		checkBoxitem.click();
		WebElement submitButton=driver.findElement(By.id("submitbutton"));
		submitButton.click();
	}
	public void fileUploadUsingRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		Robot robot=new Robot();
		WebElement filePickBtn=driver.findElement(By.id("pickfiles"));
		filePickBtn.click();
		StringSelection stringSelection=new StringSelection("C:\\Users\\user\\git\\Automation\\Selenium\\src\\test\\resources\\user story.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
	Robot r=new Robot();
	r.delay(2500);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFileUpload handlingFileUpload=new HandlingFileUpload();
		handlingFileUpload.initializeBrowser();
		//handlingFileUpload.fileUploadUsingSendKeys();
		try {
			handlingFileUpload.fileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
