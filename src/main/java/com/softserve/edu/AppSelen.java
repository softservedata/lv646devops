package com.softserve.edu;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppSelen {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		// System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(1000);	// For Presentation ONLY
		driver.get("https://speak-ukrainian.org.ua/");
		Thread.sleep(1000); // For Presentation ONLY
		//
		driver.findElement(By.cssSelector(".anticon.anticon-caret-down")).click();
		WebElement city = driver.findElement(By.xpath("//ul[@role='menu']/li[2]/span"));
		System.out.println("City = " + city.getText());
		Thread.sleep(8000); // For Presentation ONLY
		driver.quit();
	}
}
