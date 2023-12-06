# mvn verify -Dtestsuite=LoginTestSuite -Dtags=@sumup
# mvn serenity:aggregate

@sumup
Feature: Sumup

  Scenario Outline: Sumup
    Given Auto open url <url>
    When View PLP
    And Get Link Product

    Examples:
      | url                          |
      | https://www.lg.com/uk |
