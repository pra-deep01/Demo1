package datadriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Property {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Properties properties=new Properties();
		FileInputStream inputstream=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Selenium\\data.properties");
		properties.load(inputstream);
		Thread.sleep(3000);
		driver.get(properties.getProperty("url"));
		driver.findElement(By.name("username")).sendKeys(properties.getProperty("un"));
		driver.findElement(By.name("password")).sendKeys(properties.getProperty("pass"));
		Thread.sleep(3000);
		driver.quit();
	}

}
