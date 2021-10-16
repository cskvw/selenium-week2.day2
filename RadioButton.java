package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.List;

public class RadioButton {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leafground.com/pages/radio.html");
		driver.findElement(By.xpath("//label[@for='yes']")).click();
		boolean enabled = driver.findElement(By.xpath("(//input[@type='radio'])[4]")).isSelected();
		if(enabled==true)
		{ 
			System.out.println("Default is checked");
		}
		else
		{
			System.out.println("Default is unchecked");

		}
		WebElement element = driver.findElement(By.xpath("(//input[@name='age'])[2]"));
		boolean b= element.isEnabled();
		if(b==true) {
			System.out.println("Age is already selceted");

	}

	}
	
}
