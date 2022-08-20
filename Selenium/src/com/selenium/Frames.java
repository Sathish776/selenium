package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/frame.xhtml");
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='default.xhtml']"));
		driver.switchTo().frame(frame1);
		WebElement button = driver.findElement(By.xpath("(//button[@id='Click'])[1]"));
		button.click();
		String gettext = button.getText();
		System.out.println(gettext);
		driver.switchTo().defaultContent();
		WebElement frame2 = driver.findElement(By.xpath("(//iframe[@scrolling='no'])[3]"));
		driver.switchTo().frame(frame2);
		WebElement frame3 = driver.findElement(By.xpath("//iframe[@src='framebutton.xhtml']"));
		driver.switchTo().frame(frame3);
		//WebElement button2 = driver.findElement(By.xpath("//button[@style='background: linear-gradient(240deg, #4b7ecf 0%, #8e70ee 100%); color:#ffffff;border: 0 none;width:15%;height:40%']"));
		WebElement button2 = driver.findElement(By.id("Click"));
		button2.click();
		driver.switchTo().defaultContent();
		List<WebElement> frame4 = driver.findElements(By.tagName("iframe"));
		int size = frame4.size();
		System.out.println("Total Frames ;" + size);
		
	}

}
