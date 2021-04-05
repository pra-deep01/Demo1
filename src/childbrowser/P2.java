//WACT get the count and print all the titles
package childbrowser;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://naukri.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		String a = driver.getWindowHandle();
		System.out.println(a);
		Set<String> b = driver.getWindowHandles();
		System.out.println(b.size());
		Thread.sleep(3000);
		for( String r:b)
		{
			driver.switchTo().window(r);
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
		}
		driver.quit();
		

	}

}
