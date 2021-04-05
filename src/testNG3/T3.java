package testNG3;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T3 extends Base {
	@Test
	public void case3() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		JavascriptExecutor j = (JavascriptExecutor)driver;
		WebElement ele = driver.findElement(By.xpath("//span[text()='Appario Retail Private Ltd']"));
		Point p = ele.getLocation();
		int x = p.getX();
		int y = p.getY();
		j.executeScript("window.scrollBy("+x+","+y+")");
		Thread.sleep(2000);
		ele.click();
	}

}
