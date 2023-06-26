package myTest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomeTest extends BaseTest {
	
	
	@Test
	public void verifyLogiHomePageTitleTest () throws InterruptedException { 
		HomePage homepage = page.getInstance(LoginPage.class).doLogin("shreyulpatel30@gmail.com", "Scofield@7");
		String title = page.getInstance(HomePage.class).getHomePageTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Electronics, Cars, Fashion, Collectibles & More | eBay");
	}
	
	@Test
	public void verifyCorrectuserNameTest () throws InterruptedException { 
		HomePage homepage = page.getInstance(LoginPage.class).doLogin("shreyulpatel30@gmail.com", "Scofield@7");
		String usernameLabel = page.getInstance(HomePage.class).verifyuserName(); 
		Assert.assertEquals(usernameLabel, "Shreyul");
	}
	
	@Test
	public void SavedPageTest () throws IOException {
		page.getInstance(HomePage.class).clickOnSavedLink(); 
	}
	
	@Test
	public void FashionPageTest () throws IOException {
		page.getInstance(HomePage.class).clickOnFashionLink();; 
	}
}
