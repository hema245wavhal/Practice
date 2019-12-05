package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Page;
import pages.AccountSummary;
import pages.LoginPage;
import pages.TransferFunds;
import pages.WelcomePage;

public class Testcase_Transferfunds extends Page{
	WebDriver driver;
	LoginPage lp;
	WelcomePage wp;
	AccountSummary as;
	TransferFunds tf;
	
	
	@Test
	public void transferfunds()
	
	{
		driver=initConfiguration();
		wp=new WelcomePage(driver);
		wp.clicksigninbutton();
		lp=new LoginPage(driver);
		lp.dologin("username", "password");
		as=new AccountSummary(driver);
		as.transferfundslink();
		tf=new TransferFunds(driver);
		tf.selectfromaccount(3);
		tf.selecttoaccount(4);
		tf.tfenterdetails("100","transferFunds");
		String expectedtitle = tf.tfalert.getText();  
		String actualtitle = "You successfully submitted your transaction.";
		
			
		Assert.assertEquals(actualtitle, expectedtitle);
		
	}		
	

	}
	
			

