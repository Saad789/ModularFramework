package P5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OperationalMethods {
	   WebDriver driver;
	   public void RunBrowser() {
	   System.setProperty("webdriver.chrome.driver", "D:\\Selenium - Saad(C06)\\Browser Drivers\\chrome\\chromedriver.exe");
	   driver = new ChromeDriver();
				}
public void RunApp() {
	  driver.get("http://www.practiceselenium.com/welcome.html");
		
	}

}


