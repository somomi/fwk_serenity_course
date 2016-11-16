Narrative:
As a user
I want to create/edit/delete application with image and without
So that I can validate application functionality

Scenario: Create new application without images. Verify it is displayed correctly and can be downloaded.
Given user is on login page
And user enter login 'admin' and password 'admin'
When user open my applications page
And user create new application without images
Then user can see application 'TestApp' on home page
When user open application 'TestApp' details
And user download application
Then user see correct application with title 'TestApp', description 'Test Description', category 'Maps', downloads ''

Scenario: Edit application without images and verify that changes applied.
Given user is on login page
And user enter login 'admin' and password 'admin'
When user open my applications page
And user open application 'TestApp' details
And user open edit applications page
And user edit application without images
Then user can see application 'TestApp' on home page
When user open application 'TestApp' details
And user download application
Then user see correct application with title 'TestApp', description 'Changed Test Description', category 'Information', downloads ''

Scenario: Create new application with images. Verify it is displayed correctly and can be downloaded.
Given user is on login page
And user enter login 'admin' and password 'admin'
When user open my applications page
And user create new application with images
Then user can see application 'TestImages' on home page
When user open application 'TestImages' details
And user download application
Then user see correct application with title 'TestImages', description 'Test Description', category 'Fun', downloads ''

Scenario: Create new application and download it many time. Verify that it is in most popular section and if you click it there you will be navigated to details page for this application.
Given user is on login page
And user enter login 'admin' and password 'admin'
When user open my applications page
And user create new popular application
Then user can see application 'TestPopular' on home page
When user download application 'TestPopular', '10' times
Then user see correct application with title 'TestPopular', description 'Test Description', category 'Information', downloads '10'

Scenario: Remove application. Verify it is displayed correctly and can be downloaded.
Given user is on login page
And user enter login 'admin' and password 'admin'
When user open my applications page
And user delete application 'TestApp'
And user open my applications page
Then user can't see application 'TestApp' on home page
When user open my applications page
And user delete application 'TestImages'
And user open my applications page
Then user can't see application 'TestImages' on home page
When user open my applications page
And user delete application 'TestPopular'
And user open my applications page
Then user can't see application 'TestPopular' on home page