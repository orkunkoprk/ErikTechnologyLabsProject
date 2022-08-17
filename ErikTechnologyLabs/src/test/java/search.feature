Feature: Erik Technology Labs Search
  Scenario Outline: Search Page Scenario
    Given Websiteye gidilir
    And Onaylama butonlarını kabul et
    And Search Box "<product>" yazilir
    And  Product icin arama buttona tiklanir
    And  Yorum sirasina gore sirala secilir
    And Ucretsiz kargo secenegi secilir
    And Ilk urun sepete eklenir
    And Son urun sepete eklenir
    And Sepete gidilir
    And En ucuzun adedi iki yapilir
    When Misafir kullanici olarak odeme adimina ilerlenir
    Then Testin basarili olduguna dair mesaj yazilir
    Examples:
    |product|
    |kulaklık|




