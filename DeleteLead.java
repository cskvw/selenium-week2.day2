package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7010852846");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		// lead id value-18856 Vignesh Waran Test leaf 1 7010852846
	

		driver.findElement(By.xpath("//a[text()='18856']")).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("18856");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		WebElement findElement = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String text = findElement.getText();
		String rec= "No records to display";
		if(rec.equals(text))
		{
			System.out.println("Record  has been deleted");
		}
	

	      driver.close();

	}

}


