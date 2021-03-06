package com.selenium.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demotest {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/?gclid=EAIaIQobChMIqtTIyISz6wIVFx4rCh0VrwLwEAAYASAAEgKr4_D_BwE&ef_id=EAIaIQobChMIqtTIyISz6wIVFx4rCh0VrwLwEAAYASAAEgKr4_D_BwE:G:s&s_kwcid=AL!739!3!326505318642!e!!g!!flipkart&semcmpid=sem_8024046704_brand_eta_goog");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("IPhone xr",Keys.ENTER);
		
		HashMap<String, String> hm = new HashMap<String, String>();
		int i=1;
	   List<WebElement> wb = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone XR')]"));
	   for(WebElement element:wb)
	   {
		   String sWb1="(//div[contains(text(),'Apple iPhone XR')])[";
		   String sWb2="]/../following-sibling::div/div/div/div[1]";
		   String findElement = driver.findElement(By.xpath(sWb1+i+sWb2)).getText();
		  String text = element.getText();
		  //Integer.parseInt(findElement)
		  hm.put(text, findElement);
		  
		  i++;
		   
		   
	   }
	   
	   System.out.println(hm);
	   
	   Set<Entry<String, String>> es = hm.entrySet();
	   Iterator<Entry<String, String>> itr = es.iterator();
	   while(itr.hasNext())
	   {
		   Entry<String, String> m1 = itr.next();
		   System.out.println(m1.getKey()+"=========="+m1.getValue());
		   
	   }
	   
	   
	}

}
