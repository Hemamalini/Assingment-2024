package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Durations;

public class SelectclassFaceBook {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("xxx");
		driver.findElement(By.name("lastname")).sendKeys("Y");
		driver.findElement(By.name("reg_email__")).sendKeys("zzz@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("YYYYY@123");
		//drop down
		WebElement dayElement = driver.findElement(By.id("day"));
		dayElement.click();
		Select dayDropDown = new Select(dayElement);
		dayDropDown.selectByValue("6");
		
		WebElement monthElement = driver.findElement(By.id("month"));
		monthElement.click();
		Select monthDropDown = new Select(monthElement);
		monthDropDown.selectByVisibleText("May");
		
		WebElement yearElement = driver.findElement(By.id("year"));
		yearElement.click();
		Select yearDropDown = new Select(yearElement);
		yearDropDown.selectByVisibleText("2006");	
		//radio button
		driver.findElement(By.name("sex")).click();	
		driver.findElement(By.name("websubmit")).click();
	}

}
