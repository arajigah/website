package com.catalyst.zooKeepr.seleniumtest;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		
		new WebDriverWait(driver, 400).until(ExpectedConditions.presenceOfElementLocated(By.id("newFoodButton"))).click();
			driver.findElement(By.id("foodName")).sendKeys("Salmon");
			driver.findElement(By.xpath("//*[@id='selectFoodCategory']")).click();
			new WebDriverWait(driver, 400).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='selectFoodCategory']/option[5]"))).click();
				driver.findElement(By.id("vendorName")).sendKeys("Sally's Salmon Deliveries");
				driver.findElement(By.id("newFoodSave")).click();
		
		new WebDriverWait(driver, 400).until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("/html/body/div[2]/ui-view/div/table/tbody/tr"))).findElement(By.id("animal")).click();
		new WebDriverWait(driver, 400).until(ExpectedConditions.presenceOfElementLocated(
				By.id("newAnimalButton"))).findElement(By.id("newAnimalButton")).click();
			new WebDriverWait(driver, 400).until(ExpectedConditions.presenceOfElementLocated(By.id("animalName"))).sendKeys("Grizzly Bear);
		
		
		
		
		
		new WebDriverWait(driver, 100).until(ExpectedConditions.presenceOfElementLocated(By.id("newEnclosureButton"))).click();
		new WebDriverWait(driver, 300).until(ExpectedConditions.presenceOfElementLocated(By.id("enclosureName"))).sendKeys("Test Enclosure");
		new WebDriverWait(driver, 300).until(ExpectedConditions.)
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
