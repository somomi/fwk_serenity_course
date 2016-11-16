Narrative:
As a user
I want open Java Script page and find coordinates of jumping div
So that I can handle correctly such elements

Scenario: Get coordinates of jumping div (with red border and text ‘Find me !’ inside).
Enter them into input fields and press ‘Process’.
Handle alert and verify that message ‘Whoo Hoooo! Correct!’ is displayed.
Given user is on login page
And user enter login 'admin' and password 'admin'
When user open js page
Then user enter coordinates of div and wait for alert with text 'Whoo Hoooo! Correct!'
