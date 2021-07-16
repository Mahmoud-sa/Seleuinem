package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PAGEREGISTER extends PAGEBASE {
	

		public PAGEREGISTER(WebDriver driver) {
			super(driver);
		
		}
		
		@FindBy (id="gender-male")
		WebElement radiobtn;


		@FindBy (id="FirstName")
		WebElement fnTxtBox;

		@FindBy (id="LastName")
		WebElement lnTxtBox;


		@FindBy (id="Email")
		WebElement emailTxtBox;

		@FindBy (id="Password")
		WebElement passwordTxtBOX;

		@FindBy (id="ConfirmPassword")
		WebElement passowrdconfirmTxtBox;

		@FindBy (id="register-button")
		WebElement RegisterBtn;
		
		@FindBy (linkText ="Log out")
		WebElement logoutBtn;

		
		public void UserfillRegister(String firstname , String lastname , String email, String password) 
		{
			
				clickbutton(radiobtn);
			setTextElment(fnTxtBox, firstname);
			setTextElment(lnTxtBox, lastname);
			setTextElment(emailTxtBox, email);
			setTextElment(passwordTxtBOX, password);
		}

}
