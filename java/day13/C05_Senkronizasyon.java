package tests.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C05_Senkronizasyon extends TestBase {


    @Test
    public void test01() throws InterruptedException {

/*
    driver.get("https://the-internet.herokuapp.com/upload");
    driver.findElement(By.id("file-submit")).click();
  */
/*
    driver.get("https://youtube.com");
    driver.findElement(By.xpath("//input[@id='search']")).sendKeys("araba"+ Keys.ENTER);
    */
    /*
    driver.get("https://www.techproeducation.com");
    driver.findElement(By.xpath("(//a[text()='info@techproeducation.com'])[2]")).click();
        */

        //https://the-internet.herokuapp.com/dynamic_controls
        //sayfasına git enable butonuna bas
        //enable yazısının çıktıgını test et

        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.findElement(By.xpath("//button[text()='Enable']")).click();


        WebElement enableYazisielementi = driver.findElement(By.xpath("//p[@id='message']"));

        Assert.assertTrue(enableYazisielementi.isDisplayed());


        //implicitlyWait  bazı sorularda bunu yapmalıyız çünkü sayfanın yüklenmesi için belirli bir zaman ihtiyaç vardır
        //ihtiyaç olan zamanı vermez isek işlem yapamadan sayfa kapanır ve hata alırız


        Thread.sleep(5000);


    }


}
