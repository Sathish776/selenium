package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		WebElement radio1 = driver.findElement(By.xpath("(//input[@class='myradio'])[1]"));
		radio1.click();
		
		WebElement check1 = driver.findElement(By.xpath("(//input[@value='0'])[2]"));
		boolean status1 = check1.isSelected();
		
		WebElement check2 = driver.findElement(By.xpath("(//input[@value='1'])[2]"));
		boolean status2 = check2.isSelected();
		System.out.println(status1);
		System.out.println(status2);
		
		WebElement ageselect = driver.findElement(By.xpath("(//input[@value='0'])[3]"));
		ageselect.click();
		
		
		
		

}
}
