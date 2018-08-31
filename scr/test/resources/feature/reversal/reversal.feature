@MVP1-4156
Feature: Reversal
	
	Scenario: Complete reversal of a mistaken authorization request or advice 

		A customer entered the wrong amount when doing a purchase resulting in a pending authorization.
		In order to purge that pending autothorization, a special reversal message has to be sent,
		containing the amount 0 in the field 95 is processed.
	
	# what about difference between request and advice
	
	Given a customer Max who has just cancelled a purchase of the amount of 1000.00 resulting in an authorization request in status "pending"
	And a complete reversal message has been sent by PRIME

	When the authorization mediator processes the complete reversal message
	
	Then the pending authorization should get the status "purged" 
	And the reversal message should be stored with a status "matched" 
	And an approval message should be send to PRIME
	
	
	Scenario: Partial reversal of an authorization request or advice
	
		A typical example is that of a self service petrol station 
		where a customer has to estimates how much he will spend before the actual purchase.
		Reversal messages carry the new value in field 95.

	Given a customer Max who has just made a purchase based on his estimation of 80.00 € worth of petrol resulting in pending authorization of 80.00 in status "pending"
	And Max has just finalized the purchase with the actual amount of 60.00 € resulting in a reversal message being sent by PRIME

	When the authorization mediator processes the partial reversal message

	Then the pending authorization should continue in status "pending" 
	And the amount of the pending authorization should be updated to 20.00 € 
	And the reversal message should be stored with a status "matched" and amount of 60.00 €
	And an approval message should be send to PRIME
	
	
	






