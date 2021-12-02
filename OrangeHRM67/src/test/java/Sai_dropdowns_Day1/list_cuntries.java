package Sai_dropdowns_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class list_cuntries {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize() ;	
	   String TestURL = "http://newtours.demoaut.com/";  
	  
	   driver.get(TestURL);
	  
	   driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		
		
		   
		
		
		
		
		
		
		
		
		
		
	  
  }
}
