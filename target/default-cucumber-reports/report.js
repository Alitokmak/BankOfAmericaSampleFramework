$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/login.feature");
formatter.feature({
  "name": "",
  "description": "  As a user I should able to access BAO site",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User goes to BAO website",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    }
  ]
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
formatter.step({
  "name": "verify thatpage title \"Bank of America - Banking, Credit Cards, Loans and Merrill Investing\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.verify_thatpage_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});