 @smoke @lib-100 @login   #this tags belongs to all the scenario since they are above Feature
Feature: Login
  As a user, I should be able to login

   @librarian @staff
   Scenario: Login as a librarian
    Given I am on the login page
    When I login as a librarian
    Then dashboard should be displayed

     @student @wip
     Scenario: Login as a student
      Given I am on the login page
      When I login as a student
      Then dashboard should be displayed

       @admin @staff
       Scenario: Login as a admin
         Given I am on the login page
         When I login as a admin
         Then dashboard should be displayed









