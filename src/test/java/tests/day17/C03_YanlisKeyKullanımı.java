package tests.day17;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_YanlisKeyKullanımı {



@Test
    public void  test01(){


    Driver.getDriver().get(ConfigReader.getProperty("HMCUrl"));

    //Driver.getDriver().get(ConfigReader.getProperty("HMCUrlrr"));

     //HMCUrl yerine  HMCUrlr  yazarsak yanı hatalı giriş olursa
    //eger KEY olarak girdiğimiz string configuration.properties dosyasında yoksa
    //configreader.gerproperty methodu () o key bulamaz ve
    //nullpointer exception fırlatır




}

}
