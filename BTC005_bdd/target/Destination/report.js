$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/bittech/Documents/workspace/BTC005_bdd/login.feature");
formatter.feature({
  "line": 1,
  "name": "login in faebook",
  "description": "",
  "id": "login-in-faebook",
  "keyword": "Feature"
});
formatter.before({
  "duration": 150633,
  "status": "passed"
});
formatter.before({
  "duration": 2546702958,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "i nevigate to facebook homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepClass.i_nevigate_to_facebook_homepage()"
});
formatter.result({
  "duration": 881547576,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "login",
  "description": "",
  "id": "login-in-faebook;login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "i entered my userId",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "i entered my password",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "i clicked on login button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "i should nevigate to profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepClass.i_entered_my_userId()"
});
formatter.result({
  "duration": 67017881,
  "status": "passed"
});
formatter.match({
  "location": "stepClass.i_entered_my_password()"
});
formatter.result({
  "duration": 49552764,
  "status": "passed"
});
formatter.match({
  "location": "stepClass.i_clicked_on_login_button()"
});
formatter.result({
  "duration": 26619,
  "status": "passed"
});
formatter.match({
  "location": "stepClass.i_should_nevigate_to_profile_page()"
});
formatter.result({
  "duration": 19304,
  "status": "passed"
});
formatter.after({
  "duration": 59962,
  "status": "passed"
});
formatter.after({
  "duration": 102971503,
  "status": "passed"
});
formatter.before({
  "duration": 2521027022,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "i nevigate to facebook homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "stepClass.i_nevigate_to_facebook_homepage()"
});
formatter.result({
  "duration": 754107274,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "signup",
  "description": "",
  "id": "login-in-faebook;signup",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@Signup"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "i fill up sign up form",
  "rows": [
    {
      "cells": [
        "firstName",
        "LName",
        "email",
        "pass",
        "rePass",
        "phone"
      ],
      "line": 20
    },
    {
      "cells": [
        "shahid",
        "islam",
        "s@yajhooo",
        "123",
        "123",
        "12345678"
      ],
      "line": 21
    },
    {
      "cells": [
        "shahid",
        "islam",
        "s@yajhooo",
        "123",
        "123",
        "12345678"
      ],
      "line": 22
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "i clicked on sign up  button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "i should be registered",
  "keyword": "Then "
});
formatter.match({
  "location": "stepClass.i_fill_up_sign_up_form(DataTable)"
});
formatter.result({
  "duration": 210836707,
  "status": "passed"
});
formatter.match({
  "location": "stepClass.i_clicked_on_sign_up_button()"
});
formatter.result({
  "duration": 27886,
  "status": "passed"
});
formatter.match({
  "location": "stepClass.i_should_be_registered()"
});
formatter.result({
  "duration": 21339,
  "status": "passed"
});
formatter.after({
  "duration": 89185804,
  "status": "passed"
});
});