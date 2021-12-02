package Day15_Parallel_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Add_jobs {
	WebDriver driver;
	
	
  @Test
  public void parallel_methods() {
	  
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_Qualifications")).click();
		driver.findElement(By.id("menu_admin_viewSkills")).click();
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("skill_name")).sendKeys("harika");
		driver.findElement(By.id("skill_description")).sendKeys("harikadescr");
		driver.findElement(By.id("btnSave")).click();
		
		  
	
  }	@Test(dependsOnMethods = { "parallel_methods" })
		public void parallel_methods2() throws Exception {
			
	    driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("Nationalities")).click();
		driver.findElement(By.name("btnAdd")).click();
		
		
		driver.findElement(By.id("nationality_name")).sendKeys("Mexican55");
		
		driver.findElement(By.name("btnSave")).click();
		driver.quit();
	  
	  
  }
}
