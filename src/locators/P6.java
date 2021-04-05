package locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.id("searchDropdownBox"));
		
		Select s=new Select(ele);
		List<WebElement> option = s.getOptions();
		System.out.println(option.size());
		for(   WebElement b:option)
		{
			System.out.println(b.getText());
		}
		driver.quit();
	}
	}