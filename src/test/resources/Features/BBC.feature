Feature: Test functionalities BBC.Com

  Background:
    Given A user is on the Home Page


@Test_BbcHomePage
  Scenario: Navigate BBC Home Page
  When User clicks on the BBC Logo to land on the HomePage
  And Then user clicks on the BBC World Service Link and also clicks on the Podcasts link
  Then User can see the True crime News on the page


@Test_PositiveSignIn
  Scenario: Check Sign in is successful with valid credentials
  When User clicks on the Sign in Link
  And User enters username "salesforcejolly@gmail.com"
  And User enters password "Bbcjolly1"
  Then User clicks on the Sign in Button


  @Test_NegativeSignIn
  Scenario: Check Sign in is successful with Invalid credentials
    When User clicks on the Sign in Link
    And User enters Invalid username "salesforcejolly@gmail,com"
    And User enters Invalid password "Bbcjolly"
    Then User Failed to log in



@Test_NewsPage
    Scenario: Navigate to News Page
    When User clicks on the News Button and clicks on the More Link
    And Then user clicks on the World News Tv Link and also clicks on the How To Watch Link
    Then User Lands on the Where and how to watch BBC World News Page Successfully


@Test_ReelPage
    Scenario: Navigate to Reel Page
    When User navigates to the Reel page
    And User clicks on the PlayList Link and clicks on the watch now Button
    Then User validates the Reel Page to watch the selected news


@Test_SportPage
  Scenario: Navigate to Sport Page
    When User clicks on the sport Link
    And User clicks on the All Sport Button
    And User clicks on the BasketBall Button
    Then User Lands on the BasketBall Page Successfully


@Test_WorkLifePage
  Scenario: Navigate to WorkLife Page
    When User clicks on the Work Life Button and user clicks on the Best Of 2021 Link
    And Then user clicks on the Remote Control Link and also clicks on the Load More Button to browse more news
    Then User Stays on the Remote Control Page


@Test_TravelPage
  Scenario: Navigate to Travel Page
    When User clicks on the Travel Link to navigate The Travel Page
    And User clicks on the Discovery Link and also clicks on the Load More Button to load more new on the page
    Then User Lands on the Travel Page Successfully


@Test_FuturePage
  Scenario: Navigate to Future Page
    When User clicks on the Future Link to navigate the Future Page
    And  User clicks on the Future Planet Link and also clicks on the Load More Articles Button
    Then User validates the Future Page Successfully


@Test_CulturePage
  Scenario: Navigate to Culture Page
    When User clicks on the Culture Button to navigate the Culture Page
    And User clicks on the Music Link and also click on the Load More Button to load more news
    Then User validates the Culture Logo to read newses from that page


@Test_MoreTab
  Scenario: Navigate to More Option Page
    When A user is on the Home Page
    And User clicks on the Down Arrow Icon
    Then User Land on the More Page Successfully

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

@Test_SearchBox
  Scenario: Navigate to Search Box
    When User types Game on the Search Box
    And  User clicks on the Search Icon
    Then User Validates the Page to read Games News



