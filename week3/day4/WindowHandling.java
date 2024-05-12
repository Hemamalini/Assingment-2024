package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		String title = driver.getTitle();
		Thread.sleep(2000);
		//First Contact
		driver.findElement(By.xpath("//img[@src='/images/fieldlookup.gif']/parent::a")).click();
		String mainWindow = driver.getWindowHandle();
		Set<String> subWindow = driver.getWindowHandles();
		List<String> subWindowList = new ArrayList<String>(subWindow);
		driver.switchTo().window(subWindowList.get(1));
		//System.out.println(""+driver.switchTo().window(subWindowList.get(1)));
		WebElement firstContact = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]"));
		String firstText = firstContact.getText();
		firstContact.click();
		driver.switchTo().window(mainWindow);
		driver.findElement(By.id("ComboBox_partyIdFrom")).sendKeys(firstText);
		//Second Contact
		driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif']/parent::a)[2]")).click();
		String mainWindow1 = driver.getWindowHandle();
		Set<String> subWindow1 = driver.getWindowHandles();
		List<String> subWindowList1 = new ArrayList<String>(subWindow1);
		driver.switchTo().window(subWindowList1.get(1));
		WebElement secondContact = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]"));
		String secondText = secondContact.getText();
		System.out.println(secondContact+" "+secondText);

		secondContact.click();
		driver.switchTo().window(mainWindow1);
		driver.findElement(By.id("ComboBox_partyIdTo")).sendKeys(secondText);
		//Merge
		driver.findElement(By.linkText("Merge")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		String title2 = driver.getTitle();

		if (title2=="View Contact | opentaps CRM") {
			System.out.println("Merge is sucessful "+title2);
			driver.close();
		}else
			System.out.println("Merge is not sucessful");


	}

}
