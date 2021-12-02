package Day16_priorities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_priorities_order {
	
static	WebDriver driver;
  @Test (priority=1)
  public void test1_openchromebrowser() {
	  
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;
  }	
		
 @Test (priority=2)
 
 public void test2_openorangehrm() {
  
	 String TestURL = "https://opensource-demo.orangehrmlive.com/";
		driver.get(TestURL);
		
 }
 @Test (priority=3)
 public void test3_login()throws Exception  {
	 
	    findElement(By.name("txtUsername")).sendKeys("Admin");
		findElement(By.name("txtPassword")).sendKeys("admin123");
		findElement(By.name("Submit")).click();
  }
 
 @Test (priority=4)
 public void Test4_Addnatialities()throws Exception  {
	 
		findElement(By.linkText("Admin")).click();
		findElement(By.linkText("Nationalities")).click();
		findElement(By.name("btnAdd")).click();
		findElement(By.id("nationality_name")).sendKeys("Kenyas212");
		findElement(By.id("btnSave")).click();
	 
	 
 }

 @Test(priority=5)
 
 public void Test5_Logout()throws Exception  {
 
	    findElement(By.id("welcome")).click();	 
		Thread.sleep(300);
		 findElement(By.linkText("Logout")).click();
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
 

	
 

