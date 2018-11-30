$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/features/updateprofile.feature");
formatter.feature({
  "name": "Verify Update Profile Functionality in New Tours application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@important"
    }
  ]
});
formatter.scenarioOutline({
  "name": "update the profile",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user open the browser and load the new tours application url",
  "keyword": "Given "
});
formatter.step({
  "name": "verify home page displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "click on Sign-On link",
  "keyword": "When "
});
formatter.step({
  "name": "enter user name \u003cuserName\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "enter password \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "verify dashboard page displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "user click on Profile link",
  "keyword": "When "
});
formatter.step({
  "name": "profile page should be displayed",
  "keyword": "Then "
});
formatter.step({
  "name": "enter First name \u003cfirstName\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "enter Last name \u003clastName\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "enter Phone \u003cphone\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "enter Email \u003cemail\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "enter Address \u003caddress\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "enter City \u003ccity\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "enter State \u003cstate\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "enter Postal Code \u003cpostcode\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "enter Country \u003ccountry\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "click on Submit Button",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "firstName",
        "lastName",
        "phone",
        "email",
        "address",
        "city",
        "state",
        "postcode",
        "country"
      ]
    },
    {
      "cells": [
        "gvkishore.kish@gmail.com",
        "test1234",
        "kishore",
        "ganga",
        "8324999009",
        "gvkishore.kish@gmail.com",
        "springdaleRoad",
        "waukesha",
        "wi",
        "53186",
        "UNITED STATES"
      ]
    },
    {
      "cells": [
        "gvkishore.kish@gmail.com",
        "test1234",
        "kishore",
        "ganga",
        "8324999009",
        "gvkishore.kish@gmail.com",
        "springdaleRoad",
        "waukesha",
        "wi",
        "53186",
        "UNITED STATES"
      ]
    },
    {
      "cells": [
        "gvkishore.kish@gmail.com",
        "test1234",
        "kishore",
        "ganga",
        "8324999009",
        "gvkishore.kish@gmail.com",
        "springdaleRoad",
        "waukesha",
        "wi",
        "53186",
        "UNITED STATES"
      ]
    },
    {
      "cells": [
        "gvkishore.kish@gmail.com",
        "test1234",
        "kishore",
        "ganga",
        "8324999009",
        "gvkishore.kish@gmail.com",
        "springdaleRoad",
        "waukesha",
        "wi",
        "53186",
        "UNITED STATES"
      ]
    }
  ]
});
formatter.scenario({
  "name": "update the profile",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@important"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user open the browser and load the new tours application url",
  "keyword": "Given "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.user_open_the_browser_and_load_the_new_tours_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify home page displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.verify_home_page_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Sign-On link",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.click_on_Sign_On_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter user name gvkishore.kish@gmail.com",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_user_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password test1234",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify dashboard page displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.verify_dashboard_page_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Profile link",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.user_click_on_Profile_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "profile page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.profile_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter First name kishore",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_First_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Last name ganga",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Last_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Phone 8324999009",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Phone(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Email gvkishore.kish@gmail.com",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Address springdaleRoad",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter City waukesha",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_City(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter State wi",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_State(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Postal Code 53186",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Postal_Code(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Country UNITED STATES",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Country(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Submit Button",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.click_on_Submit_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "update the profile",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@important"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user open the browser and load the new tours application url",
  "keyword": "Given "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.user_open_the_browser_and_load_the_new_tours_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify home page displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.verify_home_page_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Sign-On link",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.click_on_Sign_On_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter user name gvkishore.kish@gmail.com",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_user_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password test1234",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify dashboard page displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.verify_dashboard_page_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Profile link",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.user_click_on_Profile_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "profile page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.profile_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter First name kishore",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_First_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Last name ganga",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Last_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Phone 8324999009",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Phone(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Email gvkishore.kish@gmail.com",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Address springdaleRoad",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter City waukesha",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_City(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter State wi",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_State(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Postal Code 53186",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Postal_Code(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Country UNITED STATES",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Country(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Submit Button",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.click_on_Submit_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "update the profile",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@important"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user open the browser and load the new tours application url",
  "keyword": "Given "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.user_open_the_browser_and_load_the_new_tours_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify home page displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.verify_home_page_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Sign-On link",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.click_on_Sign_On_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter user name gvkishore.kish@gmail.com",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_user_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password test1234",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify dashboard page displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.verify_dashboard_page_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Profile link",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.user_click_on_Profile_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "profile page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.profile_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter First name kishore",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_First_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Last name ganga",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Last_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Phone 8324999009",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Phone(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Email gvkishore.kish@gmail.com",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Address springdaleRoad",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter City waukesha",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_City(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter State wi",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_State(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Postal Code 53186",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Postal_Code(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Country UNITED STATES",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Country(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Submit Button",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.click_on_Submit_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "update the profile",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@important"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user open the browser and load the new tours application url",
  "keyword": "Given "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.user_open_the_browser_and_load_the_new_tours_application_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify home page displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.verify_home_page_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Sign-On link",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.click_on_Sign_On_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter user name gvkishore.kish@gmail.com",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_user_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter password test1234",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify dashboard page displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.verify_dashboard_page_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on Profile link",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.user_click_on_Profile_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "profile page should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.profile_page_should_be_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter First name kishore",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_First_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Last name ganga",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Last_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Phone 8324999009",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Phone(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Email gvkishore.kish@gmail.com",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Email(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Address springdaleRoad",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Address(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter City waukesha",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_City(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter State wi",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_State(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Postal Code 53186",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Postal_Code(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter Country UNITED STATES",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.enter_Country(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Submit Button",
  "keyword": "When "
});
formatter.match({
  "location": "UpdateProfileStepDefinition.click_on_Submit_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});