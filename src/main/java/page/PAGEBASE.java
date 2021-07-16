package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PAGEBASE {
	
	protected WebDriver driver;
	
	//creat constructor

	public PAGEBASE(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	protected static void clickbutton(WebElement button)
	{
		button.click();
	}
	protected static void setTextElment(WebElement txt , String value)
	{
		txt.sendKeys(value);
	}

}
