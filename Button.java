package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElement(By.id("home")).click();
		driver.get("http://leafground.com/pages/Button.html");
		System.out.println(driver.findElement(By.id("position")).getLocation().getX());
		System.out.println(driver.findElement(By.id("color")).getCssValue("background-color"));
		WebElement findSize = driver.findElement(By.id("size"));
		Dimension str2=findSize.getSize();
		System.out.println(str2);

	}

}
