package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact extends BaseClass{
	
	@Test
	public void createContact1() throws InterruptedException
	{
		
	driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Contacts")).click();
    driver.findElement(By.linkText("Create Contact")).click();
    driver.findElement(By.id("firstNameField")).sendKeys("Preetha");
    driver.findElement(By.id("lastNameField")).sendKeys("M");
    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Local Name");
    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Local Name");
    driver.findElement(By.id("createContactForm_departmentName")).sendKeys("core department");
    driver.findElement(By.id("createContactForm_description")).sendKeys("Grow With Test Leaf");
    driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("preethamahadevan1997@gmail.com");
    WebElement dtSource = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
    Select data = new Select(dtSource);
    Thread.sleep(2000);
    data.selectByVisibleText("New York");
    driver.findElement(By.name("submitButton")).click();
    driver.findElement(By.linkText("Edit")).click();
    driver.findElement(By.id("updateContactForm_description")).clear();
    driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Most important to use Test Leaf");
    driver.findElement(By.xpath("//input[@name='submitButton']")).click();
    System.out.println("The title is :"+ driver.getTitle());
    
    }

}



