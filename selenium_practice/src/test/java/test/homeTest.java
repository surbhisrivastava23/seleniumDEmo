package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibrary.BaseLibrary;
import pages.homePage;


public class homeTest extends BaseLibrary{

	homePage ob;
	
	@BeforeTest
	
	public void urlLaunch() {		
	        launchurl();	
			ob=	new homePage();
	}	
	
	@Test
	
	public void clickonwhatWedo()
	
	{
		ob.clickoncwhatWedo();
	}
}
