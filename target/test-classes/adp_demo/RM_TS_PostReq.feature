Feature: Post job requsition
  In order to post new job openings
  As a HR manager or Recruitment Manager
  I want to create and publish new job requisitions

  Scenario: Create Job Requisition for Utilities
    Given I am logged on to the administration side of MyInfo as an HR or Recruitment Manager
    When I open create new utilities req form
    Given I fill in the required info
      | UnionJob                           | No                                 |
      | ECRenewal_Quick_Hire               | Yes                                |
      | Number_of_positions                |                                  1 |
      | Company                            | Sempra Energy-10                   |
      | Paygroup                           | Sempra Energy Corporate Center-SAM |
      | Department                         | Apps-Infra Support-CCG786          |
      | Division                           | Accounting & Finance - 50020       |
      | CostCenter                         | ACCTG & FINAN CONFER-SAM1100-0345  |
      | BudgetedPosition                   | Yes                                |
      | SharedServices                     | blah                               |
      | Eligible_for_Relocation            | Yes                                |
      | Eligible_for_Referral_Program      | Eligible                           |
      | DOT_safety_Sensitive               | No                                 |
      | Location                           | Sempra Energy Headquarters-9304    |
      | DesiredBuilding_SeatLocation       | HQ 04-558                          |
      | StandardHours                      |                                 40 |
      | InternalJobTitle_JobCode           | Assoc Busn Analyst-C10829          |
      | External_PublishedJobTitle         | Busn Analyst                       |
      | BasePayType                        | Salary                             |
      | PositionType                       | Full-time                          |
      | Regular_Temp                       | Regular                            |
      | EmployeeClass                      | Regular                            |
      | BusinessJustification_for_Position | This is a Test Justification       |
      | Replacement_Addition               | New                                |
      | HiringMgr                          | Wasim                              |
      | Recruiter                          | Wasim Haque                        |
      | AreaofInterest                     | Plant Operations                   |
      | PostingLocation                    | San Diego Downtown                 |
      | ExternalDescription                | This is a Test Description         |
      | ExternalRequirements               | This is a Test Requirement         |
      | InternalDescription                | This is a Test Description         |
      | InternalQualification              | This is a Test Qualification       |
      | Approver_1                         | Wasim Haque                        |
    And click Create button
    When the Req is Approved
    And Activated
    And Published
    Then the job posting should Show on the company career website
