package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		WebElement eleData =driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDown = new Select(eleData);
		dropDown.selectByVisibleText("Direct Mail");
		
		WebElement eleData2 =driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropDown2 = new Select(eleData2);
		dropDown2.selectByIndex(7);
		
		WebElement eleData3 =driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropDown3 = new Select(eleData3);
		dropDown3.selectByValue("OWN_PARTNERSHIP");
		
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Automobile");
		
		
		
		
		
		
		
		
		
		
		
		





		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test leaf");
		// driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vignesh");
		// driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Waran");
		// driver.findElement(By.name("submitButton")).click();





	}




}


