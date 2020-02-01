Feature: Create a Country
  Scenario:  Country Creating

    Given Go to mersys website
    And Type the username and password and click on login button
    And Click on setup on top
    And Click on parameter
    And Click on countries
    And Click on plus icon
    And Type in the Name "Montenegro "
    And Type in the Code "Budva"
    When Click on save button
    Then "Montenegro" should be displayed


