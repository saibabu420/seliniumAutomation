package Sai_day3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TCO1_StaticParameters_methode {
	
	 static     WebDriver driver;
	String UserName="Admin",Password="admin123";
	String Nationality_Text="Indian420";
	
	
  @Test
  public void logintest() throws Exception

  { 
	  
	  TCO1_StaticParameters_methode.OpenBrowser();
	  TCO1_StaticParameters_methode.Login(UserName,Password);
	  TCO1_StaticParameters_methode.Add_Nationalities(Nationality_Text);
	  TCO1_StaticParameters_methode.CloseBrowser();
	  
	  
  }
	  
  public static void OpenBrowser() throws Exception 
  {	  
	  
  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	driver =new ChromeDriver();
	driver.manage().window().maximize() ;	
	driver.get("https://opensource-demo.orangehrmlive.com/");
}
	  
  
public static void Login(String UserName1,String Password1) throws Exception
{
	findElement(By.id("txtUsername")).sendKeys(UserName1);
	findElement(By.id("txtPassword")).sendKeys(Password1);
	findElement(By.id("btnLogin")).click();
}

public static void Add_Nationalities(String Nationality_Text1) throws Exception
{
	findElement(By.id("menu_admin_viewAdminModule")).click();
	findElement(By.id("menu_admin_nationality")).click();
	findElement(By.id("btnAdd")).click();
	findElement(By.id("nationality_name")).sendKeys(Nationality_Text1);
	findElement(By.id("btnSave")).click();
}

public static void CloseBrowser() throws Exception
{
	driver.quit();
}




 public static  WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid black'", elem);
	 
		}
		return elem;
	}



}

