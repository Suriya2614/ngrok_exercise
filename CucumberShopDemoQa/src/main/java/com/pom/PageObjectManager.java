package com.pom;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public static WebDriver driver;

	private ProductClickPom p1;
	private AddToCartPom p2;
	private ProceedToCheckoutPom p3;
	private PlaceOrderPom p4;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}

	public ProductClickPom getInstanceProductClickPom() {
		p1 = new ProductClickPom(driver);
		return p1;

	}

	public AddToCartPom getInstanceAddToCartPom() {

		p2 = new AddToCartPom(driver);
		return p2;

	}

	public ProceedToCheckoutPom getInstannceProceedToCheckoutPom() {

		p3 = new ProceedToCheckoutPom(driver);
		return p3;

	}

	public PlaceOrderPom getInstancePlaceOrderPom() {

		p4 = new PlaceOrderPom(driver);
		return p4;

	}

}
