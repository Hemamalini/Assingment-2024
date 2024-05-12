package week1.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement userElement = driver.findElement(By.id("username"));
		WebElement passElement = driver.findElement(By.id("password"));
		WebElement loginElement = driver.findElement(By.className("decorativeSubmit"));
		userElement.sendKeys("demosalesmanager");
		passElement.sendKeys("crmsfa");
		loginElement.click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		//driver.findElement(By.id("accountName")).sendKeys("User2");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hema");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("C");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon");
		driver.findElement(By.name("generalProfTitle")).sendKeys("Selenium");
		driver.findElement(By.className("smallSubmit")).click();
	}
}
