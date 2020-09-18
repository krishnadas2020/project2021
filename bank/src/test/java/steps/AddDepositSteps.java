package steps;

import org.junit.Assert;

import app.Bank;
//import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddDepositSteps {
	Bank bank;
	@Given("^I have (\\d+)balance$")
	public void i_have_balance(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		 bank=new Bank(arg1);
		//System.out.println(arg1);
	    
	}

	@When("^I deposit (\\d+)to my account$")
	public void i_deposit_to_my_account(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new PendingException();
		bank.deposit(arg1);
		//System.out.println(arg1);
		
	}

	@Then("^I verify the (\\d+) will be in my account$")
	public void i_verify_the_will_be_in_my_account(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new PendingException();
		 int  value=bank.getBalance();
		 Assert.assertEquals(arg1,value);
		//System.out.println(arg1);
	}


}
