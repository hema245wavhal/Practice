package testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import base.Page;
import pages.AccountSummary;
import pages.LoginPage;
import pages.PayBills;
import pages.WelcomePage;

public class Testcase_AddPAyee extends Page{
	WebDriver driver;
	WelcomePage wp;
	LoginPage lp;
	AccountSummary as;
	PayBills pb;
	
	@Test
	public void validateAddPayee()
	{
		driver=initConfiguration();
		wp=new WelcomePage(driver);
		wp.clicksigninbutton();
		lp=new LoginPage(driver);
		lp.dologin("username", "password");
		as=new AccountSummary(driver);
		as.clickpaybillslink();
		pb=new PayBills(driver);
		pb.addpayeetab.click();
		pb.enterdetails("Hema", "789", "111", "Rent Transfer");
		System.out.println(pb.handlealert());
	}
		
	  @AfterMethod
	    public void teardown() {
	  	  driver.quit();
	    }
				
				
	}


