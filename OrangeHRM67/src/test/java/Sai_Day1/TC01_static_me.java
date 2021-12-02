package Sai_Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_static_me {
	
	WebDriver driver;
	
  @Test
  public void testUntitledTestCase() throws Exception  {

  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize() ;	
		driver.get("https://opensource-demo.orangehrmlive.com/");
		 
		    driver.findElement(By.id("txtUsername")).click();
		    driver.findElement(By.id("txtUsername")).clear();
		    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		    
		    driver.findElement(By.id("txtPassword")).click();
		    driver.findElement(By.id("txtPassword")).clear();
		    driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		    
		    driver.findElement(By.id("btnLogin")).click();
		   
		    driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']/b")).click();
	
		    driver.findElement(By.id("menu_admin_Qualifications")).click();
		 
		    driver.findElement(By.id("menu_admin_viewSkills")).click();
		 

		    driver.findElement(By.id("btnAdd")).click();
		
		    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//form[@id='frmSave']/fieldset/ol/li/label/em | ]]
		    driver.findElement(By.id("skill_name")).clear();
		    driver.findElement(By.id("skill_name")).sendKeys("sai1");
		    
		    driver.findElement(By.id("skill_description")).click();
		    driver.findElement(By.id("skill_description")).clear();
		    driver.findElement(By.id("skill_description")).sendKeys("saidesrc1");
		    driver.findElement(By.id("btnSave")).click();

}
 }
