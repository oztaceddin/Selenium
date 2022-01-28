package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C02_MouseActions extends TestBase {



    @Test
    public void test01() throws InterruptedException {

        // amazon anasayfaya gidin

        driver.get("https://www.amazon.com");



        // sag ustte hello,signIn elementinin uzerinde mouse'u bekletin


        Actions actions=new Actions(driver);//mause fonksiyonları için obje oluşturuyoruz

        WebElement helloElementi=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));

        actions.moveToElement(helloElementi).perform();

        WebElement listElementi= driver.findElement(By.xpath("//span[text()='Create a List']"));

        actions.click(listElementi).perform();






        // acilan menude new list linkine tiklayin
        // ve new list sayfasinin acildigini test edin

        String actualTitle=driver.getTitle();
        String arananKelime="Your List";

        Assert.assertTrue(actualTitle.equals(arananKelime));


        Thread.sleep(4000);


    }



}
