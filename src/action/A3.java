package action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("course"));
		Actions a=new Actions(driver);
	 a.moveToElement(ele).perform();
	 driver.findElement(By.xpath("//a[text()='API']")).click();
	 Thread.sleep(3000);
	 WebElement ele1 = driver.findElement(By.id("add"));
	a.doubleClick(ele1).perform();
	Thread.sleep(3000);
	driver.quit();
	}
}
