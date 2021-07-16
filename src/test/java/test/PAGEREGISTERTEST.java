package test;

import org.testng.annotations.Test;

import page.HOMEPAGE;
import page.PAGEREGISTER;

public class PAGEREGISTERTEST extends TESTBASE {

	
	
	
	HOMEPAGE HOMEOBJ;
	PAGEREGISTER REGOBJ;
	//LOGINPAGE LOGINOBJ;
	@Test(priority = 1, alwaysRun = true)

	public void UsercanREGISERSUCCEFLLY() {

		HOMEOBJ = new HOMEPAGE(driver);
		HOMEOBJ.openRegisterPage();
		REGOBJ = new PAGEREGISTER(driver);
		REGOBJ.UserfillRegister("mahmoud", "yousef", "mahmoud1@gmail.com" ,"123456S");
	}


}
