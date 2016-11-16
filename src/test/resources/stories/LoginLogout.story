Narrative:
As a user
I want to login to the application with correct and incorrect credentials
So that I can validate authentification

Scenario: Login with correct login and password.
Given user is on login page
When user enter login 'admin' and password 'admin'
Then user see correct welcome message 'Welcome Ivan Petrov' on home page

Scenario: Login with correct login and incorrect password.
Given user is on login page
When user enter login 'admin' and password 'addd'
Then user see message 'You have entered an invalid username or password!'

Scenario: Login with incorect login and password, then enter correct login and password.
Given user is on login page
When user enter login 'addd' and password 'addd'
Then user see message 'You have entered an invalid username or password!'
When user enter login 'admin' and password 'admin'
Then user see correct welcome message 'Welcome Ivan Petrov' on home page




