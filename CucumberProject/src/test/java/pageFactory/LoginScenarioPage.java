package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginScenarioPage 
{
	WebDriver driver;
	public LoginScenarioPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='uid']")
	WebElement userId;
	@FindBy(xpath="//input[@name='password']")
	WebElement userpassword;
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement loginbtn;
	@FindBy(xpath="//input[@name='btnReset']")
	WebElement resetBtn;
	
	public void userName(String username){
		userId.sendKeys(username);
	}
	public void enterpassword(String password)
	{
		userpassword.sendKeys(password);
	}
	public void submit()
	{
		loginbtn.click();
	}
	public void resetBtn()
	{
		resetBtn.click();
	}
	
	
	

}
