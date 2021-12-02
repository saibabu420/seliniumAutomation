package Revision_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class All_tests {
	
	static WebDriver driver;
	String TestUrl="https://opensource-demo.orangehrmlive.com/";
	String UserName="Admin",Password="admin123";
	String skill_nameText ="sai";
	String skill_descriptionText ="saidescr";
	
	
	
	
@BeforeTest
  public void OpenChromeBrowser() throws Exception
    {System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().window().maximize() ;	
  }

@Test
public void login_test() throws Exception
  {
	
	All_tests T1= new All_tests();
	//T1.OpenChromeBrowser();
	T1.OpenOrangeHRM();
	T1.login(UserName,Password);
	T1.AddSkills(skill_nameText,skill_descriptionText);
	T1.CloseBrowser();
	
	
  }  

@AfterTest

	
	public void OpenOrangeHRM() throws Exception{
	
		driver.get(TestUrl);
	
	}
		public void login( String UserName ,String Password ) throws Exception{
			 driver.findElement(By.id("txtUsername")).sendKeys(UserName);
			 driver.findElement(By.id("txtPassword")).sendKeys(Password);
			 driver.findElement(By.id("btnLogin")).click();
		}	
			public void AddSkills(String skill_nameText ,String skill_descriptionText ) throws Exception{		
			   driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			   driver.findElement(By.id("menu_admin_Qualifications")).click();
			   driver.findElement(By.id("menu_admin_viewSkills")).click();
			   driver.findElement(By.id("btnAdd")).click();
			   driver.findElement(By.id("skill_name")).sendKeys(skill_nameText);
			   Thread.sleep(2000);
			   driver.findElement(By.id("skill_description")).sendKeys(skill_descriptionText);
			   Thread.sleep(2000);
			   driver.findElement(By.id("btnSave")).click();
			}
			

		       public void CloseBrowser() throws Exception{		
			
			   driver.quit();
			
		}
			

			
}