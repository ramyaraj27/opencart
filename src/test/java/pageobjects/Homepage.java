package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Basepage{

	public Homepage(WebDriver driver) 
	{
		super (driver);
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	WebElement lnkMyaccount;
	
	@FindBy(linkText="Register")
	WebElement lnkRegister;
	
	@FindBy(linkText="Login")
	WebElement lnkLogin;
	
	
	public void clickMyAccount() 
	{
		lnkMyaccount.click();
	}
	
	public void clickRegister() 
	{
		lnkRegister.click();
	}
	public void clickLogin() 
	{
		lnkLogin.click();
	}
}
