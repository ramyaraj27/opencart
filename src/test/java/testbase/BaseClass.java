package testbase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	
		public  WebDriver driver;
		
		
		@BeforeClass
		public void setup()
		{
			driver=new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://demo.opencart.com/");
			driver.manage().window().maximize();
		}
		
		
		
		
		
		
		
		
		
		
		@AfterClass
		public void tearDown() 
		{
			driver.quit();
		}
		
		
		
		
		public String randomString() 
		{
		String generateRandomString=RandomStringUtils.randomAlphabetic(3);
		return generateRandomString;
		}
		
		
		
		public String randomNumber()
		{
			String generateRandomNumber=RandomStringUtils.randomNumeric(3);
			return generateRandomNumber;
		}
		
		
		
		public String randomAlphaNumeric()
		{
			String generateAlphaNumeric=RandomStringUtils.randomAlphanumeric(5);
			return generateAlphaNumeric;
			
		}

	}


