package SeleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
	//	options.addArguments("--incognito");
		options.addArguments("--start-maximized","--incognito");
		options.addArguments("--start-maximized","--disable-notifications");
		
		WebDriver driver = new ChromeDriver(options);
		System.out.println("INFO : ---> : Chrome Browser Launched Successfully");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		System.out.println("INFO : ---> : Chrome Browser Maximized Successfully");
		
		driver.get("https://www.facebook.com");
		System.out.println("INFO : ---> : Page URL Passed Successfully");
		
		driver.close();

	}

}
