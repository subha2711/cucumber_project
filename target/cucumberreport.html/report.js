$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TFPractice.feature");
formatter.feature({
  "line": 1,
  "name": "To test the select box functionality",
  "description": "",
  "id": "to-test-the-select-box-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3479318600,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Sky Blue Background",
  "description": "",
  "id": "to-test-the-select-box-functionality;sky-blue-background",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "\"Set SkyBlue Background\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on the button;",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "the background color will change to sky blue",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyBlue Background",
      "offset": 1
    }
  ],
  "location": "TestSteps.button_exists(String)"
});
formatter.result({
  "duration": 518003600,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.i_click_on_the_button()"
});
formatter.result({
  "duration": 101348700,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.the_background_color_will_change_to_sky_blue()"
});
formatter.result({
  "duration": 60952400,
  "status": "passed"
});
formatter.after({
  "duration": 757484700,
  "status": "passed"
});
formatter.before({
  "duration": 2402827600,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "White Background Change",
  "description": "",
  "id": "to-test-the-select-box-functionality;white-background-change",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "\"Set SkyWhite Background\" button exists",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I click on the button",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Set SkyWhite Background",
      "offset": 1
    }
  ],
  "location": "TestSteps.button_exists(String)"
});
formatter.result({
  "duration": 150763300,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.i_click_on_the_button1()"
});
formatter.result({
  "duration": 56241100,
  "status": "passed"
});
formatter.match({
  "location": "TestSteps.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 36132100,
  "status": "passed"
});
formatter.after({
  "duration": 799796500,
  "status": "passed"
});
});