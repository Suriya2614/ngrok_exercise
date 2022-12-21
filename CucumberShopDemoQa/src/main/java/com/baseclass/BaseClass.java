package com.baseclass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browser(String browsers) {

		switch (browsers) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		default:
			System.out.println("browser invalid");
			break;
		}
		return driver;

	}

	public static void url(String geturl) {

		driver.get(geturl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public static WebElement findelement(String locators) {
		return driver.findElement(By.xpath(locators));

	}

	public static void screenshot(String image) throws IOException {

		long snap = System.currentTimeMillis();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File from = ts.getScreenshotAs(OutputType.FILE);
		File to = new File("D:\\Eclipse IDE\\TryBooking\\screenshot\\" + image + snap + ".png");
		FileUtils.copyFile(from, to);

	}

	public static void switchtab(int index) {
		Set<String> windowHandles = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<>(windowHandles);
		driver.switchTo().window(list.get(index));

	}

	public static void selectdropdown(WebElement element, String selectmethod, String selectvalue) {

		Select s = new Select(element);

		switch (selectmethod) {
		case "byvalue":

			s.selectByValue(selectvalue);

			break;
		case "byindex":
			s.selectByIndex(Integer.parseInt(selectvalue));
			break;
		case "selectbyvisibletext":
			s.selectByVisibleText(selectvalue);
			break;

		default:
			break;
		}

	}
}
