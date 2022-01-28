package tests.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C06_FacebookKayit  extends TestBase {



@Test
    public void test(){

    //Yeni bir class olusturalim: D15_MouseActions4
    //1- https://www.facebook.com adresine gidelim

   driver.get("https://www.facebook.com");


    //2- Yeni hesap olustur butonuna basalim

    driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();





    //3- Ad, soyad, mail ve sifre kutularina deger yazalim ve kaydol tusuna basalim

    Actions actions=new Actions(driver);

    WebElement isimelementi=driver.findElement(By.xpath("//input[@name='firstname']"));

    actions.click(isimelementi).
            keyDown(Keys.TAB).
            sendKeys("taceddin").
            keyUp(Keys.TAB).
            keyDown(Keys.TAB).
            sendKeys("öz").
            keyUp(Keys.TAB).
            keyDown(Keys.TAB).
            sendKeys("544641566").
            keyUp(Keys.TAB).
            keyDown(Keys.TAB).keyUp(Keys.TAB).sendKeys("1234"+Keys.ENTER).perform();




    //4- Kaydol tusuna basalim




}




}
