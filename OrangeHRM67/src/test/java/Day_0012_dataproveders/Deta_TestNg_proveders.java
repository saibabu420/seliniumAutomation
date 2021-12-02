package Day_0012_dataproveders;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonUtil.TestBrowser;

public class Deta_TestNg_proveders {
	
static	WebDriver driver;
@DataProvider(name = "Orange1")
	  
public static Object[][] Test1() throws Exception {
	 	  
	  
	 return new Object[][] { 
     	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indians127" },
     	{ "https://opensource-demo.orangehrmlive.com/","Admin", "admin123","Indians128" }
     	
     	};
     	
     	
} 	
     	@Test(dataProvider = "Orange1") //step2 u r test will be connected to dataProvider 
     	public void Test1(String TestURL,String UserName,String Password,String Nationality) throws Exception {   
     		//step3 ensure number of parameters
     			
	
     		driver = TestBrowser.OpenChromeBrowser();
     	
     	
}

	  
	  
	  
	  
  }

