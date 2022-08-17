package StepsDefinition;

import PageObjectModel.BrandsPage;
import PageObjectModel.SearchPage;
import Utilities.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class SearchSteps {
    WebDriver driver;

    SearchPage searchPage = new SearchPage();



    @And("^Search Box \"([^\"]*)\" yazilir$")
    public void searchBoxYazilir(String product) throws Throwable {
        searchPage.setSearchBox(product);
    }

    @And("^Product icin arama buttona tiklanir$")
    public void productIcinAramaButtonaTiklanir() {
        searchPage.setSearchButton();
    }

    @And("^Yorum sirasina gore sirala secilir$")
    public void yorumSirasinaGoreSiralaSecilir() {
        searchPage.setSelectedText();

    }

    @And("^Ucretsiz kargo secenegi secilir$")
    public void ucretsizKargoSecenegiSecilir() {
        searchPage.setUcretsizKargo();
    }



    @And("^Sepete gidilir$")
    public void sepeteGidilir() throws InterruptedException {
        searchPage.setSepeteGit();

    }


    @And("^En ucuzun adedi iki yapilir$")
    public void enUcuzunAdediIkiYapilir() throws InterruptedException {
        searchPage.setFiyatKarsilastirmaUcuzuArttirma();

    }

    @When("^Misafir kullanici olarak odeme adimina ilerlenir$")
    public void misafirKullaniciOlarakOdemeAdiminaIlerlenir() {
        searchPage.setSatinAlButonu();
    }

    @Then("^Testin basarili olduguna dair mesaj yazilir$")
    public void testinBasariliOldugunaDairMesajYazilir() {
        System.out.println("Testiniz basariyla sonuclanmistir!");
    }

    @And("^Ilk urun sepete eklenir$")
    public void ilkUrunSepeteEklenir() throws InterruptedException {
        searchPage.setIlkProduct();
    }

    @And("^Son urun sepete eklenir$")
    public void sonUrunSepeteEklenir() throws InterruptedException {
        searchPage.setSonProduct();
    }
}
