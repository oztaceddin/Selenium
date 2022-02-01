package tests.day15;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C02_ScreenShotWEbElementi extends TestBase {




    @Test
    public void screenshotNutellaTesti() throws InterruptedException, IOException {


        //amazon anasayfaya gidelim

        driver.get("https://www.amazon.com");

        //nutella için arama yapalım


        WebElement aramaKutusu=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        //sonuçların nutella içerdiğini test edelim

        WebElement sonucelementi=driver.findElement(By.xpath("//div[@class='sg-col-inner']"));
        String sonucYazisiStr=sonucelementi.getText();

        Assert.assertTrue(sonucYazisiStr.contains("Nutella"));


        //testin çalıştıgının ispetı için sonuçyazısı elementinin screenshot ını yapalım


        //1.adım screenshot çekecegiöiz webelemnti locate edelim

        //2.adım screenshot ı kaydedecegimiz bir file oluşturalım

        File webElemntiSS=new File("target/screenShot/webElemt.jpeg");



        //3.adım

        File geciciresim=sonucelementi.getScreenshotAs(OutputType.FILE);


         //4.adım gecici resmi kayıt edecegimiz asıl dosyayı ekleyelim



        FileUtils.copyFile(geciciresim,webElemntiSS);





        Thread.sleep(5000);
    }





}
