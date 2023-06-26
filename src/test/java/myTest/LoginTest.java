package myTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends BaseTest {
	
	
	@Test
	public void verifyLoginPageTitleTest () { 
		String title = page.getInstance(LoginPage.class).getLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Electronics, Cars, Fashion, Collectibles & More | eBay");
	}
	
	@Test
	public void verifydoLoginTest () throws InterruptedException { 
	HomePage homepage = page.getInstance(LoginPage.class).doLogin("shreyulpatel30@gmail.com", "Scofield@7"); 
	
	}
	

}
