@Searchpage
Feature: Verifying Adactin hotel search page

Background:
#Given User should be in the adactin login page
Given User starting testcase

  Scenario Outline: validating search page with valid hotel details
    #Given User should be in the adactin home page
    When User login with "<username>" and "<password>"
    Then User should verify success message after login Search
    When User search hotel "<Location>","<Hotels>","<RoomType>","<NumberofRooms>","<CheckInDate>","<CheckOutDate>"
    And User should verify success messsage after search hotels

    Examples: 
      | username   | password     | Location | Hotels         | RoomType | NumberofRooms | CheckInDate | CheckOutDate |
      | kumaraguru | Kumaraguru@1 | Sydney   | Hotel Sunshine | Standard | 1 - One       | 05/11/2023  | 07/11/2023   |

