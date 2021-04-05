package action;

import java.awt.List;
import java.util.AbstractList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A11 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		WebElement e = driver.findElement(By.id("gh-btn"));
		System.out.println(e.isEnabled());
		
		WebElement ele = driver.findElement(By.id("gh-cat"));
		Select s = new Select(ele);
		s.selectByIndex(4);
		s.selectByValue("625");
		s.selectByVisibleText("Cell Phones & Accessories");
		System.out.println(s.isMultiple());
		System.out.println();	 
		java.util.List<WebElement> a = s.getOptions();
		System.out.println("No of options available:"+a.size());
		for(WebElement b : a)
		{
			System.out.println(b.getText());
		}
	}
}
