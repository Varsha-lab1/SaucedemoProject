package testCases;

import org.testng.annotations.Test;

import Pages.BaseTest;
import testBase.CheckoutPage;
import testBase.LoginPage;
import testBase.ProductPage;

public class TC001_Test extends BaseTest {
	@Test
	public void testFlow() throws Exception
	{
		
	LoginPage lp=new LoginPage(driver);
	ProductPage pp=new ProductPage(driver);
	CheckoutPage cp=new CheckoutPage(driver);
	lp.login("standard_user", "secret_sauce");
	pp.addToCartAndGoToCart();
	cp.checkout("Yash", "Test", "411023");
	}

}
