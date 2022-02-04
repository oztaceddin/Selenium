package tests.smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTesti {

    //1) smokeTest  paketi altinda yeni bir Class olustur: NegativeTest
    //3 Farkli test Methodunda 3 senaryoyu test et
    //                - yanlisSifre
    //                - yanlisKulllanici
    //                - yanlisSifreKullanici
    //test data yanlis username: manager1 , yanlis password : manager1
    //2) https://www.hotelmycamp.com adresine git
    //3) Login butonuna bas
    //4) Verilen senaryolar ile giris yapilamadigini test et

    HotelMyCampPage hotelMyCampPage;

    @Test
    public void yanlisSifreTesti(){


        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

        hotelMyCampPage=new HotelMyCampPage();

        //yanlış şifre dogru kullanıcı

        hotelMyCampPage.ilkLoginElementi.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hotelMyCampPage.loginBox.click();
        Assert.assertTrue(hotelMyCampPage.girisYapilamadi.isDisplayed());

       Driver.closeDriver();

    }

    @Test
    public void yanlisKullaniciAdiTesti(){

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage=new HotelMyCampPage();

        hotelMyCampPage.ilkLoginElementi.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));
        hotelMyCampPage.loginBox.click();
        Assert.assertTrue(hotelMyCampPage.girisYapilamadi.isDisplayed());

        Driver.closeDriver();



    }

    @Test
    public void yanlisKullaniciAdiYanlisSifreTesti(){

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        hotelMyCampPage=new HotelMyCampPage();

        hotelMyCampPage.ilkLoginElementi.click();
        hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCWrongUsername"));
        hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCWrongPassword"));
        hotelMyCampPage.loginBox.click();
        Assert.assertTrue(hotelMyCampPage.girisYapilamadi.isDisplayed());

        Driver.closeDriver();



    }











}
