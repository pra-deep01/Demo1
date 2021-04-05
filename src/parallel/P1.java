package parallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class P1 {
	public WebDriver driver;
@BeforeMethod
public void startApp()
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
}
@Parameters({"Browsername"})
@Test
public void task(String browser) throws InterruptedException
{
	if(browser.equals("chrome"))
	{
		driver=new ChromeDriver();
	}
	else
	{
		driver=new FirefoxDriver();
		Thread.sleep(3000);
	}
	driver.get("https://www.myntra.com/");
	WebElement ele = driver.findElement(By.xpath("//a[text()='Men']"));
	 Actions a=new Actions(driver);
	 a.moveToElement(ele).perform();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[text()='Blazers & Coats']")).click();
	 String title=driver.getTitle();
	Reporter.log(title,true);
	String url=driver.getCurrentUrl();
	Reporter.log(url,true);
	
}
@AfterMethod
public void close()
{
	driver.close();
}
}
