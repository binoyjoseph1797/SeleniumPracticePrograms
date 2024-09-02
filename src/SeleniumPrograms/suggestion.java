package SeleniumPrograms;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class suggestion {

	public static void main(String[] args) {
		
		//browser Launch

				WebDriver driver=new ChromeDriver();

				System.out.println("INFO : ---> : Chrome Browser Launched Successfully");



				//To maximize

				driver.manage().window().maximize();

				System.out.println("INFO : ---> : Chrome Browser Maximized Successfully");

				

				//ImplictWait

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));



				//To pass PageURL

				driver.get("https://www.google.co.in");

				System.out.println("INFO : ---> : Page URL Passed Successfully");



				//To print Page Title

				String pageTitle= driver.getTitle();

				System.out.println("INFO : ---> : Page Title Captured Successfully as "+pageTitle);



				//To print Page URL

				String pageURL=driver.getCurrentUrl();

				System.out.println("INFO : ---> : Page URL Captured Successfully as "+pageURL);

				

				WebElement searchBar = driver.findElement(By.name("q"));

				

				searchBar.sendKeys("infomats");

				

				List<WebElement> totalList = driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/ul/li"));

				

				System.out.println(totalList.size());

				

				for(WebElement aa:totalList)

				{

					System.out.println(aa.getText());

				}

				

				for(WebElement aa:totalList)

				{

					if(aa.getText().contains("by owner"))

					{

						aa.click();

						break;

					}

				}

				

			}
	}
