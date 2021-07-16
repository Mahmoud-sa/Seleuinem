package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HOMEPAGE extends PAGEBASE {
	
	public HOMEPAGE(WebDriver driver) {
		super(driver);
	
	}
	@FindBy(linkText  = "Register")
	WebElement registerlink;

	
	
	public void openRegisterPage()
	{
		clickbutton(registerlink);
	}

}
