package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
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
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_companyName\"]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstName\"]")).sendKeys("xxx");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_lastName\"]")).sendKeys("y");
		driver.findElement(By.xpath("//input[@id=\"createLeadForm_firstNameLocal\"]")).sendKeys("zzz");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("TESTING NEEDS SELENIUM");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("xxx@gmail.com");
		WebElement statefindElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		statefindElement.click();
		Select stateDropdown = new Select(statefindElement);
		stateDropdown.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();	
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("selenium important");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		driver.close();
	}

}
