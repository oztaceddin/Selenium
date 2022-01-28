package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.Set;

public class C03_MouseActions1 extends TestBase {



    @Test
    public void test01(){


        //1- Yeni bir class olusturalim: MouseActions1
        //2- https://the-internet.herokuapp.com/context_menu sitesine gidelim

       driver.get(" https://the-internet.herokuapp.com/context_menu");


        //3- Cizili alan uzerinde sag click yapalim

        Actions actions=new Actions(driver);//maus işlemleri için bu objeyi oluşturuyoruz


        WebElement boxElementi=driver.findElement(By.id("hot-spot"));

        actions.contextClick(boxElementi).perform();//mausun sağ tıklama işi








        //4- Alert’te cikan yazinin “You selected a context menu” oldugunu
        //    test edelim.

       String expectedyazi="You selected a context menu";
       String actualYazi=driver.switchTo().alert().getText();

        Assert.assertEquals(actualYazi,expectedyazi);



        //5- Tamam diyerek alert’I kapatalim

       driver.switchTo().alert().accept();



        //6- Elemental Selenium linkine tiklayalim

        String ilkSayfaHanleDegeri=driver.getWindowHandle();
        //ilk sayfanın handle değerini alıyoruz yeni sayfaya geçmeden


        driver.findElement(By.xpath("//a[text()='Elemental Selenium']")).click();



        //7- Acilan sayfada h1 taginda “Elemental Selenium” yazdigini test edelim


        String ikinciSayfaHandleDegeri="";
        Set<String> handleSeti=driver.getWindowHandles();

        for (String each:handleSeti
             ) {
            if (!each.equals(ilkSayfaHanleDegeri)){
                ikinciSayfaHandleDegeri=each;
            }
        }



        driver.switchTo().window(ikinciSayfaHandleDegeri);

        WebElement ikinciSayfaYaziElementi=driver.findElement(By.tagName("h1"));
        String actualIkıncisayfaYazi=ikinciSayfaYaziElementi.getText();
        String expectedIkınciSayfaYazisi="Elemental Selenium";

        Assert.assertTrue(actualIkıncisayfaYazi.equals(expectedIkınciSayfaYazisi));

        //veya

        Assert.assertEquals(actualIkıncisayfaYazi,expectedIkınciSayfaYazisi);






    }


}
