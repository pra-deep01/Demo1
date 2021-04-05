package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Properties p = new Properties();
		FileInputStream fi = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Selenium\\fb.properties");
		p.load(fi);
		Thread.sleep(3000);
		driver.get(p.getProperty("url"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[contains(@role,'button')]")).click();
		driver.findElement(By.name("firstname")).sendKeys(p.getProperty("fname"));
		driver.findElement(By.name("lastname")).sendKeys(p.getProperty("sname"));
		driver.findElement(By.name("reg_email__")).sendKeys(p.getProperty("email"));
		driver.findElement(By.name("reg_passwd__")).sendKeys("pass");
		WebElement d=driver.findElement(By.id("day"));
		Select s = new Select(d);
		s.selectByIndex(12);
		//WebElement m =driver.findElement(By.id("month"));
		s.selectByValue("12");
		//WebElement m =driver.findElement(By.id("year"));
		s.selectByVisibleText("1998");	

		
		
	}
}


