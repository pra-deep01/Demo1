package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("pra__deep");
		driver.findElement(By.name("password")).sendKeys("pradeep98445");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Show']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Log In']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Log in with Facebook']")).click();
		Navigation nav = driver.navigate();
		nav.back();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgot password?")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("cppEmailOrUsername")).sendKeys("012.jpradeep@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Send Login Link']")).click();
        Thread.sleep(3000);
        driver.quit();
	}
}
