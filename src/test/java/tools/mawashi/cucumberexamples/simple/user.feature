Feature: User Certification

    Scenario: User is Passed
        Given that the user Vinod is given a task to clear XXX certification exam
        When Vinod got 60 marks in exam
        Then Vinod is known as XXX certified
