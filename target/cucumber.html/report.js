$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/demo2.feature");
formatter.feature({
  "line": 1,
  "name": "login Feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": "login-feature;successful-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user has opened the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click onto the signin link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "use enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "message display login successful",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "login-feature;successful-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "login-feature;successful-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "lalitha",
        "password123"
      ],
      "line": 11,
      "id": "login-feature;successful-login-with-valid-credentials;;2"
    },
    {
      "cells": [
        "admin",
        "password456"
      ],
      "line": 12,
      "id": "login-feature;successful-login-with-valid-credentials;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": "login-feature;successful-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user has opened the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click onto the signin link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "use enters \"lalitha\" and \"password123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "message display login successful",
  "keyword": "Then "
});
formatter.match({
  "location": "parameterization.user_has_opened_the_application()"
});
formatter.result({
  "duration": 11376578200,
  "status": "passed"
});
formatter.match({
  "location": "parameterization.user_click_onto_the_signin_link()"
});
formatter.result({
  "duration": 1174544300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "lalitha",
      "offset": 12
    },
    {
      "val": "password123",
      "offset": 26
    }
  ],
  "location": "parameterization.use_enters_and(String,String)"
});
formatter.result({
  "duration": 681757200,
  "status": "passed"
});
formatter.match({
  "location": "parameterization.message_display_login_successful()"
});
formatter.result({
  "duration": 565172900,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Successful login with valid credentials",
  "description": "",
  "id": "login-feature;successful-login-with-valid-credentials;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user has opened the application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user click onto the signin link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "use enters \"admin\" and \"password456\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "message display login successful",
  "keyword": "Then "
});
formatter.match({
  "location": "parameterization.user_has_opened_the_application()"
});
formatter.result({
  "duration": 11798429600,
  "status": "passed"
});
formatter.match({
  "location": "parameterization.user_click_onto_the_signin_link()"
});
formatter.result({
  "duration": 552508800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin",
      "offset": 12
    },
    {
      "val": "password456",
      "offset": 24
    }
  ],
  "location": "parameterization.use_enters_and(String,String)"
});
formatter.result({
  "duration": 261923700,
  "status": "passed"
});
formatter.match({
  "location": "parameterization.message_display_login_successful()"
});
formatter.result({
  "duration": 736331100,
  "status": "passed"
});
});