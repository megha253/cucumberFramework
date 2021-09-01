$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Test1.feature");
formatter.feature({
  "line": 2,
  "name": "LoginPage",
  "description": "",
  "id": "loginpage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "To log into freeCRM application",
  "description": "",
  "id": "loginpage;to-log-into-freecrm-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Navigate on the page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter the username in the field",
  "keyword": "And "
});
formatter.match({
  "location": "Test1stepdef.navigate()"
});
formatter.result({
  "duration": 19934877700,
  "status": "passed"
});
formatter.match({
  "location": "Test1stepdef.username()"
});
formatter.result({
  "duration": 17159106000,
  "status": "passed"
});
});