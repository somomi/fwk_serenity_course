Narrative:
As a user
I want to register a new user or developer
So that I can validate register functionality and check difference between permissions


Scenario: Register new user and verify that it is logged in.
Given user is on login page
And user opens user registration
When user register a simple user
Then user see correct welcome message 'Welcome Alex Chernyshev' on home page

Scenario: Register new user, logout and verify that user can login.
Given user is on login page
And user opens user registration
When user register a simple user
Then user see correct welcome message 'Welcome Alex Chernyshev' on home page
When user is on login page
And user enter login 'user' and password 'user'
Then user see correct welcome message 'Welcome Alex Chernyshev' on home page

Scenario: Register as developer, verify that user can open page to upload application.
Given user is on login page
And user opens user registration
When user register a developer user
Then user see correct welcome message 'Welcome Alex Chernyshev' on home page
When user open my applications page
And user open new application page
Then user see text 'New application'

Scenario: Register as regular user, verify that user can see applications but cannot upload them.
Given user is on login page
And user opens user registration
When user register a simple user
Then user see correct welcome message 'Welcome Alex Chernyshev' on home page
And my application link should exist = 'false'