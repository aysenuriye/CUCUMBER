Feature: US1002 Kullanici Background kullanarak Amazonda arama yapar



  Scenario: TC04 Kullanici Amazonda Nutella aratir
    Given kullanici Amazon anasayfaya gider
    Then arama kutusuna Nutella yazar ve enter tusuna basar
    And arama sonuclarinin Nutella icerdigini test eder
    And sayfayi kapatir


  Scenario: TC05 kullanici Amazonda Java aratir
    Given kullanici Amazon anasayfaya gider
    When arama kutusuna Java yazar ve enter tusuna basar
    Then arama sonuclarinin Java icerdigini test eder
    And sayfayi kapatir

  Scenario: TC06 kullanici Amazonda Apple aratir
    Given kullanici Amazon anasayfaya gider
    When arama kutusuna Apple yazar ve enter tusuna basar
    Then arama sonuclarinin Apple icerdigini test eder
    And sayfayi kapatir