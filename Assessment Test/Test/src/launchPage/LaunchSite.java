package launchPage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchSite {
	
		WebDriver driver;
		
		public LaunchSite(WebDriver driver) {
			this.driver = driver;
			}
		
		public  WebDriver setup(){

			try {
				driver = new ChromeDriver();  
			       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

			        driver.get("https://store.demoqa.com/");
			        return driver;
			}
			catch(Exception e) {
				throw(e);
			}
			
		}
		       
		
		
	}
	

