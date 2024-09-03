package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLibrary.BaseLibrary;

public class WhatWedopage extends BaseLibrary {
	
 public	WhatWedopage() {
	 PageFactory.initElements(driver, this);
 }
 
@FindBy(xpath="//a[text()='What We Do']")
private WebElement whatWedo;
	
 
 @FindBy(xpath="//a[text()='Software']")
 private WebElement software;
 
 @FindBy(xpath="//a[text()='CRM Solution']")
 private WebElement crmSolution;
 
 
 
@FindBy(xpath="//a[@href='https://www.digilantern.com/services/mobile-app/']")
private WebElement mobileapp;

public void clickoncwhatWedo() {
whatWedo.click();
}
		
public void clickonSoftware() {
	movingdropdown(whatWedo);
	clicKme(software);
	}

public void clickoncrmSoftware() {
	movingdropdown(whatWedo);
	clicKme(crmSolution);
	
}

public void clickonMobileapp() {
	movingdropdown(whatWedo);
	clicKme(mobileapp);
}

}
