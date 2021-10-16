package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

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
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("cskvigneshwaran@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		WebElement findElement = driver.findElement(By.linkText("Vignesh"));
		String str2 = findElement.getText();
		driver.findElement(By.xpath("//a[text()='18869']")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Duplicate Lead")).click();
		String title = driver.getTitle();
		if (title.contains("Duplicate Lead")) {
			System.out.println("Title verified");
		} else {
			System.out.println("Mismatch");
		}
		String attribute = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		if (str2.equals(attribute)) {
			System.out.println("Name verified");
		}
	}


	}


