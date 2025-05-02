package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddUserPage;
import pages.DashBoardPage;
import pages.LoginPage;
import pages.UserPage;
import testbase.BaseClass;


public class AddUserTestScript extends BaseClass {
	
@Test
	
	public void verifyloginAddUser() {
	LoginPage obj1=new LoginPage(driver);
		obj1.login("kiran@gmail.com", "123456");
		
		Assert.assertEquals(driver.getCurrentUrl(), "file:///C:/Users/madhav.valande_simad/Pictures/OfflineWebsite-20250327T085218Z-001/OfflineWebsite/pages/examples/dashboard.html");
		
		DashBoardPage dashBoard=new DashBoardPage(driver);
		Assert.assertTrue(dashBoard.verifyTabUser());
		dashBoard.click();
		
		UserPage userpage=new UserPage(driver);
		Assert.assertTrue(userpage.buttonAddUser());
		userpage.clickButtonAddUser();
		
		AddUserPage adduserPage=new AddUserPage(driver);
		Assert.assertEquals(driver.getCurrentUrl(), "file:///C:/Users/madhav.valande_simad/Pictures/OfflineWebsite-20250327T085218Z-001/OfflineWebsite/pages/examples/add_user.html");
		
		adduserPage.fillForm("MAdhavrao", "7218505560", "madhavraovalande503@gmail.com", "HP", "12123");
		
		
	
	}

}
