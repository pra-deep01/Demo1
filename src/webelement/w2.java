package webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class w2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("email"));
	    System.out.println(ele.getAttribute("class"));
	
	    driver.get("https://www.instagram.com/");
	    WebElement ele1 = driver.findElement(By.xpath("//span[text()='Sign up']"));
	    String a = ele1.getAttribute("class");
	    System.out.println(a);
	    driver.quit();
		

	}

}
