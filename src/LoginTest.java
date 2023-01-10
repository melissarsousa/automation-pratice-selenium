package dev.melissa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTest {
	private WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://automationexercise.com/login");
	}

	@AfterEach
	void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	void test() {
		WebElement emailAddressElement = driver.findElement(By.id("email"));
		emailAddressElement.sendKeys("mel.rios99.com");


		WebElement passwordElement = driver.findElement(By.name("password"));
		passwordElement.sendKeys("senhatest");
    
		
		WebElement submitButtonElement = driver.findElement(By.cssSelector("#form > div > div > div.col-sm-4.col-sm-offset-1 > div > form > button"));
		submitButtonElement.click();
		
		WebElement testCaseButton = driver.findElement(By.cssSelector("#header > div > div > div > div.col-sm-8 > div > ul > li:nth-child(6) > a"));
		String textTestCase = testCaseButton.getText();
		
		Assertions.assertTrue(textTestCase.equals("Test Cases"));
	}

}