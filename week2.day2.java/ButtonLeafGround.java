package week2.day2.java;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ButtonLeafGround {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver= new ChromeDriver();
	driver.get("https://www.leafground.com/button.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	//Click and getTitle of that page:
	driver.findElement(By.xpath("//span[text()='Click']")).click();
	System.out.println("The title is = " +driver.getTitle());
	if(driver.getTitle().contains("Dashboard"))
	System.out.println("Title confirmed");
	else
	System.out.println("Title mismatch");

	driver.navigate().back();

	//find button is enabled or not:
	boolean button =driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
	if(button==false)
	System.out.println("Button is Disabled");
	else
	System.out.println("Button is Enabled");

	//Getting location of a button
	WebElement position =driver.findElement(By.xpath("//span[text()='Submit']"));
	System.out.println("The location of submit button is : " +position.getLocation());

	//Background color
	WebElement color=driver.findElement(By.id("j_idt88:j_idt96"));
	System.out.println("The color of save button : " +color.getCssValue("background-color"));

	//Click image and hidden link
	driver.findElement(By.id("j_idt88:j_idt102:imageBtn")).click();
	driver.findElement(By.id("j_idt88:j_idt102:j_idt104")).click();

	//find height and width of a button
	WebElement height =driver.findElement(By.xpath("(//span[text()='Submit'])[2]"));
	System.out.println("Height and width of sumbit button : " +height.getSize());
	Thread.sleep(2000);


	//Click Image Button and Click on any hidden button
	WebElement image = driver.findElement(By.xpath("//button/span[text()='Image']"));
	image.click();
	driver.findElement(By.xpath("//button[contains(@class,'ui-state-hover')]")).click();
	Thread.sleep(2000);
	System.out.println("Hidden button is clicked");


	//verify color is changed
	WebElement colorChange = driver.findElement(By.id("j_idt88:j_idt100"));
	//Thread.sleep(2000);
	String before = colorChange.getCssValue("background-color");
	//System.out.println("Color of success-button before : " +before);
	Actions act=new Actions(driver);
	act.moveToElement(colorChange).perform();
	Thread.sleep(2000);
	String after = colorChange.getCssValue("background-color");
	//System.out.println("Color of success-button after : " +after);
	if(after==(before))
	System.out.println("Color of Success button not changed");
	else
	System.out.println("Color of Success button changed");

	//Find out number round-shaped button available
	List<WebElement> roundButton = driver.findElements(By.xpath("//button[contains(@class,' ui-button-text-only rounded-button')]"));
	System.out.println("Number of rounded buttons available : " +roundButton.size());


	}

}
