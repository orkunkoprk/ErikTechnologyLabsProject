package PageObjectModel;

import Utilities.Driver;
import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchPage extends AbstractClass{
    WebDriver driver;

    public SearchPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
@FindBy(id = "searchData")
    private WebElement searchBox;
    public void setSearchBox(String product){
        sendKeysFuction(searchBox,product);
    }
@FindBy(xpath = "//a[@class='searchBtn']")
    private WebElement searchButton;
    public void setSearchButton(){
        clickFunction(searchButton);
    }
@FindBy(xpath = "//span[@class='selectedText']")
    private WebElement selectedText;
@FindBy (xpath = "//div[text()=' Yorum sayısı']")
    private WebElement selects;
    public void setSelectedText(){
        clickFunction(selectedText);
        clickFunction(selects);
    }
@FindBy(xpath = "//span[text()='Ücretsiz Kargo']")
    private WebElement ucretsizKargo;
    public void setUcretsizKargo(){
        clickFunction(ucretsizKargo);
    }
@FindBy(xpath = "(//img[@class='lazy cardImage'])[1]")
    private WebElement ilkProduct;
@FindBy(xpath = "(//button[@class='addBasketUnify'])[1]")
    private WebElement sepeteEkle;

    public void setIlkProduct() throws InterruptedException {
        clickFunction(ilkProduct);
        clickFunction(sepeteEkle);
        Thread.sleep(1000);
        driver.navigate().back();
    }
@FindBy(xpath = "(//img[@class='lazy cardImage'])[33]")
    private WebElement sonProduct;
    public void setSonProduct() throws InterruptedException {
        clickFunction(sonProduct);
        clickFunction(sepeteEkle);
    }
@FindBy(xpath = "//a[@class='btn btnBlack btnGoBasket']")
    private WebElement sepeteGit;
@FindBy(xpath = "//span[text()='Tamam']")
    private WebElement clickOnay;
    public void setSepeteGit() throws InterruptedException {
        Thread.sleep(4000);
        clickFunction(sepeteGit);
        clickFunction(clickOnay);
    }
@FindBy(xpath = "//div[@class='prodPrice__text']//input")
    private List<WebElement> fiyatKarsilastirma;
@FindBy(xpath = "//span[@class='spinnerUp spinnerArrow']")
    private List<WebElement> UcuzuArttirma;
    public void setFiyatKarsilastirmaUcuzuArttirma() throws InterruptedException {
        float sepettekiIlk=Float.parseFloat(fiyatKarsilastirma.get(0).getAttribute("value").replace(',','.'));
        Thread.sleep(500);
        float sepettekiSon=Float.parseFloat(fiyatKarsilastirma.get(1).getAttribute("value").replace(',','.'));
        Thread.sleep(500);
        if(sepettekiIlk<sepettekiSon){
            clickFunction(UcuzuArttirma.get(0));
        }
        Thread.sleep(500);
        if (sepettekiSon<sepettekiIlk){
            clickFunction(UcuzuArttirma.get(1));
        }

    }
@FindBy(xpath = "(//span[@id='js-buyBtn'])[2]")
    private WebElement satinAlButonu;
@FindBy(xpath = "//a[@class='btn-continue']")
    private WebElement uyeOlmadanDevam;
    public void setSatinAlButonu(){
        clickFunction(satinAlButonu);
        clickFunction(uyeOlmadanDevam);
    }

}
