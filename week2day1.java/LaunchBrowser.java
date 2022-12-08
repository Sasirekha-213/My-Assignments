package week2.day1.java;

//Classroom:1
	//Instantiate the driver
	//Launch the browser
	//Load the url: http://leaftaps.com/opentaps

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {	
		
		public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/");
	}
	
}
