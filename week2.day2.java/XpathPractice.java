package week2.day2.java;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class XpathPractice {
	
    		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("DemoCSR");
			driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
			driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
			driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();
			driver.findElement(By.xpath("//a[text()='Leads']")).click();
			driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();
			driver.findElement(By.xpath("//input[contains(@class,'input')]")).sendKeys("SAMPLE");
			driver.findElement(By.xpath("//input[contains(@id,'firstName')]")).sendKeys("Sasirekha");
			driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Kosalram");
			
			WebElement Details=driver.findElement(By.xpath("//select[@name='dataSourceId']"));
			Select info=new Select(Details); 
		    info.selectByIndex(7);
			
			driver.findElement(By.xpath("//input[contains(@name,'submit')]")).click();
			
			}

}
