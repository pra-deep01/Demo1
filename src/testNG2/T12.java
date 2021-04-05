package testNG2;



import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
public class T12 extends TestBase{
	
	@Test
	public void task() throws InterruptedException 
	{
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("window.scrollBY(0,5000)");
		j.executeScript("window.scrollBY(0,-5000)");
		Thread.sleep(3000);	
	}
	
}
