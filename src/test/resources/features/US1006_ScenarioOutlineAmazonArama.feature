Feature: US1006 Kullanici Scenario  outline ile birden fazla kelime aratir
  @ss

  Scenario Outline:  TC10 Amazon coklu urun testi
    Given kullanici Amazon anasayfaya gider
    Then amazonda "<kelimeler>" icin arama yapar
    And sonuclarin "<kelimeler>" icerdigini test eder
    And  sayfayi kapatir

    Examples:
      | kelimeler |
      | Nutella   |
      | Java      |
      | Samsung   |
      | Apple     |
      | Furkan    |
