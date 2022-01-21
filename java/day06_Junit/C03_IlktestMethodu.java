package day06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_IlktestMethodu {

    WebDriver driver;


    @Test
    public void test01() {
        // amazon.coma gidlim ve titlenin "amazon" içerdiğini test edelim

        driver.get("https://www.amazon.com");
        String actualTitle = driver.getTitle();
        String arananKelime = "amazon";

        if (actualTitle.contains(arananKelime)) {
            System.out.println("amazon testi PASS");
        } else {
            System.out.println("amazon testi FAİLED");
        }


    }


    @Test
    public void test02() {

        //google.com a gidelim ve başlığın "google"içerdiğini test edelim

        driver.get("https://www.google.com/");

        String actualTitle = driver.getTitle();
        String arananKelime = "goole";

        if (actualTitle.contains(arananKelime)) {
            System.out.println("google testi PASS");
        } else {
            System.out.println("google testi FAİLED");
        }


    }


    @Before//bunu yazdıysak hermethoddan önce çalışırı
    public void ayarlarıDuzenle() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


    }

    @After  //dediğimiz için çalışan her methoddan sonra çalışır
    public void ortalıgıTopla() {


        driver.close();


    }


}
