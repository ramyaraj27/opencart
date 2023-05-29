package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.AccountRegistrationPage;
import pageobjects.Homepage;
import testbase.BaseClass;


public class TC_001_AccountRegistrationTest extends BaseClass {
	
	@Test	
	public void test_Account_Registration() 
	{
		try 	
		{
			Homepage hp=new Homepage(driver);
			hp.clickMyAccount();
			hp.clickRegister();

			AccountRegistrationPage arp=new AccountRegistrationPage(driver);
			{
				arp.setfname(randomString().toUpperCase());
				arp.setlname(randomString().toUpperCase());
				arp.setemai(randomString()+"@gmail.com");
				arp.setpassword(randomString().toUpperCase());
				arp.setnewsletter();
				arp.setagree();
				arp.setconti();
				String confmsg=arp.getConfirmationMsg();
				
				Assert.assertEquals(confmsg, "Your Account Has Been Created!");
				}
			
		}
		catch(Exception e)
		{
			Assert.fail();
		}

	}

}
