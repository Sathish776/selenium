package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Signup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fb%2F%3F_encoding%3DUTF8%26ie%3DUTF8%26node%3D17369456031%26ref_%3Dnav_newcust&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	     driver.manage().window().maximize();
	     WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
	     name.sendKeys("Sathish kumar");
	     
	     WebElement mobile = driver.findElement(By.xpath("//input[@type='tel']"));
	     mobile.sendKeys("801238342");
	     WebElement email = driver.findElement(By.xpath("//input[@type='email']"));
	     email.sendKeys("satheshkumar123@gmail.com");
	     WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	     password.sendKeys("12345678");
	     WebElement signup = driver.findElement(By.xpath("//input[@type='submit']"));
	     signup.click();
	}

}
