package tests.day27;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProviderNegativeLoginTest {


    @DataProvider
    public static Object[][] wronguserList() {


        String liste[][]={{"manager11","manager11"},{"manager12","manager12"},{"manager13","manager13"}};



        return liste;
    }

    @Test(dataProvider = "wronguserList")
    public void yanlisKullaniciAdiYanlisSifreTesti(String wrongUsername,String wrongPassword){

        Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));
        HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();

        hotelMyCampPage.ilkLoginElementi.click();
        hotelMyCampPage.usernameBox.sendKeys(wrongUsername);
        hotelMyCampPage.passwordBox.sendKeys(wrongPassword);
        hotelMyCampPage.loginBox.click();
        Assert.assertTrue(hotelMyCampPage.girisYapilamadi.isDisplayed());

        Driver.closeDriver();



    }
}
