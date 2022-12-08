package week2.day1.java;

/*
Assignment:3

Open the browser
Load the URL
Maximize the browser
Enter UserName
Enter Password
Click Login
Click CRM/SFA
Click Contacts Tab
Click Create Contact
Type First Name
Type Last Name
Click Create Contact Button
Print the first name and browser title 
Close the browser
 */
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {

			public static void main (String[] args) {
				ChromeDriver driver = new ChromeDriver();
				System.out.println(driver);
				driver.get("http:leaftaps.com/opentaps");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(By.id("username")).sendKeys("DemoCSR");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//Thread.sleep(2000);
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Contacts")).click();
				driver.findElement(By.linkText("Create Contact")).click();
				driver.findElement(By.id("firstNameField")).sendKeys("SASIREKHA");
				driver.findElement(By.id("lastNameField")).sendKeys("KOSALRAM");
				driver.findElement(By.className("smallSubmit")).click();
				System.out.println( driver.getTitle());
				driver.close();
				
	}
	
}
