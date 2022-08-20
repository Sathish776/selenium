package com.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		driver.get("https://payments.makemytrip.com/ui/checkout/?id=691446322219175&hasErrors=1");
		WebElement cardnum = driver.findElement(By.xpath("//input[@id='cardNumber']"));
		cardnum.sendKeys("4786790031942335");
		WebElement cname = driver.findElement(By.xpath("//input[@id='nameOnCard']"));
		cname.sendKeys("sathish kumar");
		
		WebElement cmonth = driver.findElement(By.xpath("//p[@class='form__field form__field--select lato-bold  border__right--radius-zero width__170 lightgray-text']"));
		cmonth.click();
		Select s= new Select(cmonth);
		s.selectByIndex(3);
		WebElement cyear = driver.findElement(By.xpath("//p[@class='form__field form__field--select lato-bold  border__left--radius-zero  lightgray-text']"));
		Select s1=new Select(cyear);
		s1.selectByVisibleText("2025");
		driver.findElement(By.xpath(""));
		
		driver.findElement(By.xpath(""));
		
		
		
		
	}
}
