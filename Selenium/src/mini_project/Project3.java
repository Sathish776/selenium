package mini_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project3 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in");
			WebElement searchbox = driver.findElement(By.xpath("//input[@type='text']"));
			searchbox.sendKeys("Iphone");
			driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
			WebElement mobile = driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
			mobile.click();
			
			List<WebElement> allmobile = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
			for (WebElement all : allmobile) {
				String text = all.getText();
				System.out.println(text);
			}
				
				List<WebElement> allprice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
				for (WebElement prices : allprice) {
					String text2 = prices.getText();
					System.out.println(text2);
					
				}
				
		}}
