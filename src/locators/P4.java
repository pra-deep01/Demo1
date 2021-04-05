package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Hello, Sign in']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ap_email")).sendKeys("9844544322");
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("ap_password")).sendKeys("pradeep98445");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("nav-cart-count")).click();
		Thread.sleep(3000);
		
		
		/*driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("auth-fpp-link-bottom")).click();
		driver.findElement(By.id("continue")).click();*/
		
	}
}