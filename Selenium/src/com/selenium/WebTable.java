package com.selenium;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.leafground.com/table.xhtml");
			
			List<WebElement> list = driver.findElements(By.xpath("//table/tbody/tr/td"));
			
			for (WebElement all : list) {
				String data = all.getText();
				System.out.println(data);
				
			}
			
			System.out.println("*****************************");
			System.out.println("ROW DATA");
			List<WebElement> row = driver.findElements(By.xpath("//table/tbody/tr[5]/td"));
			for (WebElement rowonly : row) {
				String rows = rowonly.getText();
				System.out.println(rows);
			}
				
			System.out.println("**********************");
			System.out.println("COLOUMN DATA");
			List<WebElement> coloumn = driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
			for (WebElement countries : coloumn) {
				String country = countries.getText();
				System.out.println(country);
			}
			
			System.out.println("*****************************");
			System.out.println("ParticularData");
			List<WebElement> parti = driver.findElements(By.xpath("//table/tbody/tr[6]/td[2]"));
			for (WebElement particular : parti) {
				String single = particular.getText();
				System.out.println(single);
			}
	}
}
