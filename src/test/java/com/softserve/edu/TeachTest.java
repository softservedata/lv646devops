package com.softserve.edu;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TeachTest {
	private String url = "https://speak-ukrainian.org.ua/";
	private WebDriver driver;

	public void takeScreenShot() throws IOException {
        String currentTime = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss-S").format(new Date());
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("./" + currentTime + "_screenshot.png"));
    }
	
	@Before
	public void setUp() throws InterruptedException {
		//WebDriverManager.firefoxdriver().setup();
		WebDriverManager.chromedriver().setup(); // 5.0.3
		//WebDriverManager.phantomjs().setup(); // use 4.4.3
		//
		// Start Chrome with UI 
		//driver = new ChromeDriver();
		//
		// Start Chrome without UI
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless"); // Chrome Without UI
		driver = new ChromeDriver(options);
		//
		// Firefox without UI
//		 FirefoxOptions options = new FirefoxOptions();
//		 options.addArguments("--headless");
//		 driver = new FirefoxDriver(options);
		//
		// HtmlUnitDriver
		// driver = new HtmlUnitDriver(true); // Runtime Error
        //((HtmlUnitDriver) driver).setJavascriptEnabled(true); // TODO Enable CSS
		//
		// PhantomJS
		// driver = new PhantomJSDriver(); // Runtime Error
		//
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Selenium 3.141.59
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Selenium 4.x
		driver.manage().window().maximize();
		Thread.sleep(1000); // For Presentation ONLY
	}

	@After
	public void tearDown() throws InterruptedException {
		Thread.sleep(1000); // For Presentation ONLY
		driver.quit(); // close browser, stop server
	}
	
	@Test
	public void isAvailable() throws Exception {
		//
		System.out.println("start test");
		driver.get(url);
		Thread.sleep(1000); // For Presentation ONLY
		//
		driver.findElement(By.cssSelector(".anticon.anticon-caret-down")).click();
		//Thread.sleep(1000); // For Presentation ONLY
		WebElement city = driver.findElement(By.xpath("//ul[@role='menu']/li[2]/span"));
		Thread.sleep(1000); // For Presentation ONLY
		//
		//String check = city.getText();
		//System.out.println("check = " + check);
		//System.out.println("City = " + city.getText());
		System.out.println("City = " + city.getText());
		Assert.assertEquals("Харків", city.getText());
		//
		System.out.println("takeScreenShot ...");
		takeScreenShot(); // For Presentation ONLY
		Thread.sleep(1000); // For Presentation ONLY
	}

}
