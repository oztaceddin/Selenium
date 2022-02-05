package tests.day19;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

public class C01_WebtabledinamikLocate {

    //   3.test methodu oluşturalım
    //1.method satir numarasi verdiğinde bana o satırdaki dataları yazdırsın
    //2.method satir no ve dat numarası girdiğimde verdiğim datayı yazdırsın
    //3.sutun numarası verildiğinde bana tum sutunu yazdırsın

    HMCWebTablePage hmcWebTablePage;
    HotelMyCampPage hotelMyCampPage;


    @Test
    public void satirYazdirTesti() {

        //1.method satir numarasi verdiğinde bana o satırdaki dataları yazdırsın
        //2.satir yazdir----//tbody//tr[2]
        //7.satir yazdir----//tbody//tr[7]
        hotelMyCampPage = new HotelMyCampPage();

        hmcWebTablePage = new HMCWebTablePage();

        hotelMyCampPage.girisYap();

        WebElement ucuncuSatirElementi = hmcWebTablePage.satirGetir(4);

        System.out.println(ucuncuSatirElementi.getText());


        Driver.closeDriver();


    }


    @Test
    public void hucregetirTesti() {

        hotelMyCampPage = new HotelMyCampPage();

        hmcWebTablePage = new HMCWebTablePage();

        hotelMyCampPage.girisYap();


        //2.method satir no ve dat numarası girdiğimde verdiğim datayı yazdırsın

        //2.satırın 4. datası-----//tbody//tr[2]//td[4]
        //44.satırn 5. datası---//tbody//tr[4]//td[5]


        System.out.println("girdiğiniz hücredeki element :" + hmcWebTablePage.hucreWebElementGetir(5, 3));


        Driver.closeDriver();


    }


    @Test
    public void SutunYazdirTesti() {
        hotelMyCampPage = new HotelMyCampPage();

        hmcWebTablePage = new HMCWebTablePage();

        hotelMyCampPage.girisYap();

        //3.sutun numarası verildiğinde bana tum sutunu yazdırsın


        hmcWebTablePage.sutunYazdir(4);


        Driver.closeDriver();
    }


}
