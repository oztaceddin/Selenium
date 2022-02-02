package tests.day16;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.Facebookpage;
import utilities.Driver;

public class C03_FacebookLogin {


    @Test
    public void test01() throws InterruptedException {
        // 1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");
        Facebookpage facebookpage=new Facebookpage();

        //2- POM’a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin

        //3- Faker class’ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker=new Faker();
        facebookpage.emailKutusu.sendKeys(faker.internet().emailAddress());
        facebookpage.passKutusu.sendKeys(faker.internet().password());
        facebookpage.loginButonu.click();

        //4- Basarili giris yapilamadigini test edin

        Assert.assertTrue(facebookpage.girilemediYazisiElemnti.isDisplayed());

        Thread.sleep(5000);
        Driver.closeDriver();
    }


}
