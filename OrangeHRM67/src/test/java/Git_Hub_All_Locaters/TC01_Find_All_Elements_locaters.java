package Git_Hub_All_Locaters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Find_All_Elements_locaters {
	
	WebDriver driver;
  @Test
  public void find_all_locaters()  throws Exception {
	  
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("http://github.com/login");
	 
		findElement(By.id("login_field")).click();
		Thread.sleep(300);
		findElement(By.name("password")).click();
		Thread.sleep(300);
		findElement(By.className("header-logo")).click();
		Thread.sleep(300);
		findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(300);
		findElement(By.partialLinkText("Create an")).click();
		Thread.sleep(300);
		findElement(By.tagName("h1")).click();
		Thread.sleep(300);
		findElement(By.xpath("//label[contains(text(),'username or email address')]"));
		Thread.sleep(300);
		findElement(By.cssSelector("input[name='commit']"));
		Thread.sleep(300);
		
		
		
		
		
		
  
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