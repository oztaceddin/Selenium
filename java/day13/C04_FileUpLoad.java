package tests.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C04_FileUpLoad extends TestBase {




    @Test
    public void test01() throws InterruptedException {

        //Tests packagenin altina bir class oluşturun : C05_UploadFile
        //https://the-internet.herokuapp.com/upload adresine gidelim

        driver.get("https://the-internet.herokuapp.com/upload");


        //chooseFile butonuna basalim

        //Yuklemek istediginiz dosyayi secelim.
        //1file seçme butonunu locate edelim

        WebElement fileSecButonu=driver.findElement(By.id("file-upload"));

        //2-yüklemek istediğimiz dosyanın path ni hazırlayalım

        String dosyaYolu=System.getProperty("user.home")+"\\Desktop\\deneme\\selenium.pptx";

       //3- sendkeys() methodu ile  dinamik path i dosya seç butonuna yollayalım

        fileSecButonu.sendKeys(dosyaYolu);




        //Upload butonuna basalim.

        driver.findElement(By.id("file-submit")).click();




        //“File Uploaded!” textinin goruntulendigini test edelim

        WebElement sonucYaziElementi=driver.findElement(By.tagName("h3"));

        Assert.assertTrue(sonucYaziElementi.isDisplayed());



        Thread.sleep(7000);







    }



}
