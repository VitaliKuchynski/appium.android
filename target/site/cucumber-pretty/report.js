$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("account-login.feature");
formatter.feature({
  "line": 3,
  "name": "Hotels app account login feature",
  "description": "",
  "id": "hotels-app-account-login-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Hotels-Android"
    }
  ]
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on hotel app home page",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateAccountSD.iAmOnHotelAppHomePage()"
});
formatter.result({
  "duration": 30503670031,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Verify successful creation of creating account",
  "description": "",
  "id": "hotels-app-account-login-feature;verify-successful-creation-of-creating-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@Account-creation"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I scroll down page",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I tap on Create Account button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I fill out all required fields",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I submit the form",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I verify successful creation of a home page",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccountSD.iScrollDown()"
});
formatter.result({
  "duration": 39504,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Create Account",
      "offset": 9
    }
  ],
  "location": "CreateAccountSD.iTapOnCreateAccountButton(String)"
});
formatter.result({
  "duration": 5137216700,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountSD.iFillOutAllRequiredFields()"
});
formatter.result({
  "duration": 20625500993,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountSD.iSubmitTheForm()"
});
formatter.result({
  "duration": 6544123114,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountSD.verifySuccessfulCreationOfAHomePage()"
});
formatter.result({
  "duration": 5044914004,
  "status": "passed"
});
formatter.after({
  "duration": 5507682883,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on hotel app home page",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateAccountSD.iAmOnHotelAppHomePage()"
});
formatter.result({
  "duration": 25397128045,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Verify invalid login on android hotel app",
  "description": "",
  "id": "hotels-app-account-login-feature;verify-invalid-login-on-android-hotel-app",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@Login-invalid"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "I scroll down page",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "I tap on Sign in button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I enter grisha@tut.by invalid to username field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I enter 123hotels invalid to password field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I verify invalid error message",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateAccountSD.iScrollDown()"
});
formatter.result({
  "duration": 21678,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sign in",
      "offset": 9
    }
  ],
  "location": "CreateAccountSD.iTapOnCreateAccountButton(String)"
});
formatter.result({
  "duration": 10131320936,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "grisha@tut.by",
      "offset": 8
    },
    {
      "val": "username",
      "offset": 33
    }
  ],
  "location": "CreateAccountSD.iEnterCredential(String,String)"
});
formatter.result({
  "duration": 5582404211,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123hotels",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 29
    }
  ],
  "location": "CreateAccountSD.iEnterCredential(String,String)"
});
formatter.result({
  "duration": 6151471998,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccountSD.verifyInvalidError()"
});
formatter.result({
  "duration": 38659,
  "status": "passed"
});
formatter.after({
  "duration": 5499079626,
  "status": "passed"
});
});