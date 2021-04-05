package action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A001 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.learnmall.in/");
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.id("navbarDropdown"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Login or Signup']")).click();
	}

}
