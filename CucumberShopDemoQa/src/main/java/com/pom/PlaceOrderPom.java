package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPom {
	
	public static WebDriver driver;
	

	@FindBy(xpath = "//input[@id='billing_first_name']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@id='billing_last_name']")
	private WebElement lastname;

	@FindBy(xpath = "//input[@id='billing_company']")
	private WebElement companyname;

	@FindBy(xpath = "//select[@id='billing_country']")
	private WebElement clickoncountrydrdn;

	@FindBy(xpath = "//input[@id='billing_address_1']")
	private WebElement stadd1;

	@FindBy(xpath = "//input[@id='billing_address_2']")
	private WebElement stadd2;

	@FindBy(xpath = "//input[@id='billing_city']")
	private WebElement townname;
	
	@FindBy(xpath = "//select[@id='billing_state']")
	private WebElement statedrdn;

	@FindBy(xpath = "//input[@id='billing_postcode']")
	private WebElement pincode;
	
	@FindBy(xpath = "//input[@id='billing_phone']")
	private WebElement phone;
	
	public WebElement getStatedrdn() {
		return statedrdn;
	}

	@FindBy(xpath = "//input[@id='billing_email']")
	private WebElement email;
	
	public PlaceOrderPom(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getCompanyname() {
		return companyname;
	}

	public WebElement getClickoncountrydrdn() {
		return clickoncountrydrdn;
	}

	public WebElement getStadd1() {
		return stadd1;
	}

	public WebElement getStadd2() {
		return stadd2;
	}

	public WebElement getTownname() {
		return townname;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getTermsandcond() {
		return termsandcond;
	}

	public WebElement getPlaceorder() {
		return placeorder;
	}

	@FindBy(xpath = "//input[@id='terms']")
	private WebElement termsandcond;
	
	@FindBy(xpath = "//button[@id='place_order']")
	private WebElement placeorder;
	
	
	
	

}
