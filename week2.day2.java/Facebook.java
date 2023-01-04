package week2.day2.java;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	//Assignment:1
	//FaceBook:
	/*Step 1: Download and set the path 
	  Step 2: Launch the chromebrowser
	  Step 3: Load the URL https://en-gb.facebook.com/
	  Step 4: Maximise the window
	  Step 5: Add implicit wait
	  Step 6: Click on Create New Account button
	  Step 7: Enter the first name
	  Step 8: Enter the last name
	  Step 9: Enter the mobile number
	  Step 10: Enterthe password
	  Step 11: Handle all the three drop downs
	  Step 12: Select the radio button "Female" 
	 ( A normal click will do for this step)
	 */

			public static void main(String[] args) {
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://en-gb.facebook.com/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
				driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("SASIREKHA");
				driver.findElement(By.name("lastname")).sendKeys("KOSALRAM");
				driver.findElement(By.name("reg_email__")).sendKeys("9844675675");
				driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("testleaf@213");
				
				WebElement Date=driver.findElement(By.id("day"));
				if(Date.isDisplayed() && Date.isEnabled() ) {
					Select info=new Select(Date);
					info.selectByIndex(0);}
				
				WebElement month=driver.findElement(By.id("month"));
				Select info1=new Select(month);
				info1.selectByValue("12");
				
				WebElement year=driver.findElement(By.id("year"));
				Select info2=new Select(year);
				info2.selectByVisibleText("2000");
				
				WebElement Check=driver.findElement(By.xpath("//input[@type='radio']"));
				Check.click();
				boolean D=Check.isSelected();
				System.out.println(" radio button is selected/not: "+ D);
				
				
			}

}
