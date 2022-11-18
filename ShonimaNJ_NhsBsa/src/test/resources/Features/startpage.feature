Feature: NHS CheckerTool verification

  Background: user is on Claim benefits page
    Given I am uk citizen click startNOw
    When user navigate to Country page,select country as England click next
    And user on GP page select as yes
    And select dental practice as england ,click on next button
    And enter date  "30" month "05" and year  "1989"  click on next
    And select live with partner as yes ,click on next button

  Scenario: NHS CheckerTool verification
    And select ClaimBenefits as No and click on next
    And select your preganent as No and click on next
    And select your injury status as Yes and click on next
    And select your diabetics status as Yes and click on next
    And select your afftected condition status as No and click on next
    And select your glaucoma condition status as No and click on next
    And select your care home live in status as No and click on next
    And select your saving status as No and click on next
    Then Check outcomes

  Scenario: Verify NHS CheckerTool verification when claim any benefits
    And select ClaimBenefits as Yes and click on next
    And select universal credit as Yes and click on next
    And select responsibity status as Yes and click on next
    And select your take home pay status as Yes and click on next
    Then Check outcomes
