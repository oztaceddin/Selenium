package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class AmazonPage {

//bir page class ı açtıgımızda ilk yapmamız gereken şey
    //parametresiz constructor oluşturup
    //bu const içine pageFactory ile driver a ilk deger ataması yapmak olmalıdır

   public AmazonPage (){

        PageFactory.initElements(Driver.getDriver(),this);


    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement amazonAramaKutusu;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']")
    public WebElement sonucYazisiElementi;








}
