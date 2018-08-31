package stepdefs.reversal;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReversalSteps {
	
	@Given("a customer Max who has just cancelled a purchase of the amount of {double} resulting in a authorization request in status {string}")
	public void a_customer_Max_who_has_just_cancelled_a_purchase_of_the_amount_of_resulting_in_a_authorization_request_in_status(
			Double double1, String string) {

		throw new PendingException();
	}

	@Given("a complete reversal message has been sent by PRIME")
	public void a_complete_reversal_message_has_been_sent_by_PRIME() {

		throw new PendingException();
	}

	@When("the authorization mediator processes the complete reversal message")
	public void the_authorization_mediator_processes_the_complete_reversal_message() {

		throw new PendingException();
	}

	@Then("the pending authorization should get the status {string}")
	public void the_pending_authorization_should_get_the_status(String string) {

		throw new PendingException();
	}

	@Then("the reversal message should be stored with a status {string}")
	public void the_reversal_message_should_be_stored_with_a_status(String string) {

		throw new PendingException();
	}

	@Then("an approval message should be send to PRIME")
	public void an_approval_message_should_be_send_to_PRIME() {

		throw new PendingException();
	}

	@Given("a customer Max who has just made a purchase based on his estimation of {double} € worth of petrol resulting in pending authorization of {double} in status {string}")
	public void a_customer_Max_who_has_just_made_a_purchase_based_on_his_estimation_of_€_worth_of_petrol_resulting_in_pending_authorization_of_in_status(
			Double double1, Double double2, String string) {

		throw new PendingException();
	}

	@Given("Max has just finalized the purchase with the actual amount of {double} € resulting in a reversal message being sent by PRIME")
	public void max_has_just_finalized_the_purchase_with_the_actual_amount_of_€_resulting_in_a_reversal_message_being_sent_by_PRIME(
			Double double1) {

		throw new PendingException();
	}

	@When("the authorization mediator processes the partial reversal message")
	public void the_authorization_mediator_processes_the_partial_reversal_message() {

		throw new PendingException();
	}

	@Then("the pending authorization should continue in status {string}")
	public void the_pending_authorization_should_continue_in_status(String string) {

		throw new PendingException();
	}

	@Then("the amount of the pending authorization should be updated to {double} €")
	public void the_amount_of_the_pending_authorization_should_be_updated_to_€(Double double1) {

		throw new PendingException();
	}

	@Then("the reversal message should be stored with a status {string} and amount of {double} €")
	public void the_reversal_message_should_be_stored_with_a_status_and_amount_of_€(String string, Double double1) {

		throw new PendingException();
	}
}
