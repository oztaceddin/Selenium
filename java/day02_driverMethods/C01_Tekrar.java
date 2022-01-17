package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    //normalde selenium un kendi IDE si var fakat biz daha kullanışlı
    //olduğuiçin intellij kullanıyoruz

    //intellij de yeni yeni bir proje açtığımızda öncelikle selenium kütüphanelerini projeyi eklememiz gerekli

    //biz en ilkel haliyle projemize kütüphaneleri jar dosyaları olarak yükledik

    //bu eklediğimiz dosyalarla artık driver in ayarlarını yapabiliriz

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");

        //setProperty methodu 2 parametre ister

        //1- kullanacagımız brovsera ait driver ismi

        //2-selenium sitesinden indirdiğimiz projeye eklediğimiz chromedriver in path

        //windows kullanıcıları için sonunda .exe olmalı diğerlerinde olmamalı

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");

        Thread.sleep(4000);
        //java dan gelir  içine yazılan saniye kadar kodların çalışmasını durduru

        driver.close();
        //   close yaptıktan sonra yeni obje oluşturmalıyız çünkü böyle yaptıgımızda yukarıdaki kodlar
        //kapanmış olur

        //  driver =ChromeDriver();


    }


}


