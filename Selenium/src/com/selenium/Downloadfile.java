package com.selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloadfile {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	    driver.get("http://www.leafground.com/pages/download.html");	
		WebElement file1 = driver.findElement(By.linkText("Download Excel"));
		file1.click();
		
		//// files check in windows  
		
		File file=new File ("C:\\Users\\Sathish\\Downloads");
		File[] totalfiles = file.listFiles();
		for (File file2 : totalfiles) {
        if (file2.getName().equals("eclipse-inst-jre-win64.exe")) {
			System.out.println("file downloaded");
			break;

		}
			
			
		}
			
		}
		
		
		
		
		
		
		
	
}
