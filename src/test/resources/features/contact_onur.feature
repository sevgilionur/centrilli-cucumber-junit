@contact_so
Feature: Create and delete contact
  User Story: As a user I should be able to create, edit and delete contacts.
  So that I can have contact list and I can find the related contact with search option.
  AC:
  1- User should be able to create a new contact.
  2- User should be able to edit an existing contact.
  3 User should be able to find contact by list view and search box.
  4 User should be able to delete an existing contact.


  Scenario Outline:User should be able to create a new contact.
    Given User goes to application page enter valid "<email>" and "<password>" clicks enter
    When user clicks contact button so
    And user clicks create button so
    And user enters contact name to "name" input box so
    And user clicks save button so
    Then user verifies that contact created so


    Examples:
      | email                      | password         |
      | posmanager26@info.com      | posmanager       |