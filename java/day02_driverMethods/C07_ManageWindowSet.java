package day02_driverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_ManageWindowSet {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        //1. Yeni bir Class olusturalim.C07_ManageWindowSet
        //2. Amazon soyfasina gidelim. https://www.amazon.com/

        driver.navigate().to("https://www.amazon.com");

        //3. Sayfanin konumunu ve boyutlarini yazdirin

        System.out.println("sayfanın poz." + driver.manage().window().getPosition());
        System.out.println("sayfanın boyutları" + driver.manage().window().getSize());


        //4. Sayfanin konumunu ve boyutunu istediginiz sekilde ayarlayin

        driver.manage().window().setPosition(new Point(9, 9));
        driver.manage().window().setSize(new Dimension(1051, 806));


        //5. Sayfanin sizin istediginiz konum ve boyuta geldigini test edin

        int xPozisyonu = driver.manage().window().getPosition().getX();
        int yPozisyonu = driver.manage().window().getPosition().getY();
        int genislik = driver.manage().window().getSize().getWidth();
        int yukseklik = driver.manage().window().getSize().getHeight();

        Thread.sleep(4000);

         if (xPozisyonu==9 && yPozisyonu==9 && genislik==1051 && yukseklik==806){
             System.out.println("ölçeklendirme testi pass");
         }else {
             System.out.println("ölçeklendirme testi failed");
         }




        //8. Sayfayi kapatin

         driver.close();






    }
}
