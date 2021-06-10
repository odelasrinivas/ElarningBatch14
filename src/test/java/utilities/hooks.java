package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {

	

		public static WebDriver driver;

		@Before
		public void webdriverinitialization() {
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Srinivas Odela\\Selenium\\New folder\\Browserdrivers\\chromedriver_win32\\chromedriver.exe");
			
			System.out.println("This will run before the Scenario");
			driver = new ChromeDriver();

		}

		@After
		public void closingdriver() {
			//driver.quit();
		}
	
}
