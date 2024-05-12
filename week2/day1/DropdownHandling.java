package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DropdownHandling {

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
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		WebElement Source = driver.findElement(By.xpath("//select[@name='dataSourceId']"));
		WebElement MarketingCampaign = driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		WebElement Ownership = driver.findElement(By.xpath("//select[@name='ownershipEnumId']"));
		
		Select SourceDropdown = new Select(Source);
		SourceDropdown.selectByIndex(1);
		Select MarketDropdown = new Select(MarketingCampaign);
		MarketDropdown.selectByVisibleText("Automobile");
		Select OwnershipDropdown = new Select(Ownership);
		OwnershipDropdown.selectByValue("OWN_CCORP");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println("The tile of the page is : "+driver.getTitle());
		driver.close();
		
				
		
	}

}
