$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("google-text-search.feature");
formatter.feature({
  "line": 1,
  "name": "Google search",
  "description": "",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "User can search \u0027Selenium\u0027 keyword",
  "description": "",
  "id": "google-search;user-can-search-\u0027selenium\u0027-keyword",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "an opened browser with google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "keyword SELENIUM is entered into an input field",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "search results containing SELENIUM are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchStepsDef.openGoogleSearch()"
});
formatter.result({
  "duration": 7005135200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SELENIUM",
      "offset": 8
    }
  ],
  "location": "GoogleSearchStepsDef.enterKeywordInInputField(String)"
});
formatter.result({
  "duration": 236647936,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SELENIUM",
      "offset": 26
    }
  ],
  "location": "GoogleSearchStepsDef.searchResultsAreDisplayed(String)"
});
formatter.result({
  "duration": 270016,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User can search \u0027Wikipedia\u0027 keyword",
  "description": "",
  "id": "google-search;user-can-search-\u0027wikipedia\u0027-keyword",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "an opened browser with google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "keyword Wikipedia is entered into an input field",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "search results containing Wikipedia are displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "GoogleSearchStepsDef.openGoogleSearch()"
});
formatter.result({
  "duration": 5757816366,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wikipedia",
      "offset": 8
    }
  ],
  "location": "GoogleSearchStepsDef.enterKeywordInInputField(String)"
});
formatter.result({
  "duration": 243455114,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Wikipedia",
      "offset": 26
    }
  ],
  "location": "GoogleSearchStepsDef.searchResultsAreDisplayed(String)"
});
formatter.result({
  "duration": 175138,
  "status": "passed"
});
});