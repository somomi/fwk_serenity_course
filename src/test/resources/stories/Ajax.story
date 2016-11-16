Narrative:
As a user
I want to perform check ajax synchronization
So that I can synchronize object correctly

Scenario: Open ajax page and enter two valid numbers, click ‘Sum’, wait for result and check that result is correct.
Given user is on login page
And user enter login 'admin' and password 'admin'
When user open ajax page
And user enter to first field '<first>' and to second field '<second>'
Then user waiting for result text '<result>'

Examples:
|first|second|result|
|48.1|51.8|Result is: 99.9|
|44.2|some text|Result is: Incorrect data|