package com.practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Signup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spotify.com/in-en/signup");
		WebElement email = driver.findElement(By.xpath("(//input[@type='email'])[1]"));
		email.sendKeys("sathishkumar55558@gmail.com");
		WebElement confirmmail = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
		confirmmail.sendKeys("sathishkumar55558@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("12345678@");
		WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		name.sendKeys("sathish kumar");
		WebElement year = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		year.sendKeys("2000");
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s=new Select(month);
		s.selectByIndex(8);
		WebElement day = driver.findElement(By.xpath("//input[@id='day']"));
		day.sendKeys("22");
		WebElement gender = driver.findElement(By.xpath("(//span[@class='Indicator-hjfusp-0 iGJrKq'])[1]"));
		gender.click();
		WebElement terms1 = driver.findElement(By.xpath("(//span[@class='Indicator-sc-1airx73-0 ihUlHW'])[1]"));
		terms1.click();
		WebElement terms2 = driver.findElement(By.xpath("(//span[@class='Indicator-sc-1airx73-0 ihUlHW'])[2]"));
		terms2.click();
		WebElement robot = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-checkmark']"));
		robot.click();
		WebElement signup = driver.findElement(By.xpath("//div[text()='Sign up']"));
		signup.click();
	}

		public void hello(){
			System.out.println("hai");
		}

	}

