Feature: ened to end scenario




@s2
Scenario:
Given i enter eshopper url
When i verified homePage url
And i clicked women menu bar
Then close browser

@s2
Scenario:
Given i enter eshopper url
When i mouseOver in Women
And i click on saree submenu
And i click first product
And i click buy now
Then close browser
  