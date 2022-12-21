package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPom {

	public static WebDriver driver;

	@FindBy(xpath = "//select[@id='color']")
	private WebElement colordrdwclick;

	@FindBy(xpath = "//select[@id='size']")
	private WebElement sizedrdwclick;

	@FindBy(xpath = "//button[@class='qty-increase']")
	private WebElement qtyclick;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement clickaddtocart;

	@FindBy(xpath = "//li[@id='nav-menu-item-cart']")
	private WebElement clickcartbox;

	public AddToCartPom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getColordrdwclick() {
		return colordrdwclick;
	}

	public WebElement getSizedrdwclick() {
		return sizedrdwclick;
	}

	public WebElement getQtyclick() {
		return qtyclick;
	}

	public WebElement getClickaddtocart() {
		return clickaddtocart;
	}

	public WebElement getClickcartbox() {
		return clickcartbox;
	}

}
