package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base {
public void verifyDropDown()
{
	driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement selecttag=driver.findElement(By.id("dropdowm-menu-1"));
	Select select = new Select(selecttag);
	//select.selectByIndex(2);
	select.selectByValue("python");
	//select.selectByVisibleText("SQL");
}
public void  verifyCheckBox()
{
	driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement checkOption=driver.findElement(By.xpath("//input[@value='option-1']"));
	checkOption.click();	
}
public void verifyRadioButton()
{
	driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement radioButton=driver.findElement(By.xpath("//input[@value='green']"));
	radioButton.click();
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
HandlingDropdown dropdown=new HandlingDropdown();
dropdown.initializeBrowser();
//dropdown.verifyDropDown();
//dropdown.verifyCheckBox();
dropdown.verifyRadioButton();
	}

}
