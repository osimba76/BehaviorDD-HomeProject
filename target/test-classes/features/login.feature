 Feature: As a user I want a login page so that only authentic 
     users will be able to login
         
     Scenario: Valid users should be able to login 
     Given I am on techfios site
     When I enter username and password
     And I click on sign in button
     Then Dashboard page should display 
      
     
     