package com.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flight_ticket {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement from = driver.findElement(By.xpath("//label[@for='fromCity']"));
		from.click();
		WebElement enter1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		enter1.sendKeys("Tiruchirapalli");
		Thread.sleep(3000);
		enter1.sendKeys(Keys.ARROW_DOWN);
		enter1.sendKeys(Keys.ENTER);
		
		
		WebElement enter2 = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		enter2.sendKeys("chennai");
		Thread.sleep(3000);
		enter2.sendKeys(Keys.ARROW_DOWN);
		enter2.sendKeys(Keys.ENTER);
		
		
		WebElement next = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
		js.executeScript("arguments[0].click()", next);
		
		
		WebElement from1 = driver.findElement(By.xpath("//div[@aria-label='Thu Oct 20 2022']"));
        js.executeScript("arguments[0].click();", from1);
        
        WebElement todate = driver.findElement(By.xpath("(//span[@class='lbl_input latoBold appendBottom10'])[2]"));
		todate.click();
		WebElement to = driver.findElement(By.xpath("//div[@aria-label='Mon Oct 31 2022']"));
		js.executeScript("arguments[0].click();", to);

        
        WebElement travelers = driver.findElement(By.xpath("//label[@for='travellers']"));
        travelers.click();
        
        WebElement adult = driver.findElement(By.xpath("//li[@data-cy='adults-2']"));
        adult.click();
        
        WebElement child = driver.findElement(By.xpath("//li[@data-cy='children-2']"));
        js.executeScript("arguments[0].click()", child);
        
        WebElement age = driver.findElement(By.xpath("//li[@data-cy='infants-0']"));
        js.executeScript("arguments[0].click()",age);
        
        WebElement ok = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
        js.executeScript("arguments[0].click();",ok);
      
        WebElement search = driver.findElement(By.xpath("//a[text()='Search']"));
        js.executeScript("arguments[0].click();",search);
        
        WebElement go = driver.findElement(By.xpath("(//span[@class='outer'])[1]"));
		js.executeScript("arguments[0].click()", go);
		
		WebElement booknow = driver.findElement(By.xpath("//button[text()='Book Now']"));
		js.executeScript("arguments[0].click()", booknow);
		
		String windowHandle = driver.getWindowHandle();
		
		WebElement continues = driver.findElement(By.xpath("//button[text()='Continue']"));
		js.executeScript("arguments[0].click()", continues);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> wh=new ArrayList<>(windowHandles);
		driver.switchTo().window(wh.get(1));
		
		
		WebElement click = driver.findElement(By.xpath("(//label[@class='radio'])[1]"));
	       js.executeScript("arguments[0].scrollIntoView()", click);
	       js.executeScript("arguments[0].click()", click);
        
        
        WebElement adultname1 = driver.findElement(By.xpath("//button[text()='+ ADD NEW ADULT']"));
 	   js.executeScript("arguments[0].click()", adultname1);
 	   
 	   driver.findElement(By.xpath("//input[@placeholder='First & Middle Name']")).sendKeys("sathesh"+Keys.TAB);
 	   driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("kumar"+Keys.TAB);
 	   driver.findElement(By.xpath("//label[@tabindex='0']")).click();
 	   
 	  WebElement adultname2 = driver.findElement(By.xpath("//button[text()='+ ADD NEW ADULT']"));
	   js.executeScript("arguments[0].click()", adultname2);
	   
	   driver.findElement(By.xpath("(//input[@placeholder='First & Middle Name'])[2]")).sendKeys("sathish"+Keys.TAB);
	   driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[2]")).sendKeys("kumar"+Keys.TAB);
	   driver.findElement(By.xpath("(//label[@tabindex='0'])[2]")).click();
 	   
 	   WebElement child1 = driver.findElement(By.xpath("(//button[@class='addTravellerBtn'])[2]"));
 	   js.executeScript("arguments[0].click()", child1);
 	   Thread.sleep(4000);
 	   driver.findElement(By.xpath("(//input[@placeholder='First & Middle Name'])[3]")).sendKeys("santhosh"+Keys.TAB);
 	   driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[3]")).sendKeys("kumar"+Keys.TAB);
 	   WebElement male1 = driver.findElement(By.xpath("(//label[@tabindex='0'])[3]"));
 	  js.executeScript("arguments[0].click()", male1);
 	   
 	   WebElement child2 = driver.findElement(By.xpath("(//button[@class='addTravellerBtn'])[2]"));
 	   js.executeScript("arguments[0].click()", child2);
 	   driver.findElement(By.xpath("(//input[@placeholder='First & Middle Name'])[4]")).sendKeys("ragul"+Keys.TAB);
 	   driver.findElement(By.xpath("(//input[@placeholder='Last Name'])[4]")).sendKeys("kumar"+Keys.TAB);
 	   WebElement male2 = driver.findElement(By.xpath("(//label[@tabindex='0'])[4]"));
 	  js.executeScript("arguments[0].click()", male2);
 	   
 	   WebElement mobile = driver.findElement(By.xpath("//input[@placeholder='Mobile No']"));
 		mobile.sendKeys("8012338342");
 		WebElement email = driver.findElement(By.xpath("//input[@placeholder='Email']"));
 		email.sendKeys("satheshkumar66.sk@gmail.com"+Keys.TAB);
 		
 		WebElement continuee = driver.findElement(By.xpath("//button[text()='Continue']"));
 		js.executeScript("arguments[0].click()",continuee);
 		
       String windowHandle1 = driver.getWindowHandle();
 		
 		WebElement conf = driver.findElement(By.xpath("//button[@class='button buttonPrimary buttonBig fontSize14']"));
		conf.click();
		
		driver.getWindowHandle();
		WebElement nomy = driver.findElement(By.xpath("//span[text()='No, Let Me Choose']"));
		js.executeScript("arguments[0].click()", nomy);
		driver.findElement(By.xpath("(//div[@class='relative'])[21]")).click();
		driver.findElement(By.xpath("(//div[@class='relative'])[22]")).click();
		driver.findElement(By.xpath("(//div[@class='relative'])[25]")).click();
		driver.findElement(By.xpath("(//div[@class='relative'])[26]")).click();
		
		driver.findElement(By.xpath("//button[@class='sliderNextBtn']")).click();
		driver.getWindowHandle();
		WebElement noits = driver.findElement(By.xpath("//div[@class='seatBookOverlayWrap']//span[@class='fontSize16 linkText']"));
		js.executeScript("arguments[0].click()", noits);
		
		driver.findElement(By.xpath("(//div[@class='relative'])[97]")).click();
		driver.findElement(By.xpath("(//div[@class='relative'])[98]")).click();
		driver.findElement(By.xpath("(//div[@class='relative'])[101]")).click();
		driver.findElement(By.xpath("(//div[@class='relative'])[102]")).click();
		
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
		WebElement proceedpay = driver.findElement(By.xpath("//button[text()='Proceed to pay']"));
		proceedpay.click();
		
		
 		
 		
 		
        
        
 
		}
		 
		
		
		
		
		
		
		
		
		
		
		
	}

