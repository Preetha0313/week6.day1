package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

     public class BaseClass {
    	 
    	 public ChromeDriver driver;
	
	 @BeforeMethod
	 public void preCondition() {
		WebDriverManager.chromedriver().setup();
	      driver = new ChromeDriver();
	      driver.get("http://leaftaps.com/opentaps/control/login");
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      WebElement eleUserName = driver.findElement(By.xpath("//input[@id='username']"));
	      eleUserName.sendKeys("DemoSalesManager");
	      driver.findElement(By.xpath("//input[@id= 'password']")).sendKeys("crmsfa");
	      driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
	    
	}
	 
	 @AfterMethod
	 public void postCondition() {
		 driver.close();
	 }
	 
	 
	 
	

}
