//WAST close only the child browser
package childbrowser;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {

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
		b.remove(a);
		System.out.println("after removing a " +b.size());
		System.out.println(b);
		Thread.sleep(3000);
		for( String r:b)
		{
			driver.switchTo().window(r);
			driver.close();
		}
	}

}
