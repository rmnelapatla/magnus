package javapractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class gmail_new2 {
	WebDriver driver;
	String link;
	@BeforeMethod
	public void beforeMethod() {

	}
	@Test
	public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Volumes/Mani-IMP/workspace/magnus/Browsers_Drivers/chromedriver");
		driver=new ChromeDriver();
		link="https://www.gmail.com/";
		driver.get(link);
		driver.manage().window().maximize(); 
		Thread.sleep(5000);
		driver.quit();

	}


	@AfterMethod
	public void afterMethod() {
	}

}
