package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBills {
	WebDriver driver;

	public PayBills(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	//@FindBy(linkText ="Pay Bills")
	//public WebElement paybills;
	
	@FindBy(linkText ="Purchase Foreign Currency")
	public WebElement pfclink;

	public void clickpfclink() 
	{
		pfclink.click();
	}

	
	@FindBy(linkText ="Add New Payee")
	public WebElement addpayeetab;
	
	@FindBy(id ="np_new_payee_name")
	public WebElement payeename;
	
	@FindBy(id ="np_new_payee_address")
	public WebElement payeeaddress;
	
  	@FindBy(id ="np_new_payee_account")
	public WebElement account;
	
	@FindBy(id ="np_new_payee_details")
	public WebElement payeedetails;
	
	@FindBy(id ="add_new_payee")
	public WebElement addbutton;
	
	@FindBy(id="alert_content")
	public WebElement alert;
	
		
	public void enterdetails(String mypayeename, String mypayeeaddress, String myaccount, String mypayeedetails)
	{
		
		addpayeetab.click();
		payeename.sendKeys(mypayeename);
		payeeaddress.sendKeys(mypayeeaddress);
		account.sendKeys(myaccount);
		payeedetails.sendKeys(mypayeedetails);
		addbutton.click();
	}
	
	public String handlealert() {
		// TODO Auto-generated method stub
		return alert.getText();
	}
		
	}
