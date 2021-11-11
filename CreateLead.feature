Feature: First one
Scenario: Create Lead

When click create lead
Then create lead page is displayed
Given enter the companyname
And enter the firstname
And enter the secondnumber
And enter the phone number
When click the create lead
Then view Lead should be displayed

Scenario: Edit Lead
When click find lead
When click phone
Given enter the phone
When click find leads
When click on the first lead
Then view lead should be displayed
When click the edit button
Then title should be displayed
Given change the company name
When click update
Then view lead should be displayed

Scenario: Duplicate Lead
When click find lead
When click phone
Given enter the phone
When click find leads
When click on the first lead
Then view lead should be displayed
When click on duplicate lead
Then duplicate title should be displayed
When click the create lead
Then view Lead should be displayed

Scenario: delete lead
When click find lead
When click phone
Given enter the phone
When click find leads
When click on the first lead
Then view lead should be displayed
When click delete lead