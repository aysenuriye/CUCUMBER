package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;

public class UdemyStepDefinions {

KimlikDogrulama kimlikDogrulama=new KimlikDogrulama();
LoginPage loginPage=new LoginPage();
MyPage myPage=new MyPage();
OnlineEgitimlerPage onlineEgitimlerPage=new OnlineEgitimlerPage();
OrtakAdimlar ortakAdimlar=new OrtakAdimlar();
UdemyHomePage udemyHomePage=new UdemyHomePage();



    @Given("Kullanici Udemy sayfasina gider")
    public void kullaniciUdemySayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("udemyUrl"));
    }

    @Then("loginButtonHomePage tiklar")
    public void loginbuttonhomepageTiklar() {
       udemyHomePage.loginButtonHomePage.click();
    }

    @And("Giris bilgilerini girer ve basarili sekilde giris yaptigini test eder")
    public void girisBilgileriniGirerVeBasariliSekildeGirisYaptiginiTestEder() {
        loginPage.loginEmailBox.sendKeys(ConfigReader.getProperty("email"));
        loginPage.loginPasswordBox.sendKeys(ConfigReader.getProperty("password"));
        loginPage.submitButton.click();
    }
}
