$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("adp_demo/RM_TS_PostReq.feature");
formatter.feature({
  "line": 1,
  "name": "Post job requsition",
  "description": "In order to post new job openings\nAs a HR manager or Recruitment Manager\nI want to create and publish new job requisitions",
  "id": "post-job-requsition",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Create Job Requisition for Utilities",
  "description": "",
  "id": "post-job-requsition;create-job-requisition-for-utilities",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am logged on to the administration side of MyInfo as an HR or Recruitment Manager",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I open create new utilities req form and fill in the required info and click Create button",
  "rows": [
    {
      "cells": [
        "Unionjob",
        "No"
      ],
      "line": 9
    },
    {
      "cells": [
        "ECRenewal_Quick Hire",
        "Yes"
      ],
      "line": 10
    },
    {
      "cells": [
        "Number_of_positions",
        "1"
      ],
      "line": 11
    },
    {
      "cells": [
        "Company",
        "Sempra Energy-10"
      ],
      "line": 12
    },
    {
      "cells": [
        "Paygroup",
        "Sempra Energy Corporate Center-SAM"
      ],
      "line": 13
    },
    {
      "cells": [
        "Department",
        "Apps-Infra Support-CCG786"
      ],
      "line": 14
    },
    {
      "cells": [
        "Division",
        "Accounting \u0026 Finance - 50020"
      ],
      "line": 15
    },
    {
      "cells": [
        "CostCenter",
        "ACCTG \u0026 FINAN CONFER-SAM1100-0345"
      ],
      "line": 16
    },
    {
      "cells": [
        "BudgetedPosition",
        "Yes"
      ],
      "line": 17
    },
    {
      "cells": [
        "SharedServices",
        "blah"
      ],
      "line": 18
    },
    {
      "cells": [
        "Eligible_for_Relocation",
        "Yes"
      ],
      "line": 19
    },
    {
      "cells": [
        "Eligible_for_Referral_Program",
        "Eligible"
      ],
      "line": 20
    },
    {
      "cells": [
        "DOT_safety_Sensitive",
        "No"
      ],
      "line": 21
    },
    {
      "cells": [
        "Location",
        "Sempra Energy Headquarters-9304"
      ],
      "line": 22
    },
    {
      "cells": [
        "DesiredBuilding_SeatLocation",
        "HQ 04-558"
      ],
      "line": 23
    },
    {
      "cells": [
        "StandardHours",
        "40"
      ],
      "line": 24
    },
    {
      "cells": [
        "InternalJobTitle_JobCode",
        "Assoc Busn Analyst-C10829"
      ],
      "line": 25
    },
    {
      "cells": [
        "External_PublishedJobTitle",
        "Busn Analyst"
      ],
      "line": 26
    },
    {
      "cells": [
        "BasePayType",
        "Salary"
      ],
      "line": 27
    },
    {
      "cells": [
        "PositionType",
        "Full-time"
      ],
      "line": 28
    },
    {
      "cells": [
        "Regular_Temp",
        "Regular"
      ],
      "line": 29
    },
    {
      "cells": [
        "EmployeeClass",
        "Regular"
      ],
      "line": 30
    },
    {
      "cells": [
        "BusinessJustification_for_Position",
        "This is a Test Justification"
      ],
      "line": 31
    },
    {
      "cells": [
        "Replacement_Addition",
        "New"
      ],
      "line": 32
    },
    {
      "cells": [
        "HiringMgr_I",
        "Wasim Haque"
      ],
      "line": 33
    },
    {
      "cells": [
        "Recruiter",
        "Wasim Haque"
      ],
      "line": 34
    },
    {
      "cells": [
        "AreaofInterest",
        "Plant Operations"
      ],
      "line": 35
    },
    {
      "cells": [
        "PostingLocation",
        "San Diego Downtown"
      ],
      "line": 36
    },
    {
      "cells": [
        "ExternalDescription",
        "This is a Test Description"
      ],
      "line": 37
    },
    {
      "cells": [
        "ExternalRequirements",
        "This is a Test Requirement"
      ],
      "line": 38
    },
    {
      "cells": [
        "InternalDescription",
        "This is a Test Description"
      ],
      "line": 39
    },
    {
      "cells": [
        "InternalQualification",
        "This is a Test Qualification"
      ],
      "line": 40
    },
    {
      "cells": [
        "Approver_1",
        "Wasim Haque"
      ],
      "line": 41
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "the Req is Approved",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "Activated",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "Published",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "the job posting should Show on the company career website",
  "keyword": "Then "
});
formatter.match({
  "location": "RM_TS_PostReq.i_am_logged_on_to_the_administration_side_of_MyInfo_as_an_HR_or_Recruitment_Manager()"
});
formatter.result({
  "duration": 89339591,
  "error_message": "java.lang.NullPointerException\n\tat org.sempra.hr.adp.login.LoginPage.Login(LoginPage.java:17)\n\tat adp_demo.RM_TS_PostReq.i_am_logged_on_to_the_administration_side_of_MyInfo_as_an_HR_or_Recruitment_Manager(RM_TS_PostReq.java:37)\n\tat ✽.Given I am logged on to the administration side of MyInfo as an HR or Recruitment Manager(adp_demo/RM_TS_PostReq.feature:7)\n",
  "status": "failed"
});
formatter.match({
  "location": "RM_TS_PostReq.i_open_create_new_utilities_req_form_and_fill_in_the_required_info_and_click_Create_button(String,String\u003e)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RM_TS_PostReq.the_Req_is_Approved()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RM_TS_PostReq.activated()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RM_TS_PostReq.published()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "RM_TS_PostReq.the_job_posting_should_Show_on_the_company_career_website()"
});
formatter.result({
  "status": "skipped"
});
});