package StepDefinition1;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.LoginScenarioPage;
import pageFactory.NewCustomer;
import utilities.BaseClass;
import utilities.CommonFunctions;

public class StepDefinition1 extends BaseClass
{
	WebDriver driver=BaseClass.intializDriver();
	LoginScenarioPage lgpage=new LoginScenarioPage(driver);
	NewCustomer newCustPage=new NewCustomer(driver);
	
	@Given("user opens the Homepage of the application")
	public void user_opens_the_homepage_of_the_application() 
	{
	   getTitle();
	}

	@Given("User enters the username as {string}")
	public void user_enters_the_username_as(String username) {
		lgpage.userName(username);
		
	    
	}

	@Given("User enters the Password as {string}")
	public void user_enters_the_password_as(String password) {
		lgpage.enterpassword(password);
	    
	}

	@When("User click on Login Button")
	public void user_click_on_login_button() {
	    lgpage.submit();
	}

	@Then("User will be Navigated to the Homepage")
	public void user_will_be_navigated_to_the_homepage() 
	{
	    
	}
	@Given("user clicks on New Customer")
	public void user_clicks_on_new_customer() 
	{
		newCustPage.ncClick();
		
	    
	}


	
	@Given("user enters the customer name as {string}")
	public void user_enters_the_customer_name_as(String customerName)
	{
		newCustPage.customerName(customerName);
		
	    
	}
	@Given("user selects the gender")
	public void user_selects_the_gender() 
	{
		newCustPage.gender();
	}

	@Given("user enters the DOB as {string}")
	public void user_enters_the_dob_as(String date) 
	{
		newCustPage.dob(date);
	    
	}

	@Given("user enters the Adress as {string}")
	public void user_enters_the_adress_as(String adresss)
	{
		newCustPage.adress(adresss);
	    
	}

	@Given("user enters the city as {string}")
	public void user_enters_the_city_as(String cityy)
	{
		newCustPage.city(cityy);
	    
	}

	@Given("user enters the State as {string}")
	public void user_enters_the_state_as(String statee)
	{
		newCustPage.state(statee);
	    
	}

	@Given("user enters the pin as {string}")
	public void user_enters_the_pin_as(String pinn)
	{
		newCustPage.pinn(pinn);
		
	}

	@Given("user enters the Mobile Number  as {string}")
	public void user_enters_the_mobile_number_as(String Mnumber) 
	{
		newCustPage.mobilenumber(Mnumber);
	    
	}

	@Given("user enters the email as")
	public void user_enters_the_email_as() 
	{
		
	   newCustPage.email();
	}
	
	
	@Given("user enters the Password as {string}")
	public void user_enters_the_Password_as(String passw)
	{
		newCustPage.password(passw);
	    
	}
	@When("user clicks on submit button")
	public void user_clicks_on_submit_button() 
	{
		newCustPage.submit();
	    
	}

	@Then("new customer is created")
	public void new_customer_is_created()
	{
		newCustPage.validateCustIdGeneration();
	   
	}

	@Then("user captures the customer_id")
	public void user_captures_the_customer_id() 
	{
		newCustPage.getCustomerId();
	   
	}










}
