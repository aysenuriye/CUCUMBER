package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
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
QdPage qdPage=new QdPage();



    @Given("Kullanici Udemy sayfasina gider")
    public void kullaniciUdemySayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("udemyUrl"));
    }



    @And("Giris bilgilerini girer ve basarili sekilde giris yaptigini test eder")
    public void girisBilgileriniGirerVeBasariliSekildeGirisYaptiginiTestEder() {
        loginPage.loginEmailBox.sendKeys(ConfigReader.getProperty("email"));
        loginPage.loginPasswordBox.sendKeys(ConfigReader.getProperty("password"));
        loginPage.submitButton.click();
    }

    @Then("ilk login linkine tiklar")
    public void ilk_login_linkine_tiklar() {
        qdPage.ilkLoginLinki.click();
    }
    @Then("username olarak {string} girer")
    public void username_olarak_girer(String username) {
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty(username));
    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String password) {
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty(password));
    }
    @Then("login butonuna basar")
    public void login_butonuna_basar() {
        qdPage.loginButonu.click();
    }
    @Then("giris yapilamadigini test eder")
    public void giris_yapilamadigini_test_eder() {
        Assert.assertTrue(qdPage.emailKutusu.isEnabled());
    }

    @Then("basarili olarak giris yapildigini test eder")
    public void basariliOlarakGirisYapildiginiTestEder() {

        Assert.assertTrue(qdPage.basariliGirisElementi.isDisplayed());
    }

    @And("username olarak examples dan {string} girer")
    public void usernameOlarakExamplesDanGirer(String username) {
        qdPage.emailKutusu.sendKeys(username);
    }

    @And("password olarak examples dan {string} girer")
    public void passwordOlarakExamplesDanGirer(String password) {
        qdPage.passwordKutusu.sendKeys(password);
    }
}
