package webelement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class w5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement untf = driver.findElement(By.id("email"));
		if(untf.isDisplayed())
		{
			System.out.println("pass : untf is displayed");
			untf.sendKeys("hckjshd");
	    }
		else
		{
			System.out.println("fail");	
		}
		
		WebElement login = driver.findElement(By.name("login"));
		if(login.isEnabled())
		{
			System.out.println("pass");
			login.click();
		}
		else
		{
			System.out.println("fail");
		}
			
		driver.quit();

	}

}
