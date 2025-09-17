package seleniumBasics;

public class BrowserCommand extends Base{
public void verifyBrowser()
{
	String Title=driver.getTitle();
	System.out.println(Title);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String source=driver.getPageSource();
	System.out.println(source);
}
public void VerifyNavigation()
{
	driver.navigate().to("https://www.amazon.com/");
	driver.navigate().back();
	driver.navigate().forward();
	driver.navigate().refresh();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BrowserCommand browser=new BrowserCommand();
browser.initializeBrowser();
browser.verifyBrowser();
browser.VerifyNavigation();
	}

}
