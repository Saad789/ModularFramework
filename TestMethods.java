package P5;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TestMethods extends OperationalMethods{
		
		public void CheckOut() throws Throwable {
			driver.findElement(By.xpath(".//*[@id='wsb-button-00000000-0000-0000-0000-000450914890']/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath(".//*[@id='wsb-button-00000000-0000-0000-0000-000451955160']/span")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("saad@talentsprint.com");
			driver.findElement(By.xpath(".//*[@id='name']")).sendKeys("SAAD");
			driver.findElement(By.xpath(".//*[@id='address']")).sendKeys("Talentsprint.Hyd");
			new Select(driver.findElement(By.xpath(".//*[@id='card_type']"))).selectByIndex(1);
			driver.findElement(By.xpath(".//*[@id='card_number']")).sendKeys("123456789125263698");
			driver.findElement(By.xpath(".//*[@id='cardholder_name']")).sendKeys("SAAD");
	        driver.findElement(By.xpath(".//*[@id='wsb-element-00000000-0000-0000-0000-000452010925']/div/div/form/div/button")).click();
	        Thread.sleep(4000);
		}
		public void Quit() {
			driver.quit();
		}

	}



