package launchPage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class shippingDetails {
	
	WebDriver driver;
	
	public shippingDetails(WebDriver driver) {
		this.driver = driver;
	}
	
	By email = By.xpath("//input[@id='wpsc_checkout_form_9']");
	By firstName = By.xpath("//input[@id='wpsc_checkout_form_2']");
	By lastName = By.xpath("//input[@id='wpsc_checkout_form_3']");
	By address = By.xpath("//textarea[@id='wpsc_checkout_form_4']");
	By city = By.xpath("//input[@id='wpsc_checkout_form_5']");
	By state = By.xpath("//input[@id='wpsc_checkout_form_6']");
	By country = By.xpath("//select[@id='wpsc_checkout_form_7']");
	By phone = By.xpath("//input[@id='wpsc_checkout_form_18']");
	By state2 = By.xpath("//tr[7]/td[2]/input");
	By purcahse = By.xpath("//div[@class='wpsc_make_purchase']");
	
	
	public void add_Details() {
		
		try {
			
			WebElement emailFill = driver.findElement(email);
			WebElement firstNameFill = driver.findElement(firstName);
			WebElement lastNameFill = driver.findElement(lastName);
			WebElement addressFill = driver.findElement(address);
			WebElement cityFill = driver.findElement(city);
			WebElement stateFill = driver.findElement(state);
			WebElement countryFill = driver.findElement(country);
			WebElement phoneFill = driver.findElement(phone);
			WebElement state2Fill = driver.findElement(state2);
			
			
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("window.scrollBy(0,1200)");


			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.elementToBeClickable(firstNameFill));
			
			
			emailFill.sendKeys("Allen.Clair@gmail.com");
			
			firstNameFill.clear();
			firstNameFill.sendKeys("Allen");
			
			lastNameFill.clear();
			lastNameFill.sendKeys("Clair");
			
			addressFill.clear();
			addressFill.sendKeys("22 Clen Drive");
			
			cityFill.sendKeys("Brampton");
			
			stateFill.sendKeys("Ontario");
			
			countryFill.sendKeys("Canada");
			
			phoneFill.sendKeys("(647)406-8890");
			
			state2Fill.sendKeys("Ontario");
		}
		catch(Exception e) {
			throw(e);
		}
	}
	
	public void purchase_Click() {
		try {
			
			WebElement purchaseClick = driver.findElement(purcahse);
			purchaseClick.click();
			
		}
		catch(Exception e) {
			throw (e);
		}
		
		
	}
	
	

}



