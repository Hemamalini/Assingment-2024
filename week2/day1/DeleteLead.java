package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {	
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//span[@class=\"x-tab-strip-text \"])[2]")).click();
		driver.findElement(By.xpath("//input[@name=\"phoneNumber\"]")).sendKeys("123456");
		driver.findElement(By.className("x-btn-text")).click();
		String text = driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println("The lead ID of the first resulting lead is : "+text);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();//doubt to get dynamic
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(text);
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		String text2 = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]")).getText();
		if (text2.equals("No records to display")) {
			System.out.println(" the successful deletion");
		} else {
			System.out.println(" the not deleted");
		}
	}

}
