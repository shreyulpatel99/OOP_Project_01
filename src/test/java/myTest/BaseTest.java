package myTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.BasePage;
import pages.Page;

public class BaseTest {

	WebDriver driver; 
	public Page page; 
	
	@BeforeMethod 
	@Parameters(value = {"browser"})
	public void setUpTest(String browser) throws InterruptedException { 
		if (browser.equals("chrome")) { 
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(); 
		} else if (browser.equals("ff")) { 
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(); 
		}
		else { 
			System.out.println("no browser is defined");
		}
		driver.get("https://www.ebay.ca/");
		Thread.sleep(3000);
		page = new BasePage (driver); 
	}
	
	@AfterMethod 
	public void tearDown ( ) { 
		driver.quit();
	}
	 
	
}
