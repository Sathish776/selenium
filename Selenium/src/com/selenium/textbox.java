package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		WebElement email = driver.findElement(By.xpath("//input[@type='text']"));
		email.sendKeys("satheshkumar@gmail.com");
		WebElement text1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		text1.sendKeys("hello");
		//get Attribute from textbox
		WebElement getvalue = driver.findElement(By.xpath("//input[@name='username']"));
		getvalue.getAttribute("value");
		String value=getvalue.getAttribute("value");
		System.out.println(value);
		//clear textbox value
		WebElement cleartext = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		cleartext.clear();
		WebElement entertext = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
		entertext.sendKeys("how r u man");
		//check textbox is enable or not
		WebElement checktextbox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean check = checktextbox.isEnabled();
		System.out.println(check);
	}

}
