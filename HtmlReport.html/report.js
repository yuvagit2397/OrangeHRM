$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/featureFile/OrangeHrmDashBoard.feature");
formatter.feature({
  "name": "OrangeHRM",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verifying the pending leave request",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.ToGetPendingLeaveRequest.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters  valid username and password",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.ToGetPendingLeaveRequest.user_enters_valid_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see the dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.ToGetPendingLeaveRequest.user_should_see_the_dashboard_page()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat stepDefinitions.ToGetPendingLeaveRequest.user_should_see_the_dashboard_page(ToGetPendingLeaveRequest.java:56)\r\n\tat ✽.user should see the dashboard page(file:///D:/yuvasri_revision/OrangeHRM/src/main/java/featureFile/OrangeHrmDashBoard.feature:5)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user validating the pending leave request",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.ToGetPendingLeaveRequest.user_validating_the_pending_leave_request()"
});
formatter.result({
  "status": "skipped"
});
});