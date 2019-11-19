Feature: User Certification

    Scenario: User is Passed
        Given that the user Vasya is given a task to clear QA certification exam
        When Vasya got 60 marks in exam
        Then Vasya is known as QA certified
