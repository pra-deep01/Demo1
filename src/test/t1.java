package test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class t1 {
//Prioritizing the test cases
@Test(priority=-1)
public void startApp()
{
	Reporter.log("hello",true);
}
//To execute the test case multiple times
@Test(priority=-2,invocationCount=10)
public void startApp1()
{
	Reporter.log("hiiiiiiii",true);
}
//To skip the execution
@Test(enabled=false)
public void startApp2()
{
	Reporter.log("byeee",true);
}
}
