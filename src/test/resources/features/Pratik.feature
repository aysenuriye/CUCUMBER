  // Kullanici https://www.iienstitu.com/en sayfasina gider
    // Login butonuna tiklar
    // Giris bilgilerini girer ve basarili sekilde giris yaptigini test eder
    // headers da bulunan egitimler kismina tiklar
    // acilan egitimler sayfasindan fiyat araligi olarak artan fiyat olarak secer
    // ucretsiz egitimlerden herhangi birini alir
    // kimlik dogrulama islemlerini girer
    // egitimin ucretsiz oldugunu test eder ve siparisi tamamlar.
    Feature: kullanıcı basarılı bir sekilde ucretsiz egitim alir
      Scenario:  kullanıcı basarılı bir sekilde ucretsiz egitim alabildiigi test edilir

         Given  Kullanici Udemy sayfasina gider
      Then loginButtonHomePage tiklar
      And Giris bilgilerini girer ve basarili sekilde giris yaptigini test eder
      And  headers da bulunan egitimler kismina tiklar
      And  acilan egitimler sayfasindan fiyat araligi olarak artan fiyat olarak secer
      And acilan egitimler sayfasindan fiyat araligi olarak artan fiyat olarak secer
         And ucretsiz egitimlerden herhangi birini alir
        And kimlik dogrulama islemlerini girer
      And  egitimin ucretsiz oldugunu test eder ve siparisi tamamlar.