Feature: Examples of Cucumber data table implementations


  Scenario: Something happens
    #Given user does something
    Then user should see below words displayed
      | Apple      |
      | Kiwi       |
      | Orange     |
      | Strawberry |
      | Mango      |
      | Tomato     |

  @wip
  Scenario: Library login example using data table
    Given user is on the login page of library app
    When user enters username and password as below
      | username | librarian@13library.com |
      | password | 9rf6assD                |
    Then user should see title is something
