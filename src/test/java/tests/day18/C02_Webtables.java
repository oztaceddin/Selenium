package tests.day18;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HMCWebTablePage;
import pages.HotelMyCampPage;
import utilities.Driver;

import java.util.List;

public class C02_Webtables {


    HMCWebTablePage hmcWebTablePage;
    HotelMyCampPage hotelMyCampPage;

    @Test(priority = 1)
    public void loginT() {

        //● Bir class oluşturun : C02_WebTables
        //● login( ) metodun oluşturun ve oturum açın.
        //● https://www.hotelmycamp.com admin/HotelRoomAdmin adresine gidin
        //            ○ Username : manager
        //            ○ Password : Manager1!

        hotelMyCampPage = new HotelMyCampPage();
        hotelMyCampPage.girisYap();

        hotelMyCampPage.bekle(2);

    }


    @Test(priority = 2)
    public void table() {


        //● table( ) metodu oluşturun
        //            ○ Tüm table body’sinin boyutunu(sutun sayisi) bulun. /tbody


        //header kısmında birinci satır ve altındaki dataları locate edelim
        ////thead//tr[1]//th

        hmcWebTablePage = new HMCWebTablePage();

        List<WebElement> headerdataList = hmcWebTablePage.headerBirinciSatirdatalar;

        System.out.println("tablodaki sütün sayısı : " + headerdataList.size());


        //○ Table’daki tum body’I ve başlıkları(headers) konsolda yazdırın.

        System.out.println(hmcWebTablePage.tumBodyWebElementi.getText());

        //eger body i tek bir webelemnt olarak locate edersek içindeki tüm datalara
        //getText ile yazdıra biliriz
        //ancak budurumda bu elemntler ayrı ayrı degil body nin içindeki tek bir stringin parçaları olurlar
        //dolayısıyla bu elementlere tek tek ulaşmamız mümkün olmaz
        //sadece contains meyhodu ile body de olup olmadıgını test edebiliriz



        //eger her bir datayı ayrı ayrı almak istersek
        // //tbody//td şeklinde locate edip bir list te atabiliriz

        List<WebElement> bodyTumDataList=hmcWebTablePage.tumBodyDatalarıList;

        System.out.println("bodydeki data sayisi :"+bodyTumDataList.size());



    }


    @Test(priority = 3)
    public void printRows() {

        //● printRows( ) metodu oluşturun //tr
      //  hmcWebTablePage=new HMCWebTablePage();

        //            ○ table body’sinde bulunan toplam satir(row) sayısını bulun.
        //            ○ Table body’sinde bulunan satirlari(rows) konsolda yazdırın.
        //            ○ 4.satirdaki(row) elementleri konsolda yazdırın.


        Driver.closeDriver();


    }


}
