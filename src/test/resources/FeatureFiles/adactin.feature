@Login
Feature: To book a room in adactin website


  Scenario Outline: To validate the  functionality with valid data
    Given User launches the browser and URL, logging in with valid username and password
    When User enter valid username and password and click login button
   
    And User is in search hotel page "<location>" ,"<hotels>" ,"<roomtype>","<noofrooms>","<adultperroom>","<childrenperroom>"
    And user is in booking page "<Name>","<lastname>","<add>","<cardnum>","<cvv>"
    Then User should be in valid credentials page

    Examples: 
       | location | hotels      | roomtype | noofrooms | adultperroom | childrenperroom | Name   | lastname | add | cardno           | cvv |
       | Sydney   | Hotel Creek | Standard | 1 - One   | 1 - One      | 1 - One         | nantha | kum      | sss | 9998887776665554 | 231 |
