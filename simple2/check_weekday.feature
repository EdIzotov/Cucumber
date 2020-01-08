Feature: Is it Friday yet?
    Everybody wants to know when it's Friday

    Scenario: Tuesday isn't Friday
        Given today is Tuesday
        When I ask whether it's Friday yet
        Then I should be told "Nope"
