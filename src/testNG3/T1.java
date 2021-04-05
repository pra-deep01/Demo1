package testNG3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class T1 extends Base{
	@Test
	public void case1() throws InterruptedException
	{
		WebElement ele = driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Start here.']")).click();
		driver.findElement(By.id("continue")).click();
		Thread.sleep(2000);
	}

}
