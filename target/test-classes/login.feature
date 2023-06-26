@Smoke 
@regrassion 

Feature: Login with valid credentials
Describetion: acceptance criteria = login test should pass

@positive
Scenario: Pass the valid credential for positive testing 
Given open the browser
And pass the url 
When  pass the valid username
And  pass the valid password
And  click login
Then  check logout is visible