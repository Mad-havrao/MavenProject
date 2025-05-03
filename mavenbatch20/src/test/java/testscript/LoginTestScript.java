package testscript;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;


import pages.LoginPage;
import testbase.BaseClass;

public class LoginTestScript extends BaseClass {
	
    @Test
	
	public void verifyLogin() throws InterruptedException {
    	
    	    LoginPage obj1 = new LoginPage(driver);//This driver come form base class
    	    obj1.login("kiran@gmail.com", "123456");

    	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    	    //wait.until(ExpectedConditions.urlContains("dashboard.html"));

    	    Assert.assertEquals(driver.getCurrentUrl(), "file:///C:/Users/madhav.valande_simad/Pictures/OfflineWebsite-20250327T085218Z-001/OfflineWebsite/pages/examples/dashboard.html");
    	}

}


