package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		WebElement Alert1 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]"));
		Alert1.click();
		Alert A1 = driver.switchTo().alert();
		A1.accept();
		
		WebElement Alert2 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]"));
		Alert2.click();
		Alert A2 = driver.switchTo().alert();
		A2.dismiss();
		
		WebElement Alert3 = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]"));
		Alert3.click();
		Alert A3 = driver.switchTo().alert();
		A3.sendKeys("Hii Am Sathish");
		A3.accept();
		
		driver.close();
		
	}

}
