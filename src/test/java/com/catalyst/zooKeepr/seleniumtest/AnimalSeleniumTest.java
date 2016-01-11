package com.catalyst.zooKeepr.seleniumtest;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AnimalSeleniumTest {
	
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
		
		new WebDriverWait(driver, 400).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/ui-view/div/table/tbody/tr")));
			driver.findElement(By.id("animal")).click();
		new WebDriverWait(driver, 400).until(ExpectedConditions.presenceOfElementLocated(By.id("newAnimalButton")));
			driver.findElement(By.id("newAnimalButton")).click();
			new WebDriverWait(driver, 400).until(ExpectedConditions.presenceOfElementLocated(By.id("animalName")));
				driver.findElement(By.id("animalName")).sendKeys("Grizzly Bear");
				driver.findElement(By.id("sciName")).sendKeys("Ursus arctos");
				driver.findElement(By.xpath("//*[@id='selectFavFood']")).click();
				driver.findElement(By.xpath("//*[@id='selectFavFood']/option[2]")).click();
				driver.findElement(By.id("animalInfo")).sendKeys("https://en.wikipedia.org/wiki/Grizzly_bear");
				driver.findElement(By.id("newAnimalSave")).click();

	}
}
