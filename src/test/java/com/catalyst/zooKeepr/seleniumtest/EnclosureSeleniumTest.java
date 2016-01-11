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
				
		new WebDriverWait(driver, 400).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/ui-view/div/table/tbody/tr")));
			driver.findElement(By.id("enclosure")).click();
		new WebDriverWait(driver, 400).until(ExpectedConditions.presenceOfElementLocated(By.id("newEnclosureButton")));
			driver.findElement(By.id("newEnclosureButton")).click();
		new WebDriverWait(driver, 400).until(ExpectedConditions.presenceOfElementLocated(By.id("enclosureName")));
			driver.findElement(By.id("enclosureName")).sendKeys("Grizzly Bear Enclosure");
			driver.findElement(By.xpath("//*[@id='selectAnimal']")).click();
			driver.findElement(By.xpath("//*[@id='selectAnimal']/option[2]")).click();
			driver.findElement(By.id("animalNum")).sendKeys("4");
			driver.findElement(By.xpath("//*[@id='selectCondition']")).click();
			driver.findElement(By.xpath("//*[@id='selectCondition']/option[2]")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[5]/table/tbody/tr[1]/td[1]/a")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[5]/table/tbody/tr[1]/td[3]/a")).click();
			driver.findElement(By.id("addEnclosure")).click();
	}
	
	@Test
	public void testEditEnclosure() {
		new WebDriverWait(driver, 1000).until(ExpectedConditions.presenceOfElementLocated(By.id("enclosure")));
			driver.findElement(By.id("enclosure")).click();
		new WebDriverWait(driver, 1000).until(ExpectedConditions.presenceOfElementLocated(By.id("editEnclosure")));
			driver.findElement(By.id("editEnclosure")).click();
		
		new WebDriverWait(driver, 1000).until(ExpectedConditions.presenceOfElementLocated(By.id("editEnclosureName")));
			driver.findElement(By.id("editEnclosureName")).clear();
			driver.findElement(By.id("editEnclosureName")).sendKeys("Bear Enclosure");
			driver.findElement(By.xpath("//*[@id='editSelectAnimal']")).click();
			driver.findElement(By.xpath("//*[@id='editSelectAnimal']/option[2]")).click();
			driver.findElement(By.id("editAnimalNum")).sendKeys("12");
			driver.findElement(By.xpath("//*[@id='editSelectCondition']")).click();
			driver.findElement(By.xpath("//*[@id='editSelectCondition']/option[3]")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[5]/table/tbody/tr[1]/td[1]/a")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[5]/table/tbody/tr[1]/td[3]/a")).click();
			driver.findElement(By.id("updateEnclosure")).click();
	}
	
	@Test
	public void testDeleteEnclosure() {
		new WebDriverWait(driver, 1000).until(ExpectedConditions.presenceOfElementLocated(By.id("enclosure")));
			driver.findElement(By.id("enclosure")).click();
		new WebDriverWait(driver, 1000).until(ExpectedConditions.presenceOfElementLocated(By.id("removeEnclosure")));
			driver.findElement(By.id("removeEnclosure")).click();
	}
	
}