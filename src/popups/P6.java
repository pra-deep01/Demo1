package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://paytm.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'  Watch Video ')]"));
		Thread.sleep(3000);
		driver.switchTo().frame(ele);
		Thread.sleep(3000);
		ele.click();

	}

}
