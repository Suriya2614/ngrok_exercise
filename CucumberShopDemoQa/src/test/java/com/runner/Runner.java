package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\Eclipse IDE\\CucumberShopDemoQa\\src\\test\\java\\com\\featrue\\ShopToolsQa.feature", 
                             glue = "com.stepdefinition",
                             monochrome = true,
                             dryRun = false,
                             plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json",
                            		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                            		 })
public class Runner {

	public static WebDriver driver;

	@BeforeClass
	public static void Browser() {
		driver = BaseClass.browser("chrome");

	}

}
