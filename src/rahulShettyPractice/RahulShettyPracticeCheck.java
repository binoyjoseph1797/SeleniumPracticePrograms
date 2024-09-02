package rahulShettyPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RahulShettyPracticeCheck extends seleniumBasicProperties {

	public static void clickRadioButtons() throws InterruptedException {
		WebElement Radio1 = chromeDriver.findElement(By.xpath("//input[@value='radio1']"));
		Radio1.click();
		WebElement Radio2 = chromeDriver.findElement(By.xpath("//input[@value='radio2']"));
        Radio2.click();
		Thread.sleep(2000);
		WebElement Radio3 = chromeDriver.findElement(By.xpath("//input[@value='radio3']"));
        Radio3.click();
	}

	public static void suggestionCheck(String suggestionWord) {
		WebElement suggestionText = chromeDriver.findElement(By.xpath("//input[@id='autocomplete']"));
		suggestionText.click();
		suggestionText.sendKeys(suggestionWord);
		List<WebElement> listOfSuggestion=chromeDriver.findElements(By.xpath("//ul[@class='ui-menu ui-widget ui-widget-content ui-autocomplete ui-front']/li"));
		for(WebElement suggestion:listOfSuggestion){
			if(suggestion.getText().contains("British Indian Ocean Territory")){
				suggestion.click();
				break;
			}
		}
	}

	public static void closeDriver() {
	     chromeDriver.close();
	}

	public static void selectOptions(String selectXpath) throws InterruptedException {
		WebElement selectOptions = chromeDriver.findElement(By.xpath(selectXpath));
		dropdown = new Select(selectOptions);
		 List<WebElement> options = dropdown.getOptions();
		 int optionsCount = options.size();
		 for(int i=0; i<optionsCount; i++) {
			 dropdown.selectByIndex(i);
			 }
		 Thread.sleep(2000);
		 }

	public static void openWindow() {
     		WebElement openWindow = chromeDriver.findElement(By.xpath("//button[@id='openwindow']"));
     		openWindow.click();
     		String originalWindow = chromeDriver.getWindowHandle();
     		Set<String> allWindows = chromeDriver.getWindowHandles();
    		ArrayList<String> list=new ArrayList<>(allWindows);
    		chromeDriver.switchTo().window(list.get(1));
            System.out.println("Title of the new window: " + chromeDriver.getTitle());
    		chromeDriver.close();
    		chromeDriver.switchTo().window(originalWindow);
	}

	public static void main(String[] args) throws InterruptedException {

		startMaximized();
		implicitWait();
		getUrl("https://rahulshettyacademy.com/AutomationPractice/");
		RahulShettyPracticeCheck.clickRadioButtons();
		suggestionCheck("ind");
		selectOptions("//select[@id='dropdown-class-example']");
		openWindow();
		closeDriver();
	}
}
