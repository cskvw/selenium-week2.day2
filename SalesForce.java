package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class SalesForce {

	public static void main(String[] args) {
	  
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Vigneshwaran");
		driver.findElement(By.name("UserLastName")).sendKeys("C S K");
		driver.findElement(By.name("UserEmail")).sendKeys("warancgoxt@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Kyndryl India");
		driver.findElement(By.name("UserPhone")).sendKeys("7010852846");
		
		WebElement sfData = driver.findElement(By.name("UserTitle"));
		Select dropDown =new Select(sfData);
		dropDown.selectByValue("Marketing_PR_Manager_AP");
		
		WebElement sfData1 = driver.findElement(By.name("CompanyEmployees"));
		Select dropDown1 =new Select(sfData1);
		dropDown1.selectByValue("75");
		
		WebElement sfData2 = driver.findElement(By.name("CompanyCountry"));
		Select dropDown2 =new Select(sfData2);
		dropDown2.selectByVisibleText("United States");
		
		WebElement state = driver.findElement(By.name("CompanyState"));
		Select dropdown4 = new Select(state);
		dropdown4.selectByVisibleText("Kentucky");
		
		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		
		
		
		
		
		
	}

}
