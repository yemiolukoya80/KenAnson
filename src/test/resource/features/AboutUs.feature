Feature: About Us

  Scenario: Verify About Us page
    Given user launch the browser
    When click burger menu
    And click about us
    Then page title should be About | Ken Anson
    
    