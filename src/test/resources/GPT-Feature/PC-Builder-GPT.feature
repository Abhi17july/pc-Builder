Feature: PC Builder GPT

# **Feature**: View dropdown of part types
#@PCTest
  Scenario: User opens the part page
   Given the user is on the home page
   When user click on "Parts"
    Then all the part should be displayed
  |Asus|
  |Gigabyte|
  |MSI     |
  |Intel|
  |AMD  |
  |Corsair|
  |G.Skill|
  |Kingston|
