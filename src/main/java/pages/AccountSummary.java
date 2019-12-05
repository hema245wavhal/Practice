package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummary {
	
	//locate webelement
	
WebDriver driver;

public AccountSummary(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(linkText ="Pay Bills")
public WebElement paybillslink;

public void clickpaybillslink() 
{
	paybillslink.click();
}


@FindBy(linkText ="Transfer Funds")
public WebElement transferfundslink;
	
public void transferfundslink() 
{
	transferfundslink.click();
}
}

