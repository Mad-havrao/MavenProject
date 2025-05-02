package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	WebDriver driver;
	
	@FindBy (xpath="//span[text()='Users']")
	private WebElement tabUser;
	
	public DashBoardPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public boolean verifyTabUser() {
		return tabUser.isDisplayed();
	}
	
	public void click() {
		tabUser.click();
	}
	
	

}
