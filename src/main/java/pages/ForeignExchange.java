package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ForeignExchange {
	 
	WebDriver driver;
	

	public ForeignExchange(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	
	@FindBy(id ="pc_currency")
	public WebElement currencyfield;

	@FindBy(id ="pc_amount")
	public WebElement ammountfield ;
	
	@FindBy(id="pc_inDollars_true")
	public WebElement radiobuttonusd;
	
	@FindBy(id="pc_calculate_costs")
	public WebElement calcostbtn;
	
	public void presscalcostbtn() {
		calcostbtn.click();
	}
	
	@FindBy(id="purchase_cash")
	public WebElement purbtn;
	
	public void presspurchasebtn() {
		purbtn.click();
	}
		
	@FindBy(id="alert_content")
	public WebElement alertmessage;
	
	
	public void selectcurrency(int index) 
	{
		Select currency = new Select(driver.findElement(By.id("pc_currency")));
		currency.selectByIndex(12);
		
	}
		
	public void foreignexchangedetails(String myammount) {
		
		ammountfield.sendKeys("100");
		
	}
	
	public void radiobuttonusd() 
	   {
		WebElement radbtn = driver.findElement(By.id("pc_inDollars_true"));
		radbtn.click();
		
		}
	
	
	
}
