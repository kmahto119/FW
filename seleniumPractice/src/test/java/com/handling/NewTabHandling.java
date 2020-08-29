package com.handling;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabHandling {
	
	static WebDriver driver =null;
	public static void main(String[] args) throws Throwable {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.airbnb.co.in/");
		
		driver.findElement(By.id("bigsearch-query-detached-query")).sendKeys("goa",Keys.ENTER);
		driver.findElement(By.xpath("//button[@type='button']/span/span")).click();
		
		driver.findElement(By.xpath("(//a[@aria-label='The Woodstone Crib'])[2]")).click();
		Robot r = new Robot();        
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_T);
        r.keyRelease(KeyEvent.VK_CONTROL);
        r.keyRelease(KeyEvent.VK_T);
		
	}

}
