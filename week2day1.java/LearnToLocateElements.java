package week2.day1.java;
/*
ClassRoom:2
1. Launch http://leaftaps.com/opentaps
2. Enter username as DemoCSR
3. Enter password as crmsfa
4. Click on Login
5. Click on CRM/SFA
6. Click on Leads
7. Click on Create Lead
8. Enter CompanyName
9. Enter FirstName
10. Enter LastName
11. Click on CreateLead button
12.Verify the title(getTitle)
 */
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnToLocateElements {

		public static void main (String[] args) {
			ChromeDriver driver = new ChromeDriver();
			System.out.println(driver);
			driver.get("http:leaftaps.com/opentaps");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("DemoCSR");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.linkText("CRM/SFA")).click();
		
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Create Lead")).click();
			
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SASI ASSOCIATES");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("SASIREKHA");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("KOSALRAM");
			driver.findElement(By.className("smallSubmit")).click();
			System.out.println(driver.getTitle());
			//driver.close();
			
		}
	
}
