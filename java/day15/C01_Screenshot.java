package tests.day15;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C01_Screenshot extends TestBase {


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





        //testin çalıştıgı ispatı için screenshot yapalım

        //tüm sayfa SS için 4 adım gerekli
        //1.adım takeScreenshot objesi oluşt

        TakesScreenshot tss= (TakesScreenshot) driver;

        //2.adım kaydedecegimiz dosyayıo oluşturalım

        File tumSayfaSS=new File("target/screenShot/tumsayfa.png");

        //3.adım bir dosya daha oluşturup screenshot objesi ile screenshotı alalım

        File geciciResim=tss.getScreenshotAs(OutputType.FILE);

        //4.adım gecici resmi kaydetmek istediğimiz asil dosyaya copy yapalım

        FileUtils.copyFile(geciciResim,tumSayfaSS);






        Thread.sleep(5000);
    }


}
