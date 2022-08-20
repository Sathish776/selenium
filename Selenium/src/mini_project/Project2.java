package mini_project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project2 {
@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException { 
	
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement hotel = driver.findElement(By.xpath("//li[@data-cy='menu_Hotels']"));
		hotel.click();
		
		WebElement city = driver.findElement(By.xpath("//label[@for='city']"));
		city.click();
		Thread.sleep(5000);
		WebElement entercity = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		entercity.sendKeys("Chennai, Tamil Nadu, India");
		//js.executeScript("arguments[0].setAttribute('value','Chennai, Tamil Nadu, India');", entercity);
		
		//js.executeScript("arguments[0].value='chennai'", entercity);
		
		WebElement checkin= driver.findElement(By.xpath("//label[@for='checkin']"));
		checkin.click();
		
		WebElement date = driver.findElement(By.xpath("//div[@aria-label='Thu Sep 15 2022']"));
		date.click();
		WebElement checkout = driver.findElement(By.xpath("//div[@aria-label='Sat Sep 17 2022']"));
		checkout.click();
		
		WebElement adult = driver.findElement(By.xpath("//li[@data-cy='adults-3']"));
		adult.click();
		
		WebElement child = driver.findElement(By.xpath("//li[@data-cy='children-1']"));
	    child.click();
	    WebElement childage = driver.findElement(By.xpath("//select[@class='ageSelectBox']"));
	    Select s= new Select(childage);
	    s.selectByVisibleText("5");
	    
	   // webDriverWait wait=new webDriverWait//button[@data-cy='submitGuest'][1]
	    
	    
	    Thread.sleep(200);
	 
	  
	    
	    WebElement submit = driver.findElement(By.xpath("//button[@data-cy='submitGuest']"));
	   
	    
	   
	    js.executeScript("arguments[0].click();", submit);
	    WebElement search = driver.findElement(By.xpath("(//button[@type='button'])[1]"));
	    search.click();
	    
	    
	    
	    
	    
	
	
}
}