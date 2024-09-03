package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseLibrary.BaseLibrary;
import pages.WhatWedopage;


public class whatwedoTest extends BaseLibrary{
	
	WhatWedopage ob;
   @BeforeTest
	
	public void urlLaunch() {		
	launchurl();	
	ob=	new WhatWedopage ();
	}	
	
	@Test
	
	public void whatWedo()
	
	{
		ob.clickoncwhatWedo();
	}
	
   @Test
	public void software() 
   {
	  ob.clickonSoftware(); 
   }
   
   @Test
  	public void crmsoftware() 
   {
  	  ob.clickoncrmSoftware(); 
     }
   
   @Test
 	public void mobileapp() {
 	  ob.clickonMobileapp(); 
    }
}
