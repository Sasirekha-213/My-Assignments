package week2.day1.java;
/*
 Assignment No.1
          1. Launch URL http:leaftaps.com/opentaps/control/login
		  2. Enter UserName and Password Using Id Locator
                   username: DemoCSR
                   password : crmsfa
		  3. Click on Login Button using Class Locator
		  4. Click on CRM/SFA Link
		  5. Click on Leads Button
		  6. Click on Create Lead 
		  7. Enter CompanyName Field Using id Locator
		  8. Enter FirstName Field Using id Locator
		  9. Enter LastName Field Using id Locator
		  10. Enter FirstName(Local) Field Using id Locator
		  11. Enter Department Field Using any Locator of Your Choice
		  12. Enter Description Field Using any Locator of your choice 
		  13. Enter your email in the E-mail address Field using the locator of your choice
		  14. Click on Create Button
          15. Get the Title of Resulting Page. 
 */

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	
		public static void main (String[] args) {
			ChromeDriver driver = new ChromeDriver();
			System.out.println(driver);
			driver.get("http:leaftaps.com/opentaps");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(By.id("username")).sendKeys("DemoCSR");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			//Thread.sleep(2000);
			driver.findElement(By.linkText("CRM/SFA")).click();
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SASI ASSOCIATES");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SASIREKHA");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KOSALRAM");
			driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("SAI");
			driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("TESTING");
			driver.findElement(By.name("description")).sendKeys("THIS IS A TESTING FIRM");
			driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sasi.structures@gmail.com");
			driver.findElement(By.className("smallSubmit")).click();
			System.out.println(driver.getTitle());
			//driver.close();
}
}
