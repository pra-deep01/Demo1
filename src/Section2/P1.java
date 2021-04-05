package Section2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.id("searchDropdownBox"));
		Select s=new Select(ele);
		Thread.sleep(3000);
		s.selectByIndex(4);
		Thread.sleep(3000);
		s.selectByValue("search-alias=mobile-apps");
		Thread.sleep(3000);
		s.selectByVisibleText("Clothing & Accessories");
		s.deselectByIndex(4);
		
		Thread.sleep(3000);
	System.out.println(	s.isMultiple());
	List<WebElement> a = s.getOptions();
	System.out.println(a.size());
	for(   WebElement b:a)
	{
		System.out.println(b.getText());
	}
	
		driver.quit();
	}

}
