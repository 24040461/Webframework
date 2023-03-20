Feature: Test board functionality

  Background:
    Given user is on homepage of trello
  Scenario: creation of a trello board
    When user clicks on create board
    And user enters board title "This is a new board"
    And user clicks on the create button
    Then user is taken to the board they just created
    And user can see the title matches with the title they created in step three

    Scenario: Addling a list to a trello board
      When user is on any board
      And user clicks on add list
      And enters the name of the list
      Then clicks the button add list



