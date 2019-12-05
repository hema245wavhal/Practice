package testcases;



import org.openqa.selenium.WebDriver;

import org.testng.Assert;
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
		Object data[][]=new Object[rows][2];
		data[0][0]=config.getData("Sheet1", 0, 0);
		data[0][1]=config.getData("Sheet1", 0, 1);
		data[1][0]=config.getData("Sheet1", 1, 0);
		data[1][1]=config.getData("Sheet1", 1, 1);
		data[2][0]=config.getData("Sheet1", 2, 0);
		data[2][1]=config.getData("Sheet1", 2, 1);
		/*
		for(int i=0;i<rows;i++)
		{
			data[i][0]=config.getData("Sheet1", i, 0);
			data[i][1]=config.getData("Sheet1", i, 1);
		}
		*/
		return data;
		
	}
		
		
}
	

