$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test.feature");
formatter.feature({
  "line": 1,
  "name": "LoginPage",
  "description": "",
  "id": "loginpage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "To log into freeCRM application",
  "description": "",
  "id": "loginpage;to-log-into-freecrm-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "Open the url to navigate on freeCRM application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "enter the username and password in the field",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "click on submit button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "check user is navigated on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "Test.navigate_on_the_page()"
});
formatter.result({
  "duration": 17058275000,
  "status": "passed"
});
formatter.match({
  "location": "Test.enter_the_username_in_the_field()"
});
formatter.result({
  "duration": 536411800,
  "status": "passed"
});
formatter.match({
  "location": "Test.click_on_submit_button()"
});
formatter.result({
  "duration": 7637396400,
  "status": "passed"
});
formatter.match({
  "location": "Test.check_user_is_navigated_on_home_page()"
});
formatter.result({
  "duration": 114678200,
  "status": "passed"
});
});