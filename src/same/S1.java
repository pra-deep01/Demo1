package same;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class S1 {
	public WebDriver driver;
	@BeforeMethod
	public void start()
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
		}
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
		Thread.sleep(3000);
	}
	@AfterMethod
	public void stop()
	{
		driver.close();
	}
	

}
