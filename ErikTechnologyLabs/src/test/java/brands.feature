Feature: Erik Technology Labs Brands
  Scenario: Brands Page Scenario
    Given Websiteye gidilir
    And Onaylama butonlarını kabul et
    And Markalar butonuna tikla
    And Markaları gor butonuna tiklanir
    #And Tüm markalara tikla --> Böyle bir senaryo mevcut görünmüyor
    And A harfi ile baslayan markalari sec
    When A harfindeki markalari txt dosyasina yazdir
    Then Testin basarili olduguna dair mesaj yazilir
