package com.selenium.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./src/main/resources/geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		Actions act = new Actions(driver);
		act.moveToElement((WebElement) By.xpath("//a[text()='Castlevania: Dawn of Sorrow']"));
		act.build().perform();
	}

}
