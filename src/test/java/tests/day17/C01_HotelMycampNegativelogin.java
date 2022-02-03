package tests.day17;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_HotelMycampNegativelogin {




   @Test
    public void negativeTest01(){

      //1 ) Bir Class olustur : NegativeTest
       //2) Bir test method olustur NegativeLoginTest()
       //         https://www.hotelmycamp.com/ adresine git

       Driver.getDriver().get("https://www.hotelmycamp.com/");


       //        login butonuna bas

       HotelMyCampPage hotelMyCampPage=new HotelMyCampPage();

       hotelMyCampPage.ilkLoginElementi.click();


       //    test data username: manager1 ,

      hotelMyCampPage.usernameBox.sendKeys("manager1");

       //    test data password : manager1!

       hotelMyCampPage.passwordBox.sendKeys("manager1!");

       hotelMyCampPage.loginBox.click();

       //    Degerleri girildiginde sayfaya girilemedigini test et


       Assert.assertTrue(hotelMyCampPage.girisYapilamadi.isDisplayed());


       Driver.closeDriver();







   }



}
