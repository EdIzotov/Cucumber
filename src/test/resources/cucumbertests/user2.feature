Feature: User Certification Negative

  Scenario: User is Failed
    Given that the user Petya is given a task to clear QA certification exam
    When Petya got 30 marks in exam
    Then Petya is not known as QA certified
