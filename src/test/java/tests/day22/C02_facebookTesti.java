package tests.day22;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Facebookpage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C02_facebookTesti extends TestBaseRapor {

    @Test
    public void test01() throws InterruptedException {

        extentTest=extentReports.createTest("facebook","fake isim ile girilemediği test edildi");

        // 1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");

        extentTest.info("facebook sayfasına gidildi");

        Facebookpage facebookpage=new Facebookpage();



        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin

        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker=new Faker();
        facebookpage.emailKutusu.sendKeys(faker.internet().emailAddress());
        facebookpage.passKutusu.sendKeys(faker.internet().password());
        facebookpage.loginButonu.click();

        extentTest.info("facebook giriş bilgileri faker ile dolduruldı");

        //4- Basarili giris yapilamadigini test edin

        Assert.assertTrue(facebookpage.girilemediYazisiElemnti.isDisplayed());

        extentTest.pass("girilemediği test edildi");

        ReusableMethods.waitFor(2);
    }
}
