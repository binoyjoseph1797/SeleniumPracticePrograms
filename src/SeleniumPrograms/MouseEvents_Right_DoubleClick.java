package SeleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents_Right_DoubleClick {

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

		driver.get("https://demo.guru99.com/test/simple_context_menu.html");

		System.out.println("INFO : ---> : Page URL Passed Successfully");

		//To print Page Title

		String pageTitle= driver.getTitle();

		System.out.println("INFO : ---> : Page Title Captured Successfully as "+pageTitle);

		//To print Page URL

		String pageURL=driver.getCurrentUrl();

		System.out.println("INFO : ---> : Page URL Captured Successfully as "+pageURL);

		//To find WebElement

		WebElement rightClickButton=driver.findElement(By.xpath("/html/body/span"));

		WebElement doubleClickButton = driver.findElement(By.xpath("/html/body/button"));

		Actions act=new Actions(driver);//Create an Object for Actions class and pass the webdriver reference name as argument 

		act.contextClick(rightClickButton).perform();

		WebElement rightClickOption = driver.findElement(By.xpath("/html/body/ul/li[3]"));

		act.click(rightClickOption).perform();

		Alert alt = driver.switchTo().alert();

		System.out.println(alt.getText());

		alt.accept();

		Thread.sleep(3000);

		act.doubleClick(doubleClickButton).perform();

		System.out.println(alt.getText());

		alt.accept();

	}

}