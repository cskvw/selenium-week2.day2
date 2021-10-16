package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
		System.out.println(driver.findElement(By.xpath("(//input[@type='checkbox'])[6]")).isSelected());
		boolean b1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).isSelected();
		System.out.println(b1);
		WebElement check2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[8]"));
		if (b1 == false) {
			System.out.println(" first box is unchecked");
		}
		System.out.println(" second box is checked");
		check2.click();

		driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
		driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
	}
}

	


