package week2.day2.java;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	/*
	 * Assignment : 2
	 * http://leaftaps.com/opentaps/control/main
	* 1	Launch the browser
	* 2	Enter the username
	* 3	Enter the password
	* 4	Click Login
	* 5	Click crm/sfa link
	* 6	Click Leads link
	* 7	Click Find leads
	* 8	Enter first name
	* 9	Click Find leads button
	* 10 Click on first resulting lead
	* 11 Verify title of the page
	* 12 Click Edit
	* 13 Change the company name
	* 14 Click Update
	* 15 Confirm the changed name appears
	* 16 Close the browser (Do not log out)
	*/

			public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			
			driver.findElement(By.id("username")).sendKeys("DemoCSR");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
		    driver.findElement(By.linkText("Leads")).click();
		    driver.findElement(By.linkText("Find Leads")).click();
		    driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("SASI");
		    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		    driver.findElement(By.xpath("(//a[text()='SASIREKHA'])[6]")).click();
		    System.out.println(driver.getTitle());
		    driver.findElement(By.xpath("//a[text()='Edit']")).click();
		    driver.findElement(By.xpath("//input[@value='SASI ASSOCIATES']")).clear();
		    driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("SAI ASSOCIATES");
		    driver.findElement(By.className("smallSubmit")).click();
		    System.out.println(driver.findElement(By.id("viewLead_companyName_sp")).getText());
		   
		    driver.close();
		    		
			}
}
