package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Listajio {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		List<WebElement> brand = driver.findElements(By.xpath("//div[@class='brand']"));
		int size = brand.size();
		System.out.println("The number of bags in the page is : "+size);
		for(WebElement i :brand ) {
			String text = i.getText();
			System.out.println("The Brand Name "+text);
		}
		List<WebElement> bagName = driver.findElements(By.className("nameCls"));
		for(WebElement j : bagName) {
			String text = j.getText();
			System.out.println("The Bag Name "+text);
		}
		driver.close();

	}

}
