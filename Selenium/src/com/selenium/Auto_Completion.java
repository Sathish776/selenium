package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Completion {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.leafground.com/pages/autoComplete.html");
	WebElement textbox = driver.findElement(By.xpath("//input[@id='tags']"));
	textbox.sendKeys("s");
	Thread.sleep(3000);
	List<WebElement> textbox1 = driver.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
	int size = textbox1.size();
	System.out.println(size);
	
	for (WebElement options : textbox1) {      //get all the options by list
		
		if (options.getText().equals("Web Services")){    //the options equals to selection
			options.click();
			break;
		}
		
		
	}
	
	
	
	
}
}
