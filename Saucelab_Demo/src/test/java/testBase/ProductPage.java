package testBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
	
	    WebDriver driver;

	    By addToCartBtn = By.id("");
	    By cartIcon = By.className("");

	    public ProductPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void addToCartAndGoToCart() {
	        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	        driver.findElement(By.className("shopping_cart_link")).click();
	    }

}
