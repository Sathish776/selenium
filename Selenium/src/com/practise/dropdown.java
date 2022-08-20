package com.practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select select = new Select(dropdown1);
		select.selectByIndex(1);
		
		WebElement dropdown2 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select s1=new Select(dropdown2);
		List<WebElement> options = s1.getOptions();
	    for (WebElement option : options) {
	    	String op = option.getText();
			System.out.println(op);
		}
	    
	    
	    WebElement dropdown3 = driver.findElement(By.xpath("(//select)[5]"));
        dropdown3.sendKeys("selenium");
	    
	    
	    
	    
		
		
		
		
		
		
		
		
}
}