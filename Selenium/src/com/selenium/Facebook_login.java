package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_login {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	WebElement emailid = driver.findElement(By.xpath("//input[@id='email']"));
	emailid.sendKeys("satheshkumar@gmail.com");
	boolean displayed = emailid.isDisplayed();
	System.out.println(displayed);
	WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
	password.sendKeys("12345678");
	boolean enabled = password.isEnabled();
	System.out.println(enabled);
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	//driver.quit();
}
}
