package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/drop.html");
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//Actions syntax ;
		Actions actions=new Actions(driver);
		//1st : click and hold
/*      Actions draghold = actions.clickAndHold(drag);
		//2nd :move to element
		Actions drop1 = draghold.moveToElement(drop);
		//3rd : release the button
		Actions release = drop1.release(drop);
		//action and perform 
		release.build().perform();              */
		
		// this is simplest method also 
		actions.dragAndDrop(drag, drop).build().perform();
		
		
		
	} 
}
