package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;

public class Facebook {
	
	
	

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(" https://en-gb.facebook.com/");
		WebElement createNew = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		createNew.click();
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Sakura");   
		driver.findElement(By.name("lastname")).sendKeys("Haruno"); 
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext _58mg')])[3]")).sendKeys("7010852846");
		driver.findElement(By.xpath("//input[@data-type='password']")).sendKeys("18#Hawlin");
		
		WebElement fbData =driver.findElement(By.id("day"));
		Select dropDown = new Select(fbData);
		dropDown.selectByVisibleText("6");
		WebElement fbData2 =driver.findElement(By.id("month"));
		Select dropDown2 = new Select(fbData2);
		dropDown2.selectByValue("3");
		WebElement fbData3 =driver.findElement(By.id("year"));
		Select dropDown3 = new Select(fbData3);
		dropDown3.selectByValue("1998");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		
		
		
		

	}

}
