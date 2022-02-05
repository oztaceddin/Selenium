package tests.day19;

import org.testng.annotations.Test;
import pages.DemoqaPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_WebTableDemoQa {

    //Bir Class olusturun D19_WebtablesHomework


    @Test
    public void demoqaTest() {

        DemoqaPage demoqaPage = new DemoqaPage();

        //  1. “https://demoqa.com/webtables” sayfasina gidin

        Driver.getDriver().get(ConfigReader.getProperty("DemoqaUrl"));

        //  2. Headers da bulunan department isimlerini yazdirin

        //--- normalde //thead//th olurdu ancak  bu tablo class isimleri ile organize edilmiş

        System.out.println("başlık satırı elemnti" + demoqaPage.baslikSatiriElementi.getText());

        //2.yöntem olarak başlıkları bir listeye koyabiliriz
        //basliklarWebElementiListesi


        //  3. sutunun basligini yazdirin

        System.out.println("3.sutun başlıgı :" + demoqaPage.basliklarWebElementiListesi.get(2).getText());


        //  4. Tablodaki tum datalari yazdirin

        System.out.println("======tum body=========");

        System.out.println(demoqaPage.bodyTekWebelement.getText());


        //  5. Tabloda kac cell (data) oldugunu yazdirin

        System.out.println("tablodaki tüm data sayısı :" + demoqaPage.tumDataWebelementList.size());

        //  6. Tablodaki satir sayisini yazdirin

        System.out.println("tablodaki tüm satır sayısı :" + demoqaPage.tumSatirlarWebElementList.size());


        //  7. Tablodaki sutun sayisini yazdirin
        //farklı yollardan hesaplana bilinir biz hücre/satir sayısı yapabiliriz

        System.out.println("tablodaki sütün sayısı :" + ((demoqaPage.tumDataWebelementList.size()) / (demoqaPage.tumSatirlarWebElementList.size())));


        //  8. Tablodaki 3.kolonu yazdirin
        System.out.println("");

        demoqaPage.sutunYazdir(2);

        //  9. Tabloda "First Name" i Kierra olan kisinin Salary'sini yazdirin

        demoqaPage.ismeGoreMaasYazdir("Kierra");


        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin

        demoqaPage.hucreYazdir(2,3);


        Driver.closeDriver();

    }












}
