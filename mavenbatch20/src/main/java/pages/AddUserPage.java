package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddUserPage {
        WebDriver driver;
        
        @FindBy (xpath="//input[@id='username']")
        private WebElement userName;
        
        @FindBy (xpath="//input[@id='mobile']")
        private WebElement mobile;
        
        @FindBy (xpath="//input[@id='email']")
        private WebElement email;
        
        @FindBy (xpath="//input[@id='Male']")
        private WebElement male;
        
        @FindBy (xpath="//select[@class='form-control']")
        private WebElement selectDropDown;
        
        @FindBy (xpath="//input[@id='password']")
        private WebElement password;
        
        @FindBy (xpath="//button[@id='submit']")
        private WebElement submit;
	
        public AddUserPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
        
        public void fillForm(String Usernames,String mobilenum,String emailid,String state,String passwordid) {
        	userName.sendKeys(Usernames);
        	mobile.sendKeys(mobilenum);
        	email.sendKeys(emailid);
        	male.click();
        	Select obj=new Select(selectDropDown);
        	obj.selectByVisibleText(state);
        	password.sendKeys(passwordid);
        	submit.click();
        	Alert al=driver.switchTo().alert();
        	
        	
        }

}
