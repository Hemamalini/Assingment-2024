package week1.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundCheckBox {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("j_idt87:j_idt89")).click();
		driver.findElement(By.id("j_idt87:j_idt91")).click();
		
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		driver.findElement(By.className("ui-toggleswitch-slider")).click();
				boolean selected = driver.findElement(By.id("j_idt87:j_idt102")).isSelected();
		System.out.println("The Button is selected: "+selected);
		
		
}
}
