Feature: Post job requsition
  In order to post new job openings
  As a HR manager or Recruitment Manager
  I want to create and publish new job requisitions

  Scenario: Create Job Requisition for Utilities
    Given I am logged on to the administration side of MyInfo as an HR or Recruitment Manager
    When I open create new utilities req form and fill in the required info and click "Create" button
      | Union job                           | No                                 |
      | EC Renewal/Quick Hire               | Yes                                |
      | Number of positions                 |                                  1 |
      | Company                             | Sempra Energy-10                   |
      | Paygroup                            | Sempra Energy Corporate Center-SAM |
      | Department                          | Apps-Infra Support-CCG786          |
      | Division                            | Accounting & Finance - 50020       |
      | Cost Center                         | ACCTG & FINAN CONFER-SAM1100-0345  |
      | Budgeted Position                   | Yes                                |
      | Shared services                     | blah                               |
      | Eligible for Relocation             | Yes                                |
      | Eligible for Referral Program       | Eligible                           |
      | DOT safety Sensitive                | No                                 |
      | Location                            | Sempra Energy Headquarters-9304    |
      | Desired Building/Seat Location      | HQ 04-558                          |
      | Standard Hours                      |                                 40 |
      | Internal Job Title/Job Code         | Assoc Busn Analyst-C10829          |
      | External/Published Job Title        | Busn Analyst                       |
      | Base Pay Type                       | Salary                             |
      | Position Type                       | Full-time                          |
      | Regular/Temp                        | Regular                            |
      | Employee Class                      | Regular                            |
      | Business Justification for Position | This is a Test Justification       |
      | Replacement/Addition                | New                                |
      | Hiring Mgr I                        | Wasim Haque                        |
      | Recruiter                           | Wasim Haque                        |
      | Area of Interest                    | Plant Operations                   |
      | Posting Location                    | San Diego Downtown                 |
      | External Description                | This is a Test Description         |
      | External Requirements               | This is a Test Requirement         |
      | Internal Description                | This is a Test Description         |
      | Internal Qualification              | This is a Test Qualification       |
      | Approver_1                          | Wasim Haque                        |
    When the Req is "Approved"
    And "Activated"
    And "Published"
    Then the job posting should "Show" on the company career website
