$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "As a user I want a login page so that only authentic",
  "description": "  users will be able to login",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Valid users should be able to login",
  "description": "",
  "id": "as-a-user-i-want-a-login-page-so-that-only-authentic;valid-users-should-be-able-to-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on techfios site",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Dashboard page should display",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.i_am_on_techfios_site()"
});
formatter.result({
  "duration": 8073022000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_enter_username_and_password()"
});
formatter.result({
  "duration": 249265900,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_on_sign_in_button()"
});
formatter.result({
  "duration": 1459631500,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat steps.LoginSteps.i_click_on_sign_in_button(LoginSteps.java:35)\r\n\tat ✽.And I click on sign in button(./src/test/java/features/login.feature:7)\r\n",
  "status": "pending"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});