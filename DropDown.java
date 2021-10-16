package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.List;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		Select drop = new Select(dropDown1);
		drop.selectByVisibleText("Selenium");
		WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
		Select drop1 = new Select(dropDown2);
		drop1.selectByIndex(3);
		WebElement dropDown3 = driver.findElement(By.id("dropdown3"));
		Select drop2 = new Select(dropDown3);
		drop2.selectByValue("2");
		
		Select dropDown6 = new Select(driver.findElement(By.cssSelector("div#contentblock>section>div:nth-of-type(4)>select")));
		List<WebElement> elementCount = dropDown6.getOptions();
		System.out.println("Number of items: " + elementCount.size());
		
		
		WebElement dropDown5 = driver.findElement(By.xpath("(//option[@selected='selected'])[5]/parent::select"));
		Select drop4 = new Select(dropDown5);
		drop4.selectByVisibleText("UFT/QTP");
		WebElement dropDown7 = driver.findElement(By.xpath("(//option[@selected='selected'])[6]/parent::select"));
		Select drop7 = new Select(dropDown7);
		drop7.selectByVisibleText("Appium");
	
	}



}


