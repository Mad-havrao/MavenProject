package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserPage {
	WebDriver driver;
	
	@FindBy (xpath="//button[text()='Add User']")
	private WebElement buttonAddUser;
	
	public UserPage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	public boolean buttonAddUser() {
		return buttonAddUser.isDisplayed();
	}
	
	public void clickButtonAddUser() {
		buttonAddUser.click();
	}
}


