package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethods {

    public static void main(String[] args) throws InterruptedException {


        //1. Yeni bir package olusturalim : day01
        //2. Yeni bir class olusturalim : C01_GetMethods



        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();


        //3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        //4. Sayfa basligini(title) yazdirin

        System.out.println(driver.getTitle());

        //5. Sayfa basliginin “Amazon” icerdigini test edin

        String actualTitle= driver.getTitle();
        String arananKelime="Amazon";

        if (actualTitle.contains(arananKelime)){
            System.out.println("title testi PASS");
        }else {
            System.out.println("title testi FAİLED");
            System.out.println("sayfanın title ı " +actualTitle);
        }


        //6. Sayfa adresini(url) yazdirin

        System.out.println(driver.getCurrentUrl());
        //7. Sayfa url’inin “amazon” icerdigini test edin.

        String actualUrl= driver.getCurrentUrl();
        String urlArananKelime="amazon";

        if (actualUrl.contains(urlArananKelime)){
            System.out.println("url testi PASS");


        }else {
            System.out.println("url testi faied");
            System.out.println("actual url :"+ actualUrl);
        }



        //8. Sayfa handle degerini yazdirin

        System.out.println(driver.getWindowHandle());

        //9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin

        String actualPageSource= driver.getCurrentUrl();
        String pageArananKelime="alisveris";

        if (actualUrl.contains(urlArananKelime)){
            System.out.println("PageSource testi PASS");


        }else {
            System.out.println("PageSource testi faied");
            System.out.println("actual PageSource:"+ actualPageSource);
        }




        //10. Sayfayi kapatin.

        Thread.sleep(4000);
        driver.close();













    }
}
