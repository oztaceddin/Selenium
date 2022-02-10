package tests.Practice;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.P3_TutorialPage;
import utilities.ConfigReader;
import utilities.Driver;

public class P3_Tutorialtest {

//~ url'ye gidin: "http://tutorialsninja.com/demo/index.php?route=common/home"
//~ Phones & PDAs e tıklayın
//~ telefonların marka adını al
//~ tüm elemanlar için ekle düğmesine tıklayın
//~ siyah toplam eklenen sepet düğmesine tıklayın
//~ listenin isimlerini sepetten al
//~ görüntülenen listeden ve sepet listesinden isimleri karşılaştırın
//~ goruntulenen listede toplam fiyatin $583.19 oldugunu test edin


    @Test
    public void test(){
        Driver.getDriver().navigate().to(ConfigReader.getProperty("tutorialUrl"));
        P3_TutorialPage p3_tutorialPage = new P3_TutorialPage();
        //~ Phones & PDAs e tıklayın
        p3_tutorialPage.phonesPDAs.click();
        //~ telefonların marka adını al
        System.out.println("***goruntulenen isimler ***");
        for (WebElement each:p3_tutorialPage.products) {
            System.out.println(each.getText());
        }
        //~ tüm elemanlar için ekle düğmesine tıklayın
        for(WebElement each: p3_tutorialPage.addAllCart){
            each.click();
        }
        //~ siyah toplam eklenen sepet düğmesine tıklayın
        p3_tutorialPage.clickBlackButton.click();
        //~ listenin isimlerini sepetten al
        System.out.println("***sepetteki isimler ***");
        for (WebElement each: p3_tutorialPage.sepettekiUrunler) {
            System.out.println(each.getText());
        }
        //~ görüntülenen listeden ve sepet listesinden isimleri karşılaştırın
        Assert.assertEquals(p3_tutorialPage.products.toString(), p3_tutorialPage.sepettekiUrunler.toArray().toString());
        //~ goruntulenen listede toplam fiyatin $583.19 oldugunu test edin
        Assert.assertEquals(p3_tutorialPage.totalPrice.getText(), "$583.19");
    }

}
