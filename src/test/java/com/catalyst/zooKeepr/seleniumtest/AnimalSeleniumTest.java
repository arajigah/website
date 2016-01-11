package com.catalyst.zooKeepr.seleniumtest;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	public void testAddNewAnimal() {		
			driver.findElement(By.id("animal")).click();
		new WebDriverWait(driver, 400).until(ExpectedConditions.presenceOfElementLocated(By.id("newAnimalButton")));
			driver.findElement(By.id("newAnimalButton")).click();
			new WebDriverWait(driver, 400).until(ExpectedConditions.presenceOfElementLocated(By.id("animalName")));
				driver.findElement(By.id("animalName")).sendKeys("Polar Bear");
				driver.findElement(By.id("sciName")).sendKeys("Ursus maritimus");
				driver.findElement(By.xpath("//*[@id='selectFavFood']")).click();
				driver.findElement(By.xpath("//*[@id='selectFavFood']/option[3]")).click();
				driver.findElement(By.id("animalInfo")).sendKeys("https://en.wikipedia.org/wiki/Polar_bear");
				driver.findElement(By.id("newAnimalSave")).click();
				
				Collection<WebElement> animalData = driver.findElements(By.className("animalData"));
				new WebDriverWait(driver, 400).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='animal_" + (animalData.size()) + "']/td[1]")));
				String animalName = driver.findElement(By.xpath("//*[@id='animal_" + (animalData.size()) + "']/td[1]")).getText();
				assertEquals("POLAR BEAR", animalName);

	}
	
	@After
	public void closeDriver(){
		driver.close();
	}
}
