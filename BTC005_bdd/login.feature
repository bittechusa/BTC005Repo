Feature: login in faebook
Background: 
Given i nevigate to facebook homepage


@Login
Scenario:login


 When i entered my userId
 And i entered my password
 And i clicked on login button
 Then i should nevigate to profile page 
 

@Signup
 Scenario:signup

 When i fill up sign up form
 |firstName|LName|email|pass|rePass|phone|
 | shahid|islam | s@yajhooo | 123 | 123 | 12345678|
 | shahid|islam | s@yajhooo | 123 | 123 | 12345678|
 And i clicked on sign up  button
 Then i should be registered

 