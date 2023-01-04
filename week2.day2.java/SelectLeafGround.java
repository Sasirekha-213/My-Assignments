package week2.day2.java;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectLeafGround {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
 WebElement Tool=driver.findElement(By.className("ui-selectonemenu"));
 Select A=new Select(Tool);
 A.selectByVisibleText("Selenium");
 driver.findElement(By.xpath("//button[contains(@class,'ui-button')]")).click();
 driver.findElement(By.xpath("//li[@role='option']")).click();
 
//Choose your preferred country		
driver.findElement(By.xpath("//div[@id='j_idt87:country']")).click();
WebElement country=driver.findElement(By.xpath("(//div//li[@role='option'])[4]"));
country.click();
System.out.println("country selected are== "+ country.getText());

//City chosen options
Thread.sleep(5000);
WebElement Check=driver.findElement(By.xpath("//select[@id='j_idt87:city_input']"));
Select City=new Select(Check);
System.out.println("Cities belong to country loaded are==");
List<WebElement> list=City.getOptions();
System.out.println(list.size());
for(WebElement Each:list)
{ System.out.println(Each.getAttribute("value"));}

//Choose confirm cities belong to Country is loaded

driver.findElement(By.xpath("//div[@id='j_idt87:city']")).click();
driver.findElement(By.xpath("//li[text()='Select City']/following::li")).click();
 
 //Choose language randomly
driver.findElement(By.xpath("(//div[@role='combobox'])[3]")).click();
driver.findElement(By.xpath("(//li[text()='Select Language']/following-sibling::li)[1]")).click();

//language chosen options
Thread.sleep(5000);
WebElement Check1=driver.findElement(By.xpath("//select[@id='j_idt87:value_input']"));
Select Numbers=new Select(Check1);
List<WebElement> list1=Numbers.getOptions();
System.out.println("nos based on lang are==");
System.out.println(list1.size());
for(WebElement Each:list1)
	{System.out.println(Each.getAttribute("value"));}

//Select 'Two' irrespective of the language chosen
driver.findElement(By.xpath("//div[@id='j_idt87:value']")).click();
driver.findElement(By.xpath("(//li[text()='Select Values']/following::li)[3]")).click();

	}
}
