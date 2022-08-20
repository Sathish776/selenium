package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
@SuppressWarnings("deprecation")
public static void main(String[] args) {  
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement calendar = driver.findElement(By.xpath("//label[@for='departure']"));
	calendar.click();
	WebElement date = driver.findElement(By.xpath("(//div[@class='DayPicker-Day'])[30]"));
	date.click();
	
	
	
	//WebElement nextmonth = driver.findElement(By.xpath("(//span[@role='button'])[2]"));
	//boolean size  = nextmonth.isSelected();
	//System.out.println(size);
	//nextmonth.click();
	 
}
}
