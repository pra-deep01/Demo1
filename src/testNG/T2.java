package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class T2 {
	public WebDriver driver;
@BeforeMethod
public void startApp1() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	 driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@Test
public void task1() throws InterruptedException
{
	WebElement ele = driver.findElement(By.id("twotabsearchtextbox"));
	Actions a=new Actions(driver);
	a.contextClick(ele).perform();
	Thread.sleep(3000);	
}
@AfterMethod
public void stopApp1()
{
	driver.quit();
}
}
