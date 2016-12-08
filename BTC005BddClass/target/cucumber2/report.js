$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/bittech/Documents/workspace/BTC005BddClass/EndToEnd.feature");
formatter.feature({
  "line": 1,
  "name": "ened to end scenario",
  "description": "",
  "id": "ened-to-end-scenario",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "",
  "description": "",
  "id": "ened-to-end-scenario;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@s2"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "i enter eshopper url",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "i verified homePage url",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "i clicked women menu bar",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.i_enter_eshopper_url()"
});
formatter.result({
  "duration": 9728140295,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_verified_homePage_url()"
});
formatter.result({
  "duration": 5402150,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_clicked_women_menu_bar()"
});
formatter.result({
  "duration": 97429096,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.close_browser()"
});
formatter.result({
  "duration": 216561921,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "",
  "description": "",
  "id": "ened-to-end-scenario;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@s2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "i enter eshopper url",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "i mouseOver in Women",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "i click on saree submenu",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "i click first product",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "i click buy now",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.i_enter_eshopper_url()"
});
formatter.result({
  "duration": 7717780143,
  "status": "passed"
});
formatter.match({
  "location": "StepDefination.i_mouseOver_in_Women()"
});
formatter.result({
  "duration": 2070393018,
  "error_message": "org.openqa.selenium.UnsupportedCommandException: POST /session/78d63899-f8dd-f84c-ae70-5f3f6cb67805/moveto did not match a known command\nBuild info: version: \u00273.0.1\u0027, revision: \u00271969d75\u0027, time: \u00272016-10-18 09:49:13 -0700\u0027\nSystem info: host: \u0027Bittechs-iMac.home\u0027, ip: \u0027192.168.1.14\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_73\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{rotatable\u003dfalse, raisesAccessibilityExceptions\u003dfalse, marionette\u003dtrue, firefoxOptions\u003d{args\u003d[], prefs\u003d{}}, appBuildId\u003d20160502172042, moz:firefoxOptions\u003d{args\u003d[], prefs\u003d{}}, version\u003d, platform\u003dMAC, proxy\u003d{}, specificationLevel\u003d1, acceptSslCerts\u003dfalse, browserVersion\u003d46.0.1, platformVersion\u003d14.5.0, XULappId\u003d{ec8030f7-c20a-464f-9b0e-13a3a9e97384}, browserName\u003dFirefox, takesScreenshot\u003dtrue, takesElementScreenshot\u003dtrue, platformName\u003dDarwin, device\u003ddesktop}]\nSession ID: 78d63899-f8dd-f84c-ae70-5f3f6cb67805\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:127)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:93)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:42)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:163)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:601)\n\tat org.openqa.selenium.remote.RemoteExecuteMethod.execute(RemoteExecuteMethod.java:35)\n\tat org.openqa.selenium.remote.RemoteMouse.mouseMove(RemoteMouse.java:89)\n\tat org.openqa.selenium.interactions.MoveMouseAction.perform(MoveMouseAction.java:39)\n\tat org.openqa.selenium.interactions.CompositeAction.perform(CompositeAction.java:50)\n\tat org.openqa.selenium.interactions.Actions.perform(Actions.java:373)\n\tat HomePage.hover(HomePage.java:26)\n\tat StepDefination.i_mouseOver_in_Women(StepDefination.java:35)\n\tat ✽.When i mouseOver in Women(/Users/bittech/Documents/workspace/BTC005BddClass/EndToEnd.feature:16)\n",
  "status": "failed"
});
formatter.match({
  "location": "StepDefination.i_click_on_saree_submenu()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.i_click_first_product()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.i_click_buy_now()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefination.close_browser()"
});
formatter.result({
  "status": "skipped"
});
});