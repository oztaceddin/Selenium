package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageIlkClass {


    //amazona gidelim

    //arama kutusuna nutella yazıp aratalım

    //arama sonuçlarının nutella içerdiğini test edelim

    @Test
    public void test01(){

        //pom da farklı class lar farklı şekilde ulaşılması benimsenmiştir
        //Driver classı için static yöntemi kullanıyoryz
        //page classları için obje üzerinden kullanılması tercih edilmiştir


        //amazona gidelim

        Driver.getDriver().get("https://www.amazon.com");

        //arama kutusuna nutella yazıp aratalım

        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);




        //arama sonuçlarının nutella içerdiğini test edelim

        String actualSonucstr=amazonPage.sonucYazisiElementi.getText();

        Assert.assertTrue(actualSonucstr.contains("Nutella"));

  Driver.closeDriver();

    }

@Test
    public void test02(){

        //amazona gidelim

    Driver.getDriver().get("https://www.amazon.com");

    //java için arama yapalım

    AmazonPage amazonPage=new AmazonPage();
    amazonPage.amazonAramaKutusu.sendKeys("java"+Keys.ENTER);

    //sonıcda java içerdiğini test edlim

    String sonucyazisiStr=amazonPage.sonucYazisiElementi.getText();

    Assert.assertTrue(sonucyazisiStr.contains("java"));


 Driver.closeDriver();
}




}
