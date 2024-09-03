package BaseLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import ApplicationUtility.applicationautiliTY;

public class BaseLibrary implements applicationautiliTY {
	
	public static WebDriver driver = null;

	public void launchurl() {
		String path="C:\\Users\\Surbhi\\eclipse-workspace\\selenium_practice\\webDriver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",path);
		 driver = new ChromeDriver();
		 driver.get("https://www.digilantern.com/");
		 driver.manage().window().maximize();
	}

	@Override
	public void movingdropdown(WebElement ele) {
		Actions act =new Actions(driver);
		act.moveToElement(ele).build().perform();
		
	}

	@Override
	public void clicKme(WebElement ele) {
		Actions act=new Actions(driver);
		act.click(ele).perform();
		
	}
	
}
