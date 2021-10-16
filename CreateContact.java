package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Contacts")).click();
	    driver.findElement(By.linkText("Create Contact")).click();
	    driver.findElement(By.id("firstNameField")).sendKeys("Vignesh");
	    driver.findElement(By.id("lastNameField")).sendKeys("Waran");
	    driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Vignesh");
	    driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Waran");
	    driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Healthcare");
	    driver.findElement(By.id("createContactForm_description")).sendKeys("Working for Anthem.inc");
	    driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("warancgoxt@gmail.com");
	    driver.findElement(By.id("createContactForm_primaryPhoneNumber")).sendKeys("7010852846");
	    
	    WebElement locData =driver.findElement(By.id("createContactForm_generalCountryGeoId"));
		Select dropDown = new Select(locData);
		dropDown.selectByValue("USA");
	    WebElement locData2 =driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dropDown2 = new Select(locData2);
		dropDown2.selectByVisibleText("New York");
		
	    
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("skilled in AWS");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		 String str=driver.getTitle();
		 System.out.println("Page tilte" +str);
		
	    
	    
	}

}
