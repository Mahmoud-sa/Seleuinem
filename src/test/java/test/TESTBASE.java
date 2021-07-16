package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class TESTBASE {
	
	public static WebDriver driver;
	
	
	@BeforeSuite
	public void  startDriver()
	{
		System.setProperty("webdriver.chrome.driver",System.getProperty ("user.dir")+"/driver2/chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://frontend.nopcommerce.com/");
		
	}

}
