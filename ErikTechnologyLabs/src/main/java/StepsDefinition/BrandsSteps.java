package StepsDefinition;

import PageObjectModel.BrandsPage;
import Utilities.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;

public class BrandsSteps {
    WebDriver driver;

    BrandsPage brandsPage = new BrandsPage();
    @Given("^Websiteye gidilir$")
    public void go_to_Website() throws Throwable {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://www.n11.com/");
    }

    @Given("^Onaylama butonlarını kabul et$")
    public void confirmation_buttons_click() throws Throwable {
        brandsPage.setClickDahaSonra();
        brandsPage.setClickTamam();
        brandsPage.setClickTumunuKabulEt();
    }

    @Given("^Markalar butonuna tikla$")
    public void brands_button_click() throws Throwable {
        brandsPage.setClickMarkalar();
    }

    @Given("^Markaları gor butonuna tiklanir$")
    public void see_brands_button_click() throws Throwable {
        brandsPage.setWriteTxt();

    }


    @Given("^A harfi ile baslayan markalari sec$")
    public void select_a() throws Throwable {
        brandsPage.setClickStartedAMarkalari();
    }

    @When("^A harfindeki markalari txt dosyasina yazdir$")
    public void write_a_started_brands_at_txt() throws Throwable {
        brandsPage.setWriteTxt();

    }









}
