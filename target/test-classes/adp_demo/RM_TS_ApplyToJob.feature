Feature: Apply for a job
  In order to get hired
  As a job applicant
  I want to be able to search for and apply to job postings

  Background: 
    Given a job req has been posted to an external career site

  Scenario: Search and apply for job on an external career site
    Given I'm on a career site
    When I select a job and I click on the Apply button to create an Account
      | email    | whaque086@prokarma.com |
      | password | !!Nov1981              |
    And fill in the required fields
      | firstname | Bingo        |
      | lastname  | Duck         |
      | phone     | 777-777-7777 |
      | zipcode   |        80237 |
    And upload a Resume
    And answer the EEO questions
    And electronically Sign
    And answer Preliminary Questions
    And pass the Rehire Check
    And finalize the Application Form
    Then I should be visible to the HR or Recruiting manager in their system as an applicant for the position
