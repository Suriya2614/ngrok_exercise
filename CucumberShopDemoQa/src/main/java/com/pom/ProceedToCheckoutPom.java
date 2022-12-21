package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCheckoutPom {

	public static WebDriver driver;

	@FindBy(xpath = "//a[@class='checkout-button button alt wc-forward wp-element-button']")
	private WebElement clickonproceed;

	public ProceedToCheckoutPom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public WebElement getClickonproceed() {
		return clickonproceed;
	}

}
