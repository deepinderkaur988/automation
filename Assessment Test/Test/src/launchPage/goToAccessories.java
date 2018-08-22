package launchPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class goToAccessories {
	
		WebDriver driver;
		
		public goToAccessories(WebDriver driver) {
			this.driver = driver;
			}


	public void accessory_Click() {
		try {
			
			By element = By.id("menu-item-33");
			By access = By.id("menu-item-34");
			WebElement dropdown = driver.findElement(element);
			WebElement accessories = driver.findElement(access);
			Actions action = new Actions(driver);
			action.moveToElement(dropdown).moveToElement(accessories).click().build().perform();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
		catch(Exception e) {
			throw(e);
		}
	}
}
