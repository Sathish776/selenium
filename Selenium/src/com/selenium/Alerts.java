package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;

public class Alerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		    /* Alert Syntax ;
		             Alert refname = driver.switchTo().alert();
		     */
		
		WebElement alert1 = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		alert1.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		
		WebElement alert2 = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		alert2.click();
		Alert confirm=driver.switchTo().alert();
		confirm.accept();
		
		/*WebElement alert3 = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		alert3.click();
		Alert cancel=driver.switchTo().alert();
		cancel.dismiss();*/
		
		WebElement alert4 = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		alert4.click();
		Alert alerttxt=driver.switchTo().alert();
		alerttxt.sendKeys("hi am sathish");
		alerttxt.accept();
		
		
		
		
		
		
}
}
