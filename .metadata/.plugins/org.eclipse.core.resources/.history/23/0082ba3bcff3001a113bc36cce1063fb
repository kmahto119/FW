package com.javascript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleActoion {

	static WebDriver driver=null;
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.xpath("//span[text()='Sports, Books & More']"))).perform();
		driver.findElement(By.xpath("//a[@title='Chocolates']")).click();
		
		
	}

}
