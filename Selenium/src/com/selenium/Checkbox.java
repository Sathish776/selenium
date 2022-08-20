package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		WebElement java = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		java.click();
		WebElement sql = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
		sql.click();
		WebElement c = driver.findElement(By.xpath("(//input[@type='checkbox'])[4]"));
		c.click();
		WebElement check = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
		boolean clickornot1 = check.isSelected();
		System.out.println("check box 1 is "+clickornot1);
		
		WebElement check2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[7]"));
		boolean clickornot2 = check2.isSelected();
		System.out.println("check box 2 is"+clickornot2);
		
		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[14]")).click();
		
		
		
}
}
