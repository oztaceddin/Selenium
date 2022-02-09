package tests.day22;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class C01_TestNGreports  extends TestBaseRapor {


    @Test
    public void windowHanleReusableTest() throws IOException {



        extentTest =extentReports.createTest("window handle","title ile 2. sayfaya geçiş yapıldıgı test edildi");



        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");

        extentTest.info("herokuapp sayfasına gidildi");


        Driver.getDriver().findElement(By.linkText("Click Here")).click();

        extentTest.info("yeni window linkine tıklandı");

        ReusableMethods.switchToWindow("New Window");

        extentTest.info("resusable method kullanılarak açılan 2. sayfaya geçildi");


        String expectedTitle="New Window";

        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);

        extentTest.info("titlenin beklenen deger ile  aynı oldugu test edildi");



    }


}
