package com.softserve.edu;

import java.time.Duration;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TeachTest {
	private String url = "https://speak-ukrainian.org.ua/";
	private WebDriver driver;

	@Before
	public void setUp() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(1000); // For Presentation ONLY
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(4000); // For Presentation ONLY
		driver.quit(); // close browser, stop server
	}
	
	@Test
	public void isAvailable() throws InterruptedException {
		//
		driver.get(url);
		Thread.sleep(1000); // For Presentation ONLY
		//
		driver.findElement(By.cssSelector(".anticon.anticon-caret-down")).click();
		WebElement city = driver.findElement(By.xpath("//ul[@role='menu']/li[2]/span"));
		System.out.println("City = " + city.getText());
		Assert.assertEquals("Харків", city.getText());
		Thread.sleep(1000); // For Presentation ONLY
	}

}
