package SeleniumPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents_DragDrop {

public static void main(String[] args) {

//browser Launch
WebDriver driver=new ChromeDriver();
System.out.println("INFO : ---> : Chrome Browser Launched Successfully");

//To maximize
driver.manage().window().maximize();
System.out.println("INFO : ---> : Chrome Browser Maximized Successfully");

//ImplictWait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

//To pass PageURL
driver.get("https://jqueryui.com/droppable/");
System.out.println("INFO : ---> : Page URL Passed Successfully");

//To print Page Title
String pageTitle= driver.getTitle();
System.out.println("INFO : ---> : Page Title Captured Successfully as "+pageTitle);

//To print Page URL
String pageURL=driver.getCurrentUrl();
System.out.println("INFO : ---> : Page URL Captured Successfully as "+pageURL);

//This line is not related to mouse events
driver.switchTo().frame(0);//This is used to switch the driver into frame


//To find WebElement
WebElement fromPlace=driver.findElement(By.id("draggable"));

WebElement toPlace = driver.findElement(By.id("droppable"));

Actions act=new Actions(driver);//Create an Object for Actions class and pass the webdriver reference name as argument

act.dragAndDrop(fromPlace, toPlace).perform();
}

}