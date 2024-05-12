package week1.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("j_idt88:j_idt90")).click(); 
		String title = driver.getTitle();
		System.out.println("The Title of the page is : "+title);
		driver.navigate().back();
		boolean enabled = driver.findElement(By.name("j_idt88:j_idt92")).isEnabled();
		System.out.println("Confirm of the button is disabled : "+enabled);
		Point location = driver.findElement(By.name("j_idt88:j_idt94")).getLocation();
		System.out.println("The position of the button : "+location);
		String cssValue = driver.findElement(By.name("j_idt88:j_idt96")).getCssValue("color");
		System.out.println("The background color of the button : "+cssValue);
		Dimension size = driver.findElement(By.name("j_idt88:j_idt98")).getSize();
		System.out.println("The height and width of the button  : "+size);
	}
}
