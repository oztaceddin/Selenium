package tests.day14;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C04_Screenshot extends TestBase {




   @Test
   public void screenTest() throws IOException {

       driver.get("https://google.com");



       //screenshat almak için
       //1-obje oluşturalım ve driver imizi atayalım deger olarak driveri kabul etmesi için casting yapmamız lazim


       TakesScreenshot tss=(TakesScreenshot) driver;


       //2---tüm sayfanın screenshat ını almak için bir file oluşturalım ve
       //dosua yolunu belirtelim

        File tumSayfaSs=new File("src\\tumSayfa.png");


       //3--oluşturdugumuz file ile takescreenshot objesini ilişkilendirelim

       tumSayfaSs=tss.getScreenshotAs(OutputType.FILE);


       //eger spesifik bir webelementin screenshot ini almak istiyorsak



       FileHandler.copy(tumSayfaSs, new File("src\\tumSayfa.png"));





   }



}
