package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sathish\\Desktop\\Selenium\\chromedriver_win32//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get ("https://www.google.com/");
	driver.manage().window().maximize();
	//driver.navigate().refresh();
	//driver.quit();
	driver.findElement(By.name("q")).sendKeys("hello"+Keys.ENTER);
	driver.navigate().to("https://www.youtube.com/watch?v=YQHsXMglC9A");
	driver.findElement(By.name("search_query")).sendKeys("tamil songs"+Keys.ENTER);
	
}
}
 