package com.selenium;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectables {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		List<WebElement> selectable = driver.findElements(By.xpath("//div[@id='mydiv']//li"));
           //get selectable texts	   
		for (WebElement web : selectable) {
			String text = web.getText();
			System.out.println(text);
		}
		// get selectable size
	    int size = selectable.size();
		System.out.println(size);
		
		
		  //action is used to use mouse and click
		
		Actions actions=new Actions(driver);
		Actions select = actions.keyDown(Keys.CONTROL);    //click ctrl key
		select.click(selectable.get(0));                  
		select.click(selectable.get(1));
		select.click(selectable.get(2));
		select.build().perform();                //last stage build and perform
		
		
		
	}

}
