package com.handling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlerTHandle {
	
	static WebDriver driver=null;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver=new ChromeDriver();
		
		driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("123448");
		driver.findElement(By.name("submit")).click();
		alertHandleAccept();
		
		
		
	}
	
	private static void alertHandleAccept()
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Alert alt1 = driver.switchTo().alert();
		String text = alt1.getText();
		System.out.println(text);
		alt1.accept();
	}

}
