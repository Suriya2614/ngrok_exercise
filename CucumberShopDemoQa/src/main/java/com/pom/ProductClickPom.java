package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.BaseClass;

public class ProductClickPom {

	public static WebDriver driver;

	@FindBy(xpath = "//a[text()='Tokyo Talkies']")
	private WebElement productclick;

	public ProductClickPom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);

	}

	public WebElement getProductclick() {
		return productclick;
	}

}
