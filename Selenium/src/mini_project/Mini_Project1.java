package mini_project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("Sathesh123");
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("12345678@");
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		Select s =new Select(location);
		s.selectByVisibleText("Paris");
		
		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1=new Select(hotel);
		s1.selectByIndex(2);
		
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s2=new Select(room);
		s2.selectByIndex(3);
		
		WebElement room1 = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s3=new Select(room1);
		s3.selectByIndex(1);
		
        WebElement checkindate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		checkindate.sendKeys("20/08/2022");
		
		WebElement checkoutdate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		checkoutdate.sendKeys("21/08/2022");
		
		WebElement adlut = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s4=new Select(adlut);
		s4.selectByValue("2");
				
		WebElement children = driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s5=new Select(adlut);
		
		WebElement submit = driver.findElement(By.xpath("//input[@name='Submit']"));
		submit.click();
		
		WebElement click = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
		click.click();
		
		WebElement continue1 = driver.findElement(By.xpath("//input[@name='continue']"));
		continue1.click();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		firstname.sendKeys("Sathish");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		lastname.sendKeys("kumar");
		
		WebElement adress = driver.findElement(By.xpath("//textarea[@name='address']"));
		adress.sendKeys("Sathish kumar , pudukkottai , tamilnadu , india ");
		
		WebElement ccno = driver.findElement(By.xpath("//input[@name='cc_num']"));
		ccno.sendKeys("4027094865475000");
		
		WebElement cctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		Select s6=new Select(cctype);
		s6.selectByVisibleText("VISA");
	
		WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Select s7=new Select(month);
		s7.selectByIndex(5);
		
		
		WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s8=new Select(year);
		s8.selectByVisibleText("2022");
		
		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvv.sendKeys("150");
		
		WebElement booknow = driver.findElement(By.xpath("//input[@name='book_now']"));
		booknow.click();
		
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Sathish\\eclipse-workspace\\Selenium\\Screenshot\\miniproject.png");
		FileUtils.copyFile(source,destination);
		driver.close();
		
		
		
		
		
		
	}

}
