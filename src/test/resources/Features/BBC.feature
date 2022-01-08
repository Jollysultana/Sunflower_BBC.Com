Feature: Test functionalities BBC.Com

  Background:
    Given A user is on the Home Page


@Test_BbcLogo
  Scenario: Navigate BBC Logo
  When User clicks on the BBC Button
  Then User lands on the BBC Welcome page successfully

@Test_SignIn
  Scenario: Check Sign in is successful with valid credentials
  When User clicks on the Sign in Link
  And User enters username "salesforcejolly@gmail.com"
  And User enters password "Bbcjolly1"
  Then User clicks on the Sign in Button


@Test_NewsPage
    Scenario: Navigate to News Page
    When User clicks on the News Button
    Then User Lands on the News Page Successfully

@Test_ReelPage
    Scenario: Navigate to Reel Page
    When User clicks on the Reel Link
    Then User Lands on the Reel Page Successfully

@Test_SportPage
  Scenario: Navigate to Sport Page
    When User clicks on the sport Link
    Then User Lands on the Sport Page Successfully


@Test_WorkLifePage
  Scenario: Navigate to WorkLife Page
    When User clicks on the WorkLife Button
    Then User Lands on the WorkLife Page Successfully


@Test_TravelPage
  Scenario: Navigate to Travel Page
    When User clicks on the Travel Link
    Then User Lands on the Travel Page Successfully


@Test_FuturePage
  Scenario: Navigate to Future Page
    When User clicks on the Future Button
    Then User Lands on the Future Page Successfully


@Test_CulturePage
  Scenario: Navigate to Culture Page
    When User clicks on the Culture Button
    Then User Lands on the Culture Page Successfully


#@Test_MoreTab
#  Scenario: Navigate to More Option Page
#    When A user is on the Home Page
#    And User clicks on the Down Arrow Icon
#    Then User Land on the More Page Successfully

@Test_DesignedPage
  Scenario: Step into the Designed Page inside Culture Tab
    When User clicks on the Culture Tab
    And User clicks on the Designed Button
    Then User lands on the Designed Page Successfully

@Test_WorldPage
  Scenario: Navigate to Bbc World Page
    When User Clicks on the News Tab
    And User Clicks on the World Button
    Then User Lands on the World Page Successfully




