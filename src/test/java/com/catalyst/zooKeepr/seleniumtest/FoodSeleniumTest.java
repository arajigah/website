package com.catalyst.zooKeepr.seleniumtest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FoodSeleniumTest {
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
		
		new WebDriverWait(driver, 400).until(ExpectedConditions.presenceOfElementLocated(By.id("newFoodButton"))).click();
		new WebDriverWait(driver, 400).until(ExpectedConditions.presenceOfElementLocated(By.id("foodName")));
			driver.findElement(By.id("foodName")).sendKeys("Salmon");
			driver.findElement(By.xpath("//*[@id='selectFoodCategory']")).click();
			new WebDriverWait(driver, 400).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='selectFoodCategory']/option[5]"))).click();
				driver.findElement(By.xpath("//*[@id='vendorName']")).sendKeys("Sally's Salmon Deliveries");
				driver.findElement(By.id("newFoodSave")).click();

	}
}
