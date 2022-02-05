package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoqaPage {


    public DemoqaPage() {

        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(xpath = "//div[@class='rt-tr']")
    public WebElement baslikSatiriElementi;

    @FindBy(xpath = "//div[@class='rt-th rt-resizable-header -cursor-pointer']")
    public List<WebElement> basliklarWebElementiListesi;

    @FindBy(xpath = "//div[@class='rt-tbody']")
    public WebElement bodyTekWebelement;

    @FindBy(xpath = "//div[@class='rt-td']")
    public List<WebElement> tumDataWebelementList;

    @FindBy(xpath = "//div[@class='rt-tr-group']")
    public List<WebElement> tumSatirlarWebElementList;


    public void sutunYazdir(int sutun) {
        //((//div[@class='rt-tr-group'])[3]//div[@class='rt-td'])[4]

        int satirsayisi = tumSatirlarWebElementList.size();

        String dinamikXpath;

        WebElement geciciElement;

        System.out.println(basliklarWebElementiListesi.get(sutun-1).getText());

        for (int i = 1; i <= satirsayisi; i++) {
            dinamikXpath = "((//div[@class='rt-tr-group'])[" + i + "]//div[@class='rt-td'])[" + sutun + "]";
            geciciElement = Driver.getDriver().findElement(By.xpath(dinamikXpath));
            System.out.println(geciciElement.getText());

        }

    }


    public void ismeGoreMaasYazdir(String isim) {

        int satirsayisi = tumSatirlarWebElementList.size();

        String dinamikXpath;
        String satırdakiIsim;
        String Salary;

        for (int i=1; i<satirsayisi;i++){

            dinamikXpath = "((//div[@class='rt-tr-group'])[" + i + "]//div[@class='rt-td'])[" + 1+ "]";
            satırdakiIsim=Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();
            Salary=Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText();


            if (satırdakiIsim.equals(isim)){
                System.out.println(Salary);

            }




        }


    }


    public void hucreYazdir(int satir, int sutun) {

        String dinamikXpath="((//div[@class='rt-tr-group'])[" + satir+ "]//div[@class='rt-td'])[" + sutun+ "]";

        System.out.println(Driver.getDriver().findElement(By.xpath(dinamikXpath)).getText());


    }
}
