package SeleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingToClick {

	public static void main(String[] args) throws InterruptedException {
		
			//browser Launch
			WebDriver driver=new ChromeDriver();
			System.out.println("INFO : ---> : Chrome Browser Launched Successfully");

			//To maximize
			driver.manage().window().maximize();
			System.out.println("INFO : ---> : Chrome Browser Maximized Successfully");
			
			//ImplictWait
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			//To pass PageURL
			driver.get("https://www.facebook.com/legal/terms/update");
			System.out.println("INFO : ---> : Page URL Passed Successfully");

			//To print Page Title
			String pageTitle= driver.getTitle();
			System.out.println("INFO : ---> : Page Title Captured Successfully as "+pageTitle);

			//To print Page URL
			String pageURL=driver.getCurrentUrl();
			System.out.println("INFO : ---> : Page URL Captured Successfully as "+pageURL);
			
			WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div/div[2]/ul/li[7]/a"));
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView();",element);
			
			Thread.sleep(2000);
			js.executeScript("arguments[0].click();",element);
			
		}
	}




