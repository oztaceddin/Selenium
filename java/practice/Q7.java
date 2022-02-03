package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

public class Q7 extends TestBase {


    /*
     // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
     // 2. CLICK ME of JavaScript Alert e tıklayın
     // 3. pop up text i alın
     // 4. Mesajın "I am an alert box!"  olduğunu doğrulayın.
     // 5. pop up i kabul edin

     // Yine ayni class da baska test methodu olusturun
     // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
     // 2.  CLICK ME of JavaScript Confirm Box i  TIKLAYIN
     // 3.  pop up text i alın
     // 4. Mesajın "Press a button!" olduğunu doğrulayın
     // 5. Açılır pencereyi kapat
     // 6. pop up i iptal edin,
     // 7. "You pressed Cancel!" yazisinin goruntulendigini dogrulayin
     // 8. alert1'e göre dependsOnMethods kullanın
 */

    @Test
    public void alert1Testi() throws InterruptedException {

        // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin

        driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");

        // 2. CLICK ME of JavaScript Alert e tıklayın
        driver.findElement(By.id("button1")).click();

        // 3. pop up text i alın
        String popText=driver.switchTo().alert().getText();

        // 4. Mesajın "I am an alert box!"  olduğunu doğrulayın.
        SoftAssert softAssert=new SoftAssert();

        softAssert.assertEquals(popText,"I am an alert box!");

        // 5. pop up i kabul edin
        driver.switchTo().alert().accept();

        Thread.sleep(3000);

        softAssert.assertAll();
    }


@Test(dependsOnMethods ="alert1Testi")
    public void alert2(){


    // Yine ayni class da baska test methodu olusturun
    // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin


    driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");


    // 2.  CLICK ME of JavaScript Confirm Box i  TIKLAYIN

    driver.findElement(By.xpath("//span[@id='button4']")).click();

    // 3.  pop up text i alın


    String alerttext=driver.switchTo().alert().getText();

    // 4. Mesajın "Press a button!" olduğunu doğrulayın

    String expMessage="Press a button!";

    SoftAssert softAssert=new SoftAssert();

    softAssert.assertTrue(alerttext.equals(expMessage));


    // 5. Açılır pencereyi kapat
    // 6. pop up i iptal edin,

    driver.switchTo().alert().dismiss();

    //p[text()='You pressed Cancel!']

    // 7. "You pressed Cancel!" yazisinin goruntulendigini dogrulayin

    softAssert.assertTrue(driver.findElement(By.xpath("//p[@id='confirm-alert-text']")).isDisplayed());




    // 8. alert1'e göre dependsOnMethods kullanın



    softAssert.assertAll();

}





/*
Alert alert = driver.switchTo().alert();  //bu sekilde de kullanimi mevcuttur
driver.switchTo().alert();     yerine    Alert data turundeki alert variable ini kullandik.
alert variable ile methodlara ulasilabilir
    alert.dismiss();
    alert.accept();  vb
    bu kullanim sayesinde switchto() yazmamiza gerek kalmaz
 */










}
