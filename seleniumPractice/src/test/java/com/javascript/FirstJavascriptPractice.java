package com.javascript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstJavascriptPractice {
	static WebDriver driver=null;
	public static void main(String[] args) {
		
		lounchBrowser();
		loginTheApp();
		handleAlertAccept();
		dropDownListHandle();
		dropDownListHandleByList();
		//driver.close();
	        
	}
	
	public static void lounchBrowser(){
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	public static void loginTheApp(){
		 JavascriptExecutor js = (JavascriptExecutor)driver;
			driver.get("http://demo.guru99.com/V4/index.php");		
		        //Login to Guru99 		
		        driver.findElement(By.name("uid")).sendKeys("mngr278167");					
		        driver.findElement(By.name("password")).sendKeys("Ajapury");	
		        
		        WebElement button =driver.findElement(By.name("btnLogin"));	
		        
		        js.executeScript("arguments[0].click();", button);
		        js.executeScript("alert('Welcome to Guru99....login successfull');"); 	
	}
	private static void handleAlertAccept(){
		 /*======Handle the alert window=============*/
        Alert alt=driver.switchTo().alert();
        alt.accept();
		
	}
	private static void dropDownListHandle(){
		
		driver.findElement(By.linkText("New Account")).click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='selaccount']"));
		
		Select sel = new Select(dropdownElement);
		sel.selectByValue("Current");	
	}
	private static void dropDownListHandleByList(){
		driver.findElement(By.linkText("New Account")).click();
		WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='selaccount']"));
		
		
		Select sel = new Select(dropdownElement);
		List<WebElement> options = sel.getOptions();
		for (WebElement wb : options) {
			System.out.println(wb.getText());
			
		}
		
	}

}
