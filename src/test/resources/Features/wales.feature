Feature: Wales person get treatment from NHS
    
Background:
    Given navigate to the URL
    Then accept the cookies
    And click Strat Now button
    And User selects Wales Country Option and clicks on Next button	
    And  User select Yes for GP practice in Wales and clicks on Next button
    Then User select wales for Dental practice and clicks on Next button

  @tag1
Scenario: Verify that Wales person get help from NHS with select all the option as Yes
		And  User Enters the valid date of birth Year '1991' and clicks on Next button
    Then User click Yes for Do you live with a partner
    And  User click Yes for Do you or your partner claim any benefits or tax credits  and clicks on Next button
    Then User selects Yes for Do you or your partner get paid Universal Credit  and clicks on Next button
    Then select Yes for As part of your joint Universal Credit, do you have any of these and clicks on Next button
    And  click Yes for take-home pay  and clicks on Next button
    And  Assert Yes Option NHS help list displayed for the user
    Then close the Browser
    
    @tag2
Scenario: Verify that wales person get help from NHS with select all the option as NO
		And  User Enters the valid date of birth Year '1991' and clicks on Next button
    Then User click No for Do you live with a partner and clicks on Next button
    And  User click No for Do you or your partner claim any benefits or tax credits  and clicks on Next button
    And  User select No Are you pregnant or have you given birth in the last 12 month and clicks on Next button
    Then User select No for Do you have an injury or illness caused by serving in the armed forces and clicks on Next button
    Then User select No for Do you have diabetes and clicks on Next button
    And  User select No for Do you have glaucoma and clicks on Next button
    Then User select No for Do you live permanently in a care home and clicks on Next button
    And  User selct No for Do you have more than £16,000 in savings, investments or property and clicks on Next button
    And  Assert No Option NHS help list displayed for the user
    Then close the Browser
    
    	@tag3
Scenario: Verify that Wales person get get paid Universal Credit
		And  User Enters the valid date of birth Year '1991' and clicks on Next button
		Then User click Yes for Do you live with a partner
    And  User click Yes for Do you or your partner claim any benefits or tax credits  and clicks on Next button
    Then User selects Not yet for Do you or your partner get paid Universal Credit  and clicks on Next button
    When While you and your partner are waiting on a Universal Credit decision and Click on Next button    
    Then user selects all checkbox in Do you or your partner get any of these benefits and click on Next button
    And  Assert Yes Option NHS help list displayed for the user
   Then close the Browser
   
   @tag4
Scenario: Verify User under 16 age group able to get help from NHS
		And  User Enters the valid date of birth Year '2021' and clicks on Next button
    And  Assert Yes Option NHS help list displayed for the user
    Then close the Browser
    
    
    @tag5
Scenario: Verify User under 18 age group able to get help from NHS
    And  User Enters the valid date of birth Year '2004' and clicks on Next button
    Then User select Yes for Are you in full-time education and clicks on Next button
    And  Assert Yes Option NHS help list displayed for the user
   Then close the Browser
   
   
   @tag6   
Scenario: Verify valid error messages is displayed when user enter more than 120 years
    And  User Enters the valid date of birth Year '1888' and clicks on Next button
    And  Assert Valid error Message when user enter age more than 120
    Then close the Browser
    
     @tag7
Scenario: Verify user able to get help from NHS without entering DOB
    And  User Enters the valid date of birth Year '' and clicks on Next button
    And  Assert Valid error Message displayed for not Entering your date of birth Message
    And  close the Browser
    
    @tag8
Scenario: Verify User under 18 age group able to get help from NHS with option NO
    And  User Enters the valid date of birth Year '2004' and clicks on Next button
    Then User select No for Are you in full-time education and clicks on Next button
    Then User select No for Do you live with a partner and clicks on Next button
    And  User select No for Do you claim any benefits or tax credits and clicks on Next button
    And  User select No for Are you pregnant or have you given birth in the last 12 months and clicks on Next button
    Then User select No Do you have an injury or illness caused by serving in the armed forces and clicks on Next button
    Then User select No for Do you have diabetes and clicks on Next button
    And  User select No for Do you have glaucoma and clicks on Next button
    Then User select No for Do you live permanently in a care home and clicks on Next button
    And  User selct No Do you have more than £16,000 in savings, investments or property and clicks on Next button
    And  Assert No Option NHS help list displayed for the user
    Then close the Browser
    