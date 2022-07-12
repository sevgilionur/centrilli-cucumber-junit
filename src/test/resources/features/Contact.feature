Feature:  As a user I should be able to create, edit and delete contacts.
  So that I can have contact list and I can find the related contact with search option.
  @contactCreate
  Scenario:  User should be able to create a new contact.
    Given User on the homepage yk
    When  User click on contacts button
    And   User click on create button
    And   User fills the new contact form and clicks save button
    Then  Verify user has created new contact successfully
  @editContact
    Scenario: User should edit created contact
      Given User on the homepage yk
      When  User click on contacts button
      And User find the user using search bar
      And Click on the contact's path
      When User click on edit button
      And User edit fields and clicks on save button
      Then Verify user has edited the contact successfully