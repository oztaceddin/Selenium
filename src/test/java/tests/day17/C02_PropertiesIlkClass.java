package tests.day17;

import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_PropertiesIlkClass {



    @Test
    public void pozitiveloginTesti(){




        //https://www. hotelmycamp.com/ adresine git

        //Driver.getDriver().get("buraya properties dosyasına git HMCURL e karşılık gelen değeri yaz");

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));




        //        login butonuna bas

        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();

        hotelMyCampPage.ilkLoginElementi.click();

        //    test data username: manager ,

       hotelMyCampPage.usernameBox.sendKeys(ConfigReader.getProperty("HMCValidUsername"));


        //    test data password : Manager1!

       hotelMyCampPage.passwordBox.sendKeys(ConfigReader.getProperty("HMCValidPassword"));


        //    Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et

       hotelMyCampPage.loginBox.click();










    }








}
