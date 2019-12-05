package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFunds 

{
	WebDriver driver;
	public TransferFunds(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(id ="tf_fromAccountId")
	public WebElement selectfromaccount;
	
	@FindBy(id ="tf_toAccountId")
	public WebElement selecttoaccount;
	
		
	@FindBy(id ="tf_amount")
	public WebElement transferfundsammount;
	
	@FindBy(id ="tf_description")
	public WebElement transferfundsdescription;
	
	@FindBy(xpath ="//button[@id='btn_submit']")
	public WebElement transferfundsdcontbtn;
	
	@FindBy(xpath ="//div[@class='alert alert-success']")
	public WebElement tfalert;
	
	public void selectfromaccount(int index) 
	{
		Select tfrmaccount = new Select(driver.findElement(By.id("tf_fromAccountId")));
		tfrmaccount.selectByIndex(index);
	}
	
	public void selecttoaccount(int index) {
		Select ttoaccount = new Select(driver.findElement(By.id("tf_toAccountId")));
		ttoaccount.selectByIndex(index);
	}
	
	public void tfenterdetails(String tammount, String tdescription) 
	{
		transferfundsammount.sendKeys(tammount);
		transferfundsdescription.sendKeys(tdescription);
		transferfundsdcontbtn.click();
		transferfundsdcontbtn.click();
	}
	
	}
