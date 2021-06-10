Feature: Register elarning credentials

  Scenario Outline: Register elarning application credentials
    Given Open the "Chrome" browser
    When User navigates to Sign up link
    And Enter the First name as "<firstname>"
    And Enter the Last name as "<lastname>"
    And Enter the e-mail as "<email>"
    And Enter Username as "<username>"
    And Enter the Password as "<password>"
    And Enter the Confirm password as "<confirm password>"
    And click on "Register" button
    Then User Registration successful
    And User select dropdown on top corner side
    Then User went for Homepage
    When Enter User name as "<username>"
    And Enter Password as "<password>"
    And Click on Login button
    When Clcik Compose link under profile section
    Then Compose screen is dispayed
    When Enter the email id to send recepient as "<recepient email id>"
    And Enter the subject as "<subject>"
    #  And Enter the body message as "<message>"
    And Clcik on Send message
    Then email sent to recepient

    Examples: 
      #  | firstname | lastname | email          | username | password | confirm password | username | password | recepient email | subject      | message |
      # | sssdde    | sssdde   | sssdde@123.com | sssdde   | sssdde   | sssdde           | sssdde   | sssdde   | srinivas        | Text meaasge | this is |
      | firstname | lastname | email           | username | password | confirm password | username | password | subject           | message |
      | vasuoten  | vasuten  | vasuten@123.com | vasuten  | vasuten  | vasuten          | vasuten  | vasuten  | Text meaasge sent | this is |
