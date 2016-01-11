package com.catalyst.zooKeepr.seleniumtest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.After;
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
		new WebDriverWait(driver, 400).until(ExpectedConditions.presenceOfElementLocated(By.id("enclosure")));
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
			Collection<WebElement> enclosureData = driver.findElements(By.className("enclosureData"));
			new WebDriverWait(driver, 400).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='enclosure_" + (enclosureData.size()) + "']/td[1]")));
			String enclosureName = driver.findElement(By.xpath("//*[@id='enclosure_" + (enclosureData.size()) + "']/td[1]")).getText();
			assertEquals("GRIZZLY BEAR ENCLOSURE", enclosureName);
	}
	
	@Test
	public void testEditEnclosure() {
		new WebDriverWait(driver, 1000).until(ExpectedConditions.presenceOfElementLocated(By.id("enclosure")));
			driver.findElement(By.id("enclosure")).click();
		new WebDriverWait(driver, 1000).until(ExpectedConditions.presenceOfElementLocated(By.id("editEnclosure")));
		String oldData = driver.findElement(By.xpath("//*[@id='enclosure_0']/td[1]")).getText();
			driver.findElement(By.id("editEnclosure")).click();
		new WebDriverWait(driver, 1000).until(ExpectedConditions.presenceOfElementLocated(By.id("editEnclosureName")));
			driver.findElement(By.id("editEnclosureName")).clear();
			driver.findElement(By.id("editEnclosureName")).sendKeys("Bear Enclosure");
			driver.findElement(By.id("editSelectAnimal")).click();
			driver.findElement(By.xpath("//*[@id='editSelectAnimal']/option[2]")).click();
			driver.findElement(By.id("editAnimalNum")).clear();
			driver.findElement(By.id("editAnimalNum")).sendKeys("12");
			driver.findElement(By.xpath("//*[@id='editSelectCondition']")).click();
			driver.findElement(By.xpath("//*[@id='editSelectCondition']/option[3]")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[5]/table/tbody/tr[1]/td[1]/a")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div[5]/table/tbody/tr[1]/td[3]/a")).click();
			driver.findElement(By.id("updateEnclosure")).click();
			new WebDriverWait(driver, 1000).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='enclosure_0']/td[1]")));
		String newData = driver.findElement(By.xpath("//*[@id='enclosure_0']/td[1]")).getText();
		assertNotEquals(oldData, newData);
	}
	
	@Test
	public void testDeleteEnclosure() {
		new WebDriverWait(driver, 1000).until(ExpectedConditions.presenceOfElementLocated(By.id("enclosure")));
			driver.findElement(By.id("enclosure")).click();
		new WebDriverWait(driver, 1000).until(ExpectedConditions.presenceOfElementLocated(By.id("removeEnclosure")));
		int beforeDelete = driver.findElements(By.tagName("tr")).size();
			driver.findElement(By.id("removeEnclosure")).click();
		int afterDelete = driver.findElements(By.tagName("tr")).size();
			assertNotEquals(beforeDelete, afterDelete);
	}
	
	@After
	public void closeDriver(){
		driver.close();
	}
	
}