package com.selenium;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		          /*select Dropdown syntax ;
		           Select s=new Select(WebElement);*/
		     
		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='dropdown1']"));
	    Select s=new Select(dropdown1);
	    s.selectByIndex(1);
	    
	    WebElement dropdown2 = driver.findElement(By.xpath("//select[@name='dropdown2']"));
	    Select s1=new Select(dropdown2);
	    s1.selectByVisibleText("UFT/QTP");
	    
	    WebElement dropdown3 = driver.findElement(By.xpath("//select[@name='dropdown3']"));
	    Select s2=new Select(dropdown3);
	    s2.selectByValue("4");
	    
	               /* get number of options syntax :
	                1). refname.getOptions(); ----(ctrl+2+l) 
	                2). options .size();
	                3). sysout(int refname);
	                  */
	                                     
	    WebElement dropdown4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
	    Select s3=new Select(dropdown4);
	    List <WebElement> options =s3.getOptions();
	    int size = options.size();
	    System.out.println("number of element is "+size);
	    
	    WebElement dropdown5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
	    dropdown5.sendKeys("selenium");
	    
	    WebElement dropdown6 = driver.findElement(By.xpath("(//select)[6]"));
	    Select s4=new Select(dropdown6);
	   boolean multiple = s4.isMultiple();
	    System.out.println(multiple);
	    System.out.println("***all options**");
	    List<WebElement> option = s4.getOptions();
        for (WebElement alloption : option) {
        	String optionss = alloption.getText();
        	   System.out.println(optionss); 	 
        
        }
        s4.selectByIndex(1);
        s4.selectByIndex(2);
        s4.selectByIndex(3);
        System.out.println("** All selected options**");
        List<WebElement> allselect = s4.getAllSelectedOptions();
        for (WebElement all : allselect) {
        	String allselected = all.getText();
        	System.out.println(allselected);
		}
        System.out.println("**First select option**");
        WebElement firstselect = s4.getFirstSelectedOption();
        String first = firstselect.getText();
        System.out.println(first);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       /* WebElement firstselect = s4.getFirstSelectedOption();
        String first = firstselect.getText();
        System.out.println(first);
        System.out.println("**selected options**");
        List<WebElement> allSelectedOptions = s4.getAllSelectedOptions();
        for (WebElement allselect : allSelectedOptions) {
       	 String text = allselect.getText();
       	 if(text.equalsIgnoreCase("Appium")) {
       		 System.out.println(text);
       	 }*/
       	 
			
		}
        }
	

