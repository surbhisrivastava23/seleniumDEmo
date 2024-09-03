package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.BaseLibrary;

public class homePage extends BaseLibrary{

	public homePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='What We Do']")
	private WebElement whatWedo;
	

	public void clickoncwhatWedo() {
		whatWedo.click();
		
		
}
}