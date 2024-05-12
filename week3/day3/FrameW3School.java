package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameW3School {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame("iframeResult");//frameId
		WebElement tryElement = driver.findElement(By.xpath("//button[text()='Try it']"));
		tryElement.click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
		//driver.switchTo().defaultContent();//helps to move to element to main page
		driver.close();
		
		
	}
}
