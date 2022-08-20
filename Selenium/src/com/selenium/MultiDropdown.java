package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='cars']"));
		Select s=new Select(dropdown);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		
		System.out.println("**Get All Options**");
		List<WebElement> option = s.getOptions();
		for (WebElement options : option) {
			String getoption = options.getText();
			System.out.println(getoption);  
		}
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(3);
		
		System.out.println("**Get all selected options**");
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for (WebElement allselect : allSelectedOptions) {
			
			String all = allselect.getText();
			System.out.println(all);
			
		}
		System.out.println("**Get first select option**");
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String first = firstSelectedOption.getText();
		System.out.println(first);
		Thread.sleep(3000);
		s.deselectAll();
		driver.close();
	
		
		
	}
}
