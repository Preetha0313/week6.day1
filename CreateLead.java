package week6.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {
	
	@Test
	public void createLead2() throws InterruptedException
	
	 {
		  driver.findElement(By.linkText("CRM/SFA")).click();
	      driver.findElement(By.linkText("Leads")).click();   
	      driver.findElement(By.linkText("Create Lead")).click();
	      driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
	      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Preetha");
	      driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
	      driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Local Name");
	      driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("core department");
	      driver.findElement(By.id("createLeadForm_description")).sendKeys("Grow With Test Leaf");
	      driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("preethamahadevan1997@gmail.com");
	      WebElement eleSource = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	      Select obj = new Select(eleSource);
	      Thread.sleep(2000);
	      obj.selectByVisibleText("New York");
	      driver.findElement(By.name("submitButton")).click();
	      System.out.println("The title is :"+ driver.getTitle());
	      System.out.println("Create Lead");
	      }
}
	



