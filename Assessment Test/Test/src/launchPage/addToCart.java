package launchPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class addToCart {
	
	WebDriver driver;
	
	public addToCart(WebDriver driver) {
		this.driver=driver;
	}

	By mouseLink = By.xpath("//h2/a[contains(text(),'Magic Mouse')]");
	By cart = By.xpath("//input[@name='Buy']");
	By chkout = By.id("header_cart");
	By mouse = By.xpath("//td[@class='wpsc_product_name wpsc_product_name_0']");
	By continueButton = By.xpath("//a[@class='step2']");
	
	public void magic_Mouse_Click() {

		try {
			
			WebElement magicMouseClick = driver.findElement(mouseLink);
			magicMouseClick.click();
		}
		catch(Exception e) {
			throw (e);
		}
		
		
	}
	
	public void checkOut()
	{
		try {
		WebElement checkOutClick = driver.findElement(chkout);
		checkOutClick.click();
	}
		catch(Exception e) {
			throw(e);
		}
	}
	
	public String check_Order() {
		try {
		WebElement mousePresent = driver.findElement(mouse);
		String name = mousePresent.getText();
		return name;
	}
		catch(Exception e) {
			throw(e);
		}
	}
	
	public void click_Continue() {
		try {
		WebElement continueClick = driver.findElement(continueButton);
		continueClick.click();
	}
		catch(Exception e) {
			throw(e);
		}
	}
	
	public void add_To_Cart() {
		try {
		WebElement cartClick = driver.findElement(cart);
		cartClick.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch(Exception e) {
			throw(e);
		}
	}
}
