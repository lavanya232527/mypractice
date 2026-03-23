package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.CommonFunctions;

public class NewCustomer 
{
	WebDriver driver;
	public NewCustomer(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	@FindBy(xpath="//a[text()='New Customer']")
	WebElement newCustomer;
	@FindBy(xpath="//input[@name='name']")
	WebElement custName;
	@FindBy(xpath="//input[@value='f']")
	WebElement gender;
	@FindBy(xpath="//input[@name='dob']")
	WebElement doB;
	@FindBy(xpath="//textarea[@name='addr']")
	WebElement address;
	@FindBy(xpath="//input[@name='city']")
	WebElement cityy;
	@FindBy(xpath="//input[@name='state']")
	WebElement state;
	@FindBy(xpath="//input[@name='pinno']")
	WebElement pinn;
	@FindBy(xpath="//input[@name='telephoneno']")
	WebElement mobilenumber;
	@FindBy(xpath="//input[@name='emailid']")
	WebElement email;
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	@FindBy(xpath="//input[@type='reset']")
	WebElement reset;
	@FindBy(xpath="//td[text()='Customer ID']")
	WebElement custId;
	@FindBy(xpath="//td[text()='Customer ID']//following-sibling::td")
	WebElement custIdValue;

	public void ncClick()
	{
		newCustomer.click();
	}
	public void customerName(String customerName)
	{
		custName.sendKeys(customerName);
	}
	public void gender()
	{
		gender.click();
	}
	public void dob(String DOB)
	{
		doB.sendKeys(DOB);
	}
	public void adress(String Adress)
	{
		address.sendKeys(Adress);
	}
	public void city(String city)
	{
		cityy.sendKeys(city);
	}
	public void state(String State)
	{
		state.sendKeys(State);
	}
	public void pinn(String pin)
	{
		pinn.sendKeys(pin);
		
	}
	public void mobilenumber(String MobileNumber)
	{
		mobilenumber.sendKeys(MobileNumber);
	}
	public void email()
	{
		
		email.sendKeys(CommonFunctions.generataRandomEmail());
		System.out.println(CommonFunctions.generataRandomEmail());
		
		
	}
	public void password(String Password)
	{
		password.sendKeys(Password);
	}
	public void submit()
	{
		submit.click();
	}
	public void validateCustIdGeneration()
	{
		boolean flag=custId.isDisplayed();
		if(flag==true)
		{
			System.out.println("Customer id is generated");
		}
		else
		{
			System.out.println("Customer id is not generated");
		}
	}
	public String getCustomerId()
	{
		String cId=custIdValue.getText();
		System.out.println(cId);
		return cId;
		
	}
	
	
}
