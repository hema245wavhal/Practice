package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage
{
	
	public WebDriver driver;
	public WelcomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="signin_button")
	public WebElement signbutton;
	
	public void clicksigninbutton() {
	
	signbutton.click();

}
}