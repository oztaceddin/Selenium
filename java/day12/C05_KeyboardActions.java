package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C05_KeyboardActions extends TestBase {



    @Test
    public void test01() throws InterruptedException {

        //Yeni bir class olusturalim: D15_MouseActions4
        //1- https://www.facebook.com adresine gidelim
        driver.get("https://www.facebook.com");
        //2- Yeni hesap olustur butonuna basalim
        driver.findElement(By.xpath("//a[.='Yeni Hesap Oluştur']")).click();
        //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim
        WebElement ad = driver.findElement(By.xpath("//input[@name='firstname']"));
        Actions actions = new Actions(driver);
        actions.click(ad).
                sendKeys("tc").
                sendKeys(Keys.TAB).
                sendKeys("öz").
                sendKeys(Keys.TAB).
                sendKeys("dfdgxdb").
                sendKeys(Keys.TAB).
                sendKeys("gchjcghkv").
                sendKeys(Keys.TAB).
                sendKeys("jhvjgövömv").
                perform();
        //4- Kaydol tusuna basalim
        WebElement kaydolButonElementi = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
        actions.click(kaydolButonElementi).perform();
        Thread.sleep(5000);
    }
}
