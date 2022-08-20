package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttons {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		
		       // Get X,Y value
		WebElement getposition = driver.findElement(By.xpath("//button[@id='position']"));
		Point xyposition = getposition.getLocation();
		int xvalue = xyposition.getX();
		int yvalue = xyposition.getY();
		System.out.println("the X value is :"+ xvalue);
		System.out.println("the Y value is :"+ yvalue);
		
		     // Get Button colour
		WebElement getcolour = driver.findElement(By.xpath("//button[@id='color']"));
		String colour = getcolour.getCssValue("background-color");
		System.out.println("the button colour is :"+colour);
		
		   //Get button size
		WebElement buttonsize = driver.findElement(By.xpath("//button[@id='size']"));
		Dimension size = buttonsize.getSize();
		int height = size.getHeight();
		int width = size.getWidth();
		System.out.println("Button height is : "+height);
		System.out.println("Button width is :"+width);
		
		WebElement home = driver.findElement(By.xpath("//button[@id='home']"));
		home.click();
}
}
