package SeleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents_Hover {

	public static void main(String[] args) throws InterruptedException {

		//browser Launch
		WebDriver driver=new ChromeDriver();
		System.out.println("INFO : ---> : Chrome Browser Launched Successfully");

		//To maximize
		driver.manage().window().maximize();
		System.out.println("INFO : ---> : Chrome Browser Maximized Successfully");

		//ImplictWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		//To pass PageURL
		driver.get("https://www.naukri.com/");
		System.out.println("INFO : ---> : Page URL Passed Successfully");

		//To print Page Title
		String pageTitle= driver.getTitle();
		System.out.println("INFO : ---> : Page Title Captured Successfully as "+pageTitle);

		//To print Page URL
		String pageURL=driver.getCurrentUrl();
		System.out.println("INFO : ---> : Page URL Captured Successfully as "+pageURL);
		
		Actions act=new Actions(driver);//Create an Object for Actions class and pass the webdriver reference name as argument

		//To find WebElement
		WebElement jobsLink=driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/nav/ul/li[1]/a/div"));

		act.moveToElement(jobsLink).perform();

		Thread.sleep(2000);

		WebElement mncJobsLink = driver.findElement(By.xpath("/html/body/div[1]/div[4]/div[2]/nav/ul/li[1]/div/ul[2]/li[3]/a/div"));

		act.click(mncJobsLink).perform();

		}

}
