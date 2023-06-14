Feature: Find the game and verify

  Background:
    Given I am on homepage
    And I mouse hover on "All Games" tab

  @sanity @regression
  Scenario: Find the games and verify the games are in list
    When I click "All Games" tab
    Then I navigate to "https://www.virgingames.com/uk/all-games" url page
    And I should see the games names displayed on page
      | gamesName                  |
      | 7's Deluxe Repeater        |
      | Absolootly Mad Mega Moolah |
      | Amazing Link: Zeus         |
      | Augustus                   |