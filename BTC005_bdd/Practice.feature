Feature: end to end scenario

Background:
Given i nevigate to eshopper domain

@Smoke
Scenario: 

When i click on women menu bar
When i click on clothing sub catagory
When i click on first product
Then i should nevigate to PD page
Then close browser
@unit
Scenario Outline:
When i Validate search engine using "<text>"
Then i should get relative product
Examples:
|text|
|saree|
|shirt|
@search
Scenario:
When i click on register button
When i fill up registration form
|firstName|LName|Email|phone|
|asad|zaman|asjhgdjdfdsf|12345|
Then i should be registered successfully