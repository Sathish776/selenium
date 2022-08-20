package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");	
	    JavascriptExecutor js=(JavascriptExecutor)driver;
	    //scroll up
	/*    js.executeScript("window.scrollBy(0,1000)");
	    
	    Thread.sleep(3000);
	    //scroll down
	    js.executeScript("window.scrollBy(0,-1000)");
	    

	    //bottom page
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	    
	    //top page
	    js.executeScript("window.scroll(0,0)");      */
	    
	    //specific element
	    WebElement link = driver.findElement(By.xpath("//a[text()='Your Account']"));
		js.executeScript("arguments[0].scrollIntoView()",link);
		
		
		
		
		
		
		
		
	}
}
