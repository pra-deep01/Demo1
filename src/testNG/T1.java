package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class T1 {
	public WebDriver driver;
@BeforeMethod
public void startApp() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
@Test
public void task() throws InterruptedException
{
	WebElement ele = driver.findElement(By.xpath("//a[text()='Men']"));
	 Actions a=new Actions(driver);
	 a.moveToElement(ele).perform();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[text()='Blazers & Coats']")).click();
	 String title=driver.getTitle();
	SoftAssert s=new SoftAssert();
	s.assertEquals(title,"hdwiuhediuwehu");
	Reporter.log(title,true);
	String url=driver.getCurrentUrl();
	Reporter.log(url,true);
	s.assertAll();
}
@AfterMethod
public void stopApp() 
{
	driver.close();
}
}
