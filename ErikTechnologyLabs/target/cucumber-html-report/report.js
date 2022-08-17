$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/search.feature");
formatter.feature({
  "line": 1,
  "name": "Erik Technology Labs Search",
  "description": "",
  "id": "erik-technology-labs-search",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "Search Page Scenario",
  "description": "",
  "id": "erik-technology-labs-search;search-page-scenario",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Websiteye gidilir",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Onaylama butonlarını kabul et",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "Search Box \"\u003cproduct\u003e\" yazilir",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Product icin arama buttona tiklanir",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Yorum sirasina gore sirala secilir",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Ucretsiz kargo secenegi secilir",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Ilk urun sepete eklenir",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Son urun sepete eklenir",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Sepete gidilir",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "En ucuzun adedi iki yapilir",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Misafir kullanici olarak odeme adimina ilerlenir",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Testin basarili olduguna dair mesaj yazilir",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "erik-technology-labs-search;search-page-scenario;",
  "rows": [
    {
      "cells": [
        "product"
      ],
      "line": 16,
      "id": "erik-technology-labs-search;search-page-scenario;;1"
    },
    {
      "cells": [
        "kulaklık"
      ],
      "line": 17,
      "id": "erik-technology-labs-search;search-page-scenario;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Search Page Scenario",
  "description": "",
  "id": "erik-technology-labs-search;search-page-scenario;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "Websiteye gidilir",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Onaylama butonlarını kabul et",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "Search Box \"kulaklık\" yazilir",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "Product icin arama buttona tiklanir",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "Yorum sirasina gore sirala secilir",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Ucretsiz kargo secenegi secilir",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Ilk urun sepete eklenir",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Son urun sepete eklenir",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "Sepete gidilir",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "En ucuzun adedi iki yapilir",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Misafir kullanici olarak odeme adimina ilerlenir",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Testin basarili olduguna dair mesaj yazilir",
  "keyword": "Then "
});
formatter.match({
  "location": "BrandsSteps.go_to_Website()"
});
formatter.result({
  "duration": 19322534500,
  "status": "passed"
});
formatter.match({
  "location": "BrandsSteps.confirmation_buttons_click()"
});
formatter.result({
  "duration": 6866642000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "kulaklık",
      "offset": 12
    }
  ],
  "location": "SearchSteps.searchBoxYazilir(String)"
});
formatter.result({
  "duration": 143189500,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.productIcinAramaButtonaTiklanir()"
});
formatter.result({
  "duration": 2432716100,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.yorumSirasinaGoreSiralaSecilir()"
});
formatter.result({
  "duration": 2256514700,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.ucretsizKargoSecenegiSecilir()"
});
formatter.result({
  "duration": 2823535500,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.ilkUrunSepeteEklenir()"
});
formatter.result({
  "duration": 4765604700,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.sonUrunSepeteEklenir()"
});
formatter.result({
  "duration": 5803330400,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.sepeteGidilir()"
});
formatter.result({
  "duration": 7572439200,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.enUcuzunAdediIkiYapilir()"
});
formatter.result({
  "duration": 1847208900,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.misafirKullaniciOlarakOdemeAdiminaIlerlenir()"
});
formatter.result({
  "duration": 5635215400,
  "status": "passed"
});
formatter.match({
  "location": "SearchSteps.testinBasariliOldugunaDairMesajYazilir()"
});
formatter.result({
  "duration": 146300,
  "status": "passed"
});
});