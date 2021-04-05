package webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class w1{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		String a = ele.getText();
		System.out.println(a);
		
		driver.get("https://www.instagram.com/");
		WebElement ele2 = driver.findElement(By.xpath("//span[text()='Log in with Facebook']"));
		String b = ele2.getText();
		System.out.println(b);
		Thread.sleep(3000);
		driver.quit();
	}
}
