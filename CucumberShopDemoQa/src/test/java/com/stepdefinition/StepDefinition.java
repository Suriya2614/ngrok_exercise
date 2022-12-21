package com.stepdefinition;

import org.openqa.selenium.JavascriptExecutor;

import com.baseclass.BaseClass;
import com.pom.AddToCartPom;
import com.pom.*;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	PageObjectManager pom=new PageObjectManager(driver);


	@Given("launch shoptools qa url")
	public void launch_shoptools_qa_url() {

		url("https://shop.demoqa.com/");
	}

	@When("user click on product")
	public void user_click_on_product() {

		pom.getInstanceProductClickPom().getProductclick().click();

	}

	@Given("user click on drop down to select color")
	public void user_click_on_drop_down_to_select_color() {

		pom.getInstanceAddToCartPom().getColordrdwclick().click();;
	}

	@When("user to select the color of the product")
	public void user_to_select_the_color_of_the_product() {

		selectdropdown(pom.getInstanceAddToCartPom().getColordrdwclick(), "selectbyvisibletext", "White");
	}

	@When("user to click on drop down to select size")
	public void user_to_click_on_drop_down_to_select_size() {

	pom.getInstanceAddToCartPom().getSizedrdwclick().click();
	}

	@When("user to select the size of the product")
	public void user_to_select_the_size_of_the_product() {

		selectdropdown(pom.getInstanceAddToCartPom().getSizedrdwclick(), "selectbyvisibletext", "S");
	}

	@When("user to click the quantity of the product")
	public void user_to_click_the_quantity_of_the_product() {
	pom.getInstanceAddToCartPom().getQtyclick().click();

	}

	@When("user to click on add to cart")
	public void user_to_click_on_add_to_cart() throws InterruptedException {
		Thread.sleep(3000);
		pom.getInstanceAddToCartPom().getClickaddtocart().click();
	}

	@When("user to click on cart box")
	public void user_to_click_on_cart_box() {

		pom.getInstanceAddToCartPom().getClickcartbox().click();
	}

	@When("user to click on proceed to checkout")
	public void user_to_click_on_proceed_to_checkout() {

		pom.getInstannceProceedToCheckoutPom().getClickonproceed().click();

	}

	@When("user to give values on first name")
	public void user_to_give_values_on_first_name() {

		pom.getInstancePlaceOrderPom().getFirstname().sendKeys("suriya");
	}

	@When("user to give values on last name")
	public void user_to_give_values_on_last_name() {

		pom.getInstancePlaceOrderPom().getLastname().sendKeys("sa");
	}

	@When("user to give values on company name")
	public void user_to_give_values_on_company_name() {
		pom.getInstancePlaceOrderPom().getCompanyname().sendKeys("google");
	}

	@When("user to click on country drop down box")
	public void user_to_click_on_country_drop_down_box() throws InterruptedException {

//		Thread.sleep(3000);
//		p4.getClickoncountrydrdn().click();
	}

	@When("user to select values on country drop down box")
	public void user_to_select_values_on_country_drop_down_box() throws InterruptedException {

		selectdropdown(pom.getInstancePlaceOrderPom().getClickoncountrydrdn(), "byvalue", "IN");

	}

	@When("user to give values on street address1")
	public void user_to_give_values_on_street_address1() {

		pom.getInstancePlaceOrderPom().getStadd1().sendKeys("123");
	}

	@When("user to give values on street address2")
	public void user_to_give_values_on_street_address2() {

		pom.getInstancePlaceOrderPom().getStadd2().sendKeys("ruby");
	}

	@When("user to give values on town")
	public void user_to_give_values_on_town() {

		pom.getInstancePlaceOrderPom().getTownname().sendKeys("chennai");
	}

	@When("user to click on state drop down box")
	public void user_to_click_on_state_drop_down_box() {

//		p4.getStatedrdn().click();

	}

	@When("user to select values on state drop down box")
	public void user_to_select_values_on_state_drop_down_box() {

		selectdropdown(pom.getInstancePlaceOrderPom().getStatedrdn(), "selectbyvisibletext", "Tamil Nadu");

	}

	@When("user to give values on pincode")
	public void user_to_give_values_on_pincode() {

		pom.getInstancePlaceOrderPom().getPincode().sendKeys("625018");

	}

	@When("user to give values on phone")
	public void user_to_give_values_on_phone() {

		pom.getInstancePlaceOrderPom().getPhone().sendKeys("9876543210");
	}

	@When("user to give values on email address")
	public void user_to_give_values_on_email_address() {
		pom.getInstancePlaceOrderPom().getEmail().sendKeys("qwerty@gmail.com");
	}

	@When("user to click on terms and conditions check box")
	public void user_to_click_on_terms_and_conditions_check_box() {

//		p4.getTermsandcond().click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", pom.getInstancePlaceOrderPom().getTermsandcond());
		
	}

	@When("user to click on proceed checkout")
	public void user_to_click_on_proceed_checkout() {

		pom.getInstancePlaceOrderPom().getPlaceorder().click();
	}

}
