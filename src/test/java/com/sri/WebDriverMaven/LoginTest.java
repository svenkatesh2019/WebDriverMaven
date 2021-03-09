package com.sri.WebDriverMaven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}

	@Test
	public void login() {
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);// Implicit wait
		driver.findElement(By.id("email")).sendKeys("sud.v@hotmail.com");
		driver.findElement(By.name("pass")).sendKeys("555555555555555");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("this is a test");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
