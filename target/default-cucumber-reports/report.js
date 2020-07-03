$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Login/CashRewardsCreditCardsApply.feature");
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
formatter.step({
  "name": "User click to credit card button",
  "keyword": "Then "
});
formatter.match({
  "location": "CreditCards.user_click_to_credit_card_button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to apply to Cash Rewards Card",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Cash_Rewards_Credit_Cards_Apply"
    }
  ]
});
formatter.step({
  "name": "User click to Cash Rewards Credit Card button",
  "keyword": "Given "
});
formatter.match({
  "location": "CashRewardsCreditCardsApplyStepDefiniton.user_click_to_Cash_Rewards_Credit_Card_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click to Apply Now button",
  "keyword": "Then "
});
formatter.match({
  "location": "CashRewardsCreditCardsApplyStepDefiniton.user_click_to_Apply_Now_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User fill out information side",
  "keyword": "And "
});
formatter.match({
  "location": "CashRewardsCreditCardsApplyStepDefiniton.user_fill_out_information_side()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click Save and Continue button",
  "keyword": "When "
});
formatter.match({
  "location": "CashRewardsCreditCardsApplyStepDefiniton.user_click_Save_and_Continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User verify that display Submit my Application",
  "keyword": "Then "
});
formatter.match({
  "location": "CashRewardsCreditCardsApplyStepDefiniton.user_verify_that_display_Submit_my_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});