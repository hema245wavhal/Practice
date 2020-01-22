package testcases;



import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.Page;
import pages.LoginPage;
import pages.WelcomePage;

public class Testcase_Login extends Page {
	WebDriver driver;
	LoginPage lp;
	WelcomePage wp;
	
	
	
	
	@Test(dataProvider="credential")
	public void login(String user,String pwd)
	
	{
		driver=initConfiguration();
		wp=new WelcomePage(driver);
		lp=new LoginPage(driver);
		//wp.clicksigninbutton();
		wp.signbutton.click();
		lp.dologin(user,pwd);
		
		String expectedTitle = driver.getTitle();
		String actualTitle = "Zero - Account Summary";
		Assert.assertEquals(actualTitle, expectedTitle);
		log.debug("validated");
	}
	@DataProvider(name="credential")
	public Object[][] provideData()
	{
		ExcelConfig config=new ExcelConfig(System.getProperty("user.dir")+"\\src\\test\\resources\\Excel\\Zerobanking.xlsx");
		int rows=config.getRowCount("Sheet1");
		System.out.println("No. of rows display"+rows);
		Object data[][]=new Object[rows][2];
		
		for(int i=0;i<rows;i++)
		{
			data[i][0]=config.getData("Sheet1", i, 0);
			data[i][1]=config.getData("Sheet1", i, 1);
		}
		
		return data;
		
	}
		
	 @AfterMethod
	    public void teardown() {
	  	  driver.quit();
	    }
}
	

