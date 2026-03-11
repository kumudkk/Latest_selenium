package UI;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test2 {

	WebDriver driver;
	
	@Test(priority=2)
	public void test2() {
		System.out.println("This is my second test");
	}
	
	@Test(priority=1)
	public void test3() {
		System.out.println("This is my third test");
	}
}
