package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//img[@src='images/image.png']")).click();
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
		
	}


	}


