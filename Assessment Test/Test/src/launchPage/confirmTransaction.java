package launchPage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class confirmTransaction {
	
	static WebDriver driver;
	
	public confirmTransaction(WebDriver driver) {
		this.driver = driver;
	}
	

	public static int confirm_Quantity(){
		
		try {
    		
    		By orderQuantity = By.xpath("//td[3]");
    		WebElement orderQuantityValue = driver.findElement(orderQuantity);
    		int quantity = Integer.parseInt(orderQuantityValue.getText());
    		return quantity;
		
	    }
    	catch (Exception e){
    		throw(e);
    	}
	    
	}
	public String confirm_Transaction_Message() {
		
		try {
			
			By confirm = By.xpath("//div[@class='wpsc-transaction-results-wrap']/p[1]");
			WebElement confirmTransaction = driver.findElement(confirm);
			String message = confirmTransaction.getText();
			return message;
		}
		catch(Exception e)
		{
			throw(e);
		}
		

	}
	
}
