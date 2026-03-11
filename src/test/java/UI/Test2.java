package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test2 {

	WebDriver driver;
	
	@Test(priority=2)
	public void test2() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("Launched the browser and navigated to google");
	}
	
	@Test(priority=1)
	public void test3() {
		System.out.println("This is my third test");
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
		System.out.println("Closed the browser");
	}
}
