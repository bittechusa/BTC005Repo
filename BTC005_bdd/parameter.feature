Feature: login validation

Scenario Outline:login
Given i nevigate to facebook homepage
 When i entered my userId "<userid>"
 And i entered my password "<password>"
 And i clicked on login button
 Then i should nevigate to profile page 

 Examples:
  | userid  |password | 
    | name1 |  5   | 
    | name2 |  7   |  
    |name3|  354|