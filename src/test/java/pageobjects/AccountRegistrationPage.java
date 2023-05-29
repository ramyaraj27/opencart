package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends Basepage {


	public AccountRegistrationPage(WebDriver driver)
	{
		super(driver);
	}


	@FindBy(name="firstname")
	WebElement frirstname;



	@FindBy(name="lastname")
	WebElement lastname;



	@FindBy(name="email")
	WebElement email;



	@FindBy(name="password")
	WebElement password;

	@FindBy(name="newsletter")
	WebElement newsletterradio;

	@FindBy(name="agree")
	WebElement agree;

	@FindBy(xpath="//button[text()='agree'")
	WebElement conti;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;


	public void setfname(String fname) 
	{
		frirstname.sendKeys(fname);
		
	}
	
	public void setlname(String lname)
	{
		lastname.sendKeys(lname);
	}
	
	public void setemai(String semail)
	{
		email.sendKeys(semail);
	}
	public void setpassword(String spassword)
	{
		password.sendKeys(spassword);
	}
	public void setnewsletter()
	{
		newsletterradio.click();
	}
	public void setagree()
	{
		agree.click();
	}
	
	public void setconti()
	{
		conti.click();
	}
	public String getConfirmationMsg() {
		try {
			
		return (msgConfirmation.getText());
		} 
		
		catch (Exception e) {
			
	    return (e.getMessage());

		}

	}





}
