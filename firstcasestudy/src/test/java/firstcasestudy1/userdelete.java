package firstcasestudy1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class userdelete {
	
	String address="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	  WebDriver driver;
	 @BeforeTest
	 public void beforetest() throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
			driver.get(address);
			driver.manage().window().maximize();
			String beforelogin=driver.getCurrentUrl();
			System.out.println(beforelogin);
			Thread.sleep(3000);
	 }
	
	 @Test(priority=0)
		public void Testcase1() throws InterruptedException {
			
			
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);		
					
		}
	 @Test(priority=1)
	          public void Testcase2() throws InterruptedException{
	 	      List<WebElement>ch= driver.findElements(By.tagName("a"));
	 	
	 	      System.out.println("Total no of checkboxes:"+ch.size());
	 	      for(int i=0;i<ch.size();i++){
	 		  System.out.println("Total no of Links are " +ch.get(i).getText());
	 	}
	 }
	@Test(priority=2)
		  public void Testcase3() throws InterruptedException
	     {
		 // driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[2]/a")).click();
		  Thread.sleep(5000);
		 // driver.findElements(By.xpath("//*[@class='oxd-table-card']")).get(3).click();
		  Thread.sleep(3000);
		  driver.findElements(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).get(6).click();
		  Thread.sleep(3000);
		  driver.findElements(By.xpath("//*[@class='oxd-icon bi-trash']")).get(6).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']")).click();
		  driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
		 	Thread.sleep(5000);
		 	driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
}
	@AfterTest
	     public void bt() throws InterruptedException {
		 Thread.sleep(3000);
		// driver.close();
	}
}
