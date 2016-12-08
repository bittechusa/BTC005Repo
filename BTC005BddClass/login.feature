Feature: Login Crediantial
Scenario Outline: login in facebook
Given i enter in facebook url
When i type userid is <user>
And i type password is <pass>
And i click in login button
Then i should able to login



Examples:
|user|pass|
|"abc"|"123"| 
|"bac"|"12345"|

