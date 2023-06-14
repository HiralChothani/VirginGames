$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("findgame.feature");
formatter.feature({
  "line": 1,
  "name": "Find the game and verify",
  "description": "",
  "id": "find-the-game-and-verify",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9171072500,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I mouse hover on \"All Games\" tab",
  "keyword": "And "
});
formatter.match({
  "location": "BackgroundSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 345239800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "All Games",
      "offset": 18
    }
  ],
  "location": "BackgroundSteps.iMouseHoverOnTab(String)"
});
formatter.result({
  "duration": 766201800,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Find the games and verify the games are in list",
  "description": "",
  "id": "find-the-game-and-verify;find-the-games-and-verify-the-games-are-in-list",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@sanity"
    },
    {
      "line": 7,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I click \"All Games\" tab",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I navigate to \"https://www.virgingames.com/uk/all-games\" url page",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I should see the games names displayed on page",
  "rows": [
    {
      "cells": [
        "gamesName"
      ],
      "line": 12
    },
    {
      "cells": [
        "7\u0027s Deluxe Repeater"
      ],
      "line": 13
    },
    {
      "cells": [
        "Absolootly Mad Mega Moolah"
      ],
      "line": 14
    },
    {
      "cells": [
        "Amazing Link: Zeus"
      ],
      "line": 15
    },
    {
      "cells": [
        "Augustus"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "All Games",
      "offset": 9
    }
  ],
  "location": "AllGamesSteps.iClickTab(String)"
});
formatter.result({
  "duration": 127500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.virgingames.com/uk/all-games",
      "offset": 15
    }
  ],
  "location": "AllGamesSteps.iNavigateToUrlPage(String)"
});
formatter.result({
  "duration": 1984455000,
  "status": "passed"
});
formatter.match({
  "location": "AllGamesSteps.iShouldSeeTheGamesNamesDisplayedOnPage(DataTable)"
});
formatter.result({
  "duration": 43928061600,
  "status": "passed"
});
formatter.after({
  "duration": 108000,
  "status": "passed"
});
});