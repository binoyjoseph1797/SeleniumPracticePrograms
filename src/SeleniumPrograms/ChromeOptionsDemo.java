package SeleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {

	public static void main(String[] args) {
		
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");
//		
//		WebDriver driver = new ChromeDriver(options);
//		System.out.println("INFO : ---> : Chrome Browser Launched Successfully");
//
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		
//		driver.manage().window().maximize();
//		System.out.println("INFO : ---> : Chrome Browser Maximized Successfully");
//		
//		driver.get("https://www.facebook.com");
//		System.out.println("INFO : ---> : Page URL Passed Successfully");
//		
//		driver.close();
		 ChromeOptions options = new ChromeOptions();
	        
	        // Add the start-maximized argument
	        options.addArguments("--start-maximized");

	        // Initialize the ChromeDriver with the options
	        WebDriver driver = new ChromeDriver(options);

	        // Open a website
	        driver.get("https://www.example.com");

	        // Your test code here

	        // Close the browser
	        driver.quit();

	}

}
