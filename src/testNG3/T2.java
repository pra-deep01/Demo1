package testNG3;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class T2 extends Base {
@Test
public void case2() throws InterruptedException
{
	Thread.sleep(3000);
	driver.findElement(By.id("nav-cart-count")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//span[@class='a-size-base-plus'])")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("continue")).click();
}
}
