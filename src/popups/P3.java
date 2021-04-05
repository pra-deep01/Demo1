 package popups;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://my.naukri.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Register for Free']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='I am a Fresher']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("uploadCV")).sendKeys("C:\\Users\\hp\\Downloads\\Fresher Resume Pattern 4.docx");
	}
}
