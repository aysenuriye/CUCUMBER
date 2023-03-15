
  //    // Kullanici https://www.iienstitu.com/en sayfasina gider
// Login butonuna tiklar
// Giris bilgilerini girer ve basarili sekilde giris yaptigini test eder
// headers da bulunan egitimler kismina tiklar
// acilan egitimler sayfasindan fiyat araligi olarak artan fiyat olarak secer
// ucretsiz egitimlerden herhangi birini alir
// kimlik dogrulama islemlerini girer
// egitimin ucretsiz oldugunu test eder ve siparisi tamamlar.
@ss
Feature: kullanıcı udemy sayfasına gider

  Scenario: kullanıcı test yapar
    Then Kullanici Udemy sayfasina gider
      Then  loginButtonHomePage tikla
  And Giris bilgilerini girer ve basarili sekilde giris yaptigini test eder
  And  headers da bulunan egitimler kismina tiklar
  And  acilan egitimler sayfasindan fiyat araligi olarak artan fiyat olarak secer
  And  ucretsiz egitimlerden herhangi birini alir
  And  kimlik dogrulama islemlerini girer
  And  egitimin ucretsiz oldugunu test eder ve siparisi tamamlar.
