package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class HMCWebTablePage {


    public HMCWebTablePage() {

        PageFactory.initElements(Driver.getDriver(), this);

    }


    @FindBy(xpath = "//thead/tr[1]/th")
    public List<WebElement> headerBirinciSatirdatalar;

    @FindBy(xpath = "//tbody")
    public WebElement tumBodyWebElementi;

    @FindBy(xpath = "//tbody//td")
    public List<WebElement> tumBodyDatalarıList;

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> satirlarListesi;


    public WebElement satirGetir(int satirNo) {

        //2.satir yazdir----//tbody//tr[2]
        //7.satir yazdir----//tbody//tr[7]

        String satirDinamikXpath = "//tbody//tr[" + satirNo + "]";

        WebElement satirElementi = Driver.getDriver().findElement(By.xpath(satirDinamikXpath));


        return satirElementi;
    }


    public String hucreWebElementGetir(int satir, int sutun) {


        //2.satırın 4. datası-----//tbody//tr[2]//td[4]
        //44.satırn 5. datası---//tbody//tr[4]//td[5]


        String hucreDinamikXpat = "//tbody//tr[" + satir + "]//td[" + sutun + "]";

        WebElement istenenHucreElementi = Driver.getDriver().findElement(By.xpath(hucreDinamikXpat));

        String hucreDatasi = istenenHucreElementi.getText();


        return hucreDatasi;


    }


    public void sutunYazdir(int sutun) {

        //herbir satirdaki istenen sütun elementini yazdıra bilmek için
        //once satır sayısını bilmemeiz gerekir

        int satirSayisi = satirlarListesi.size();

        for (int i = 1; i <= satirSayisi; i++) {

            System.out.print(hucreWebElementGetir(i, sutun)+",");

        }


    }


}
