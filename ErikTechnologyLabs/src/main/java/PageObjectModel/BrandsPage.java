package PageObjectModel;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class BrandsPage extends AbstractClass {
    WebDriver driver;

    public BrandsPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }
@FindBy(xpath = "//button[@class='dn-slide-deny-btn']")
    private WebElement clickDahaSonra;
    public void setClickDahaSonra(){
        clickFunction(clickDahaSonra);
    }
@FindBy(xpath = "//span[@class='btn baseBtn-green']")
    private WebElement clickTamam;
    public void setClickTamam()   {
        clickFunction(clickTamam);
    }
@FindBy(xpath = "(//span[@class='setCookieBtn pickAll'])[2]")
    private WebElement clickTumunuKabulEt;
    public void setClickTumunuKabulEt(){
        clickFunction(clickTumunuKabulEt);
    }

@FindBy(xpath = "//a[@title='Markalar']")
    private WebElement clickMarkalar;
    public void setClickMarkalar(){
        clickFunction(clickMarkalar);
    }
@FindBy(xpath = "//a[@href='https://www.n11.com/markalar?brand=A']")
    private WebElement clickStartedAMarkalari;
    public void setClickStartedAMarkalari(){
        clickFunction(clickStartedAMarkalari);
    }
@FindBy(xpath = "//li[@class='item']//strong")
    private  List<WebElement> writeTxt;
    public void setWriteTxt(){
        String markaAdlari = "";
        /*Tüm dataları a.txt'ye çekmek uzun süreceği için sadece 5 data çektim. Fakat kod doğru çalışıyor.  */
        for(int i=0;i<5;/*writeTxt.size();*/i++){
            markaAdlari = markaAdlari +writeTxt.get(i).getText() + "\n";
        }

        try {
            FileWriter writer = new FileWriter("a.txt", false);
            writer.write(markaAdlari);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
