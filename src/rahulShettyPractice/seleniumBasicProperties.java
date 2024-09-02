package rahulShettyPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumBasicProperties {

	static WebDriver chromeDriver;
    static Select dropdown;
    static final ChromeOptions chromeOptions = new ChromeOptions();
	static final WebDriverWait wait=new WebDriverWait(chromeDriver, Duration.ofSeconds(10));


	static final void startMaximized() {
		chromeOptions.addArguments("--start-maximized");
		chromeDriver = new ChromeDriver(chromeOptions);
	}
	
	static final void implicitWait() {
		chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	static final void getUrl(String url) {
		chromeDriver.get(url);
	}

}
