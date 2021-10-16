package week2.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LauchBrowser {

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
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test leaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vignesh");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Waran");
        driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7010852846");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("cskvigneshwaran@gmail.com");
        driver.findElement(By.name("submitButton")).click();
        
        
		
		

	}

}
