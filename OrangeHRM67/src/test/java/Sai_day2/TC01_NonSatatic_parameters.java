package Sai_day2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_NonSatatic_parameters {
	
	WebDriver driver;
	String UserName="Admin",Password="admin123";
	String jobTitle_jobTitle_Text="Indian800";
	
	
  @Test
  public void Logintest()  throws Exception
  {
	  
	  
	  
	  TC01_NonSatatic_parameters T1=new TC01_NonSatatic_parameters();
	  
	
	    T1.OpenBrowser();
		T1.Login(UserName,Password);
		T1.jobTitle_jobTitle(jobTitle_jobTitle_Text);
		T1.CloseBrowser();

	
}

private void jobTitle_jobTitle(String jobTitle_jobTitle_Text2) {
	// TODO Auto-generated method stub
	
}

public void OpenBrowser() throws Exception 
  { 
System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
driver =new ChromeDriver();
driver.manage().window().maximize() ;	
driver.get("https://opensource-demo.orangehrmlive.com/");
}

  public  void Login (String UserName,String Password) throws Exception  

{

	findElement(By.id("txtUsername")).sendKeys(UserName);
	findElement(By.id("txtPassword")).sendKeys(Password);
	findElement(By.id("btnLogin")).click();
}
public void Add_Nationalities (String jobTitle_jobTitle_Text ) throws Exception  
{
	
	findElement(By.id("menu_admin_viewAdminModule")).click();
	findElement(By.id("menu_admin_Job")).click();
	findElement(By.id("btnAdd")).click();
	findElement(By.id("jobTitle_jobTitle")).sendKeys(jobTitle_jobTitle_Text);
	findElement(By.id("jobTitle_jobDescription")).sendKeys( );
	findElement(By.id("jobTitle_note")).sendKeys( );
	
	
	
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



