
@contact
Feature: Create and Delete Contact Functionality

  Agile story: As a user,
  1- User should be able to create a new contact.
  2- User should be able to edit an existing contact.
  3 User should be able to find contact by list view and search box.
  4 User should be able to delete an existing contact

 Scenario Outline:
   Given User goes to application page enter valid "<username>" and "<password>" clicks_necip
   When User clicks contact button_necip
   And User clicks create button_necip
   And User enters "contact name" to input box_necip
   And User clicks save button_necip
   Then Users verifys that contact created_necip

   Examples:
     | username              | password   |
     | posmanager10@info.com | posmanager |


