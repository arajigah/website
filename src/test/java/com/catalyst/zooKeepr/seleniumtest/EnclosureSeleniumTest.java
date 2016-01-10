package com.catalyst.zooKeepr.seleniumtest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnclosureSeleniumTest {
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:/Tools/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://localhost:8080");
	}
	
	@Test
	public void testAddNewEnclosure() {
		driver.findElement(By.id("food")).click();
		
		new WebDriverWait(driver, 100).until(ExpectedConditions.presenceOfElementLocated(By.id("newFoodButton"))).click();
		
		new WebDriverWait(driver, 100).until(ExpectedConditions.presenceOfElementLocated(By.id("newEnclosureButton"))).click();
		new WebDriverWait(driver, 300).until(ExpectedConditions.presenceOfElementLocated(By.id("enclosureName"))).sendKeys("Test Enclosure");
		new WebDriverWait(driver, 300).until(ExpectedConditions.)
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
