package Sai_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_NonSatatic_parameters2 {
	
	WebDriver driver;
	String UserName="Admin",Password="admin123";
	String Nationality_Text="Indian800";
	
	
  @Test
  public void Logintest()  throws Exception
  {
	  
	  
	  
	  TC01_NonSatatic_parameters2 T1=new TC01_NonSatatic_parameters2();
	  
	
	    T1.OpenBrowser();
		T1.Login(UserName,Password);
		T1.Add_Nationalities(Nationality_Text);
		T1.CloseBrowser();
   
	  
  
	  
  }

  public void OpenBrowser() throws Exception 
  { 
System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
driver =new ChromeDriver();
driver.manage().window().maximize() ;	
driver.get("https://opensource-demo.orangehrmlive.com/");
}

  public  void Login (String publicUserName1,String Password1) throws Exception  

{

	findElement(By.id("txtUsername")).sendKeys(UserName);
	findElement(By.id("txtPassword")).sendKeys(Password);
	findElement(By.id("btnLogin")).click();
}
public void Add_Nationalities (String nationality_Text2) throws Exception  
{
	
	findElement(By.id("menu_admin_viewAdminModule")).click();
	findElement(By.id("menu_admin_nationality")).click();
	findElement(By.id("btnAdd")).click();
	findElement(By.id("nationality_name")).sendKeys(Nationality_Text);
	findElement(By.id("btnSave")).click();
	
	
	
}
public void CloseBrowser() throws Exception
{
	driver.quit();
}




 public  WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}



}



