package launchSite;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import launchPage.LaunchSite;
import launchPage.goToAccessories;
import launchPage.addToCart;
import launchPage.shippingDetails;
import launchPage.confirmTransaction;
public class FirstPage {
	
		WebDriver driver;
		
		
	@Before
	
	public void launchSite() {
		LaunchSite launch_Object= new LaunchSite(driver);
		driver  = launch_Object.setup();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test
	
	public void shopping() {
		
		goToAccessories accessory_Object = new goToAccessories(driver);
		accessory_Object.accessory_Click();
		
		
		addToCart cart_Object=new addToCart(driver);
		cart_Object.magic_Mouse_Click();
		cart_Object.add_To_Cart();
		cart_Object.checkOut();
		String itemName =  cart_Object.check_Order();
		Assert.assertEquals(itemName,"Magic Mouse");
		cart_Object.click_Continue();
		
		shippingDetails ship_Details_Object = new shippingDetails(driver);
		ship_Details_Object.add_Details();
		ship_Details_Object.purchase_Click();
		
		confirmTransaction confirm_Object = new confirmTransaction(driver);
		int qty = confirm_Object.confirm_Quantity();
		Assert.assertTrue(qty==1);
		String msg = confirm_Object.confirm_Transaction_Message();
		Assert.assertTrue(msg.contains("Thank you, your purchase is pending. You will be sent an email once the order clears."));
		
		}
	
	@After
		
		public void quitSite() {
		driver.close();
		}
		
}

		
		