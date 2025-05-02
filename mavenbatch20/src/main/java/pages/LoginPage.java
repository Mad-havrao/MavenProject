package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){    ///Base class driver 
		this.driver=driver;        //pom class driver =base class driver
		PageFactory.initElements(driver,this); //initialize the elements
	}
	
	@FindBy(xpath="//input[@placeholder='Email']")
	private WebElement textBoxUserName;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	private WebElement textBoxPassword;
	
	@FindBy(xpath="//button[text()='Sign In']")
	private WebElement buttonSingIn;
	
	public void login(String username, String password) {
		textBoxUserName.sendKeys(username);
		textBoxPassword.sendKeys(password);
		buttonSingIn.click();
	}
	
	
	

}
