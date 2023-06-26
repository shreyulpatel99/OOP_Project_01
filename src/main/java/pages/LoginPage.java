package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	
	//page locators: 
	private By signIn = By.linkText("Sign in");
	private By emailID = By.name("userid"); 
	private By password = By.name("pass"); 
	private By signInBtn = By.name("sgnBt"); 
	private By continueBtn = By.name("signin-continue-btn"); 
	
	


	public LoginPage(WebDriver driver) {
		super(driver);
		
	}


	//public getters: 
	/**
	 * @return the emailID
	 */
	public WebElement getEmailID() { //we changed the by to webelement so that we can perform .sendkeys actions
		return getElement(emailID);
	}


	/**
	 * @return the password
	 */
	public WebElement getPassword() {
		return getElement(password);
	}
	
	
	/**
	 * @return the signIn
	 */
	public WebElement getSignIn() {
		return getElement(signIn);
	}

	public WebElement getContinueBtn() {
		return getElement(continueBtn);
	}

	/**
	 * @return the signInBtn
	 */
	public WebElement getSignInBtn() {
		return getElement(signInBtn);
	}

	public String getLoginPageTitle () { 
		return getPageTitle(); 
	}
	
	
	public HomePage doLogin(String username, String password) throws InterruptedException {
		getSignIn().click();
		Thread.sleep(3000);
		getEmailID().sendKeys(username);
		getContinueBtn().click();
		Thread.sleep(3000);
		getPassword().sendKeys(password);
		getSignInBtn().click();
		
		return getInstance(HomePage.class); 
		
	}
	

}
