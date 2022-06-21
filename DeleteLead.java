package week6.day2;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

    public class DeleteLead extends BaseClass{
	
    @Test
	public void createLead3() throws InterruptedException
	{
	
	  //Click crm/sfa link
      driver.findElement(By.linkText("CRM/SFA")).click();
      //Click Leads link
      driver.findElement(By.linkText("Leads")).click();
      //Click Find leads
      driver.findElement(By.linkText("Find Leads")).click();
      //Click on Phone
      driver.findElement(By.xpath("//span[text()='Phone']")).click();
      //Enter phone number
      driver.findElement(By.name("phoneNumber")).sendKeys("9095326910");
      //Click find leads button
      driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
      driver.findElement(By.linkText("Find Leads")).click();
      Thread.sleep(2000);
      String  i= driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
      System.out.println(i);
      Thread.sleep(2000);
      //Click First Resulting lead
      driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
      //Click Delete
      driver.findElement(By.linkText("Delete")).click();
      //Click Find leads
      driver.findElement(By.linkText("Find Leads")).click();
      //Enter captured lead ID
      driver.findElement(By.xpath("//input[@name='id']")).click();
      //Click find leads button
       driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
       //Verify message "No records to display" in the Lead List. This message confirms the successful deletion
      if(driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).isDisplayed())
     {
    	 
     
    	 System.out.println("No Records found");
     }
     
     else 
     
     {
    	 System.out.println("Records are displayed");
    	 
     }
      //Close the browser (Do not log out)
     
    //  driver.close();
     }
}


