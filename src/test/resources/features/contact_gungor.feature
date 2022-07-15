@contact
Feature: Create and delete contact
  User Story: As a user I should be able to create, edit and delete contacts.
  So that I can have contact list and I can find the related contact with search option.
  AC:
  1- User should be able to create a new contact.
  2- User should be able to edit an existing contact.
  3 User should be able to find contact by list view and search box.
  4 User should be able to delete an existing contact.


  Scenario Outline:User should be able to create a new contact.
    Given User goes to application page enter valid "<email>" and "<password>" clicks enter gy
    When user clicks contact button gy
    And user clicks create button gy
    And user enters contact name to "name" input box gy
    And user clicks save button gy
    Then user verifies that contact created gy


    Examples:
      | email                      | password         |
      | posmanager10@info.com      | posmanager       |
