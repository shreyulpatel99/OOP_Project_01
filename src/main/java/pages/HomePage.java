package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage{
	
	//page locators:
	private By userNameLabel = By.xpath("//b[contains(text(),'Shreyul')]");
	private By headerLinks = By.xpath("//div[@class='hl-cat-nav']/ul/li");
	private By savedLink = By.xpath("//li[@class='saved']"); 
	private By fashionLink = By.linkText("Fashion");
	
	
	/**
	 * @return the userNameLabel
	 */
	public WebElement getUserNameLabel() {
		return getElement(userNameLabel);  
	}

	/**
	 * @return the headerLinks
	 */
	public By getHeaderLinks() {
		return headerLinks;
	}

	/**
	 * @return the savedLink
	 */
	public WebElement getSavedLink() {
		return  getElement(savedLink);
	}

	/**
	 * @return the fashionLink
	 */
	public WebElement getFashionLink() {
		return getElement(fashionLink);
	}

	public HomePage(WebDriver driver) {
		super(driver);
	}
	

	public String verifyuserName () { 
		return getUserNameLabel().getText();
	}
	
	public String getHomePageTitle() { 
		return getPageTitle(); 
	}
	public void clickOnSavedLink () { 
	 getSavedLink().click();
	}
	
	public void clickOnFashionLink ()  { 
		getFashionLink().click();
		
	}
	

}
