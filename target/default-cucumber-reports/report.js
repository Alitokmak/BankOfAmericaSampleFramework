$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Login/CreditCard.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User login on the page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginStepDefinition.user_login_on_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to see all credit card options",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@credit_card"
    }
  ]
});
formatter.step({
  "name": "User click to credit card button",
  "keyword": "Given "
});
formatter.match({
  "location": "CreditCards.user_click_to_credit_card_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify that all credit cards options",
  "rows": [
    {
      "cells": [
        "Cash Rewards Credit Cards"
      ]
    },
    {
      "cells": [
        "Travel and Airlines Rewards Cards"
      ]
    },
    {
      "cells": [
        "Lower Interest Rate Cards"
      ]
    },
    {
      "cells": [
        "Points Rewards Cards"
      ]
    },
    {
      "cells": [
        "Cards to Build or Rebuild Credit"
      ]
    },
    {
      "cells": [
        "Cards for Students"
      ]
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "CreditCards.verify_that_all_credit_cards_options(String\u003e)"
});
formatter.result({
  "error_message": "org.openqa.selenium.InvalidSelectorException: invalid selector: Unable to locate an element with the xpath expression [title\u003d\u0027Cash Rewards Credit Cards\u0027] because of the following error:\nSyntaxError: Failed to execute \u0027evaluate\u0027 on \u0027Document\u0027: The string \u0027[title\u003d\u0027Cash Rewards Credit Cards\u0027]\u0027 is not a valid XPath expression.\n  (Session info: chrome\u003d83.0.4103.116)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/invalid_selector_exception.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Alis-MacBook-Air.local\u0027, ip: \u00272601:600:9500:77f0:2dca:3d4b:17e4:aab5%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15.5\u0027, java.version: \u002711.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 83.0.4103.116, chrome: {chromedriverVersion: 83.0.4103.39 (ccbf011cb2d2b..., userDataDir: /var/folders/zn/7_rshp0s6v5...}, goog:chromeOptions: {debuggerAddress: localhost:65243}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: ee09411b66396c0384c8373dc9cc4637\n*** Element info: {Using\u003dxpath, value\u003d[title\u003d\u0027Cash Rewards Credit Cards\u0027]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat com.sample.utilities.BrowserUtils.getTextElements(BrowserUtils.java:10)\n\tat com.sample.step_definitions.CreditCards.verify_that_all_credit_cards_options(CreditCards.java:24)\n\tat ✽.verify that all credit cards options(src/test/resources/features/Login/CreditCard.feature:8)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "status": "passed"
});
});