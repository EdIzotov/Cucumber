Feature: Create Default User

  Scenario: User is Created by default
    Given user "Vasya Petrov" with "0671000101" has to be created
    When name and phone were entered and Create button was clicked
    Then user Vasya Petrov with 0671000101 and role Student appears in the list
