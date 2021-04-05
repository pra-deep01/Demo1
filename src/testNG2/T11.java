package testNG2;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;

import org.testng.annotations.Test;

public class T11 extends TestBase {
	
	@Test
	public void task() throws InterruptedException
	{
		WebElement ele = driver.findElement(By.xpath("//a[text()='Men']"));
		 Actions a=new Actions(driver);
		 a.moveToElement(ele).perform();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[text()='Blazers & Coats']")).click();
		 Reporter.log(driver.getTitle(),true);
		 Reporter.log(driver.getCurrentUrl(),true);
	}
	
	}

