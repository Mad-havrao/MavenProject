package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;


import pages.LoginPage;
import testbase.BaseClass;

public class LoginTestScript extends BaseClass {
	
    @Test
	
	public void verifyLogin() throws InterruptedException {
    	LoginPage obj=new LoginPage(driver);
    	
        obj.login("kiran@gmail.com", "123456");
		
		
		Assert.assertEquals(driver.getCurrentUrl(),
       "file:///C:/Users/madhav.valande_simad/Pictures/OfflineWebsite-20250327T085218Z-001/OfflineWebsite/pages/examples/dashboard.html");
		
}

}
