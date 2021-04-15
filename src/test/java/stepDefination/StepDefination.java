package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefination {
	
	 @Given("^I am at net banking landing page$")
	    public void i_am_at_net_banking_landing_page() throws Throwable {
		 
		 System.out.println("Given Step");
	        
	    }

	    @When("^User login into application with username and password$")
	    public void user_login_into_application_with_username_and_password() throws Throwable {
	    	System.out.println("When Step");  
	    }

	    @Then("^Homepage is populated$")
	    public void homepage_is_populated() throws Throwable {
	    	System.out.println("Then Step"); 
	    	
	    }

	  

	    @Then("Cards are displayed.")
	    public void cards_are_displayed() {
	        // Write code here that turns the phrase above into concrete actions
	    	System.out.println("Then Step");
	    }




	  }



