package day06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_TekSayfadaFarklıTestler {

    static WebDriver driver;

    static WebElement aramaKutusu;
    static WebElement sonucYazisiElementi;

    @Test
    public void test01() {
        //amazon sayfasında nutella için arama yapıp
        //sonuç yazısının nutella içerdiğini test edelim

        aramaKutusu.sendKeys("nutella" + Keys.ENTER);
        sonucYazisiElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String actualSonucu = sonucYazisiElementi.getText();
        String arananKelime = "nutella";

        if (actualSonucu.contains(arananKelime)) {
            System.out.println("nutella testi PASS");
        } else {
            System.out.println("nutella testi FAİLED");
        }


    }


    @Test
    public void test02() {
        //amazon sayfasında java için arama yapıp
        //sonuç yazısının java içerdiğini test edelim

        aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.clear();

        aramaKutusu.sendKeys("java" + Keys.ENTER);
        sonucYazisiElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String actualSonucu = sonucYazisiElementi.getText();
        String arananKelime = "java";

        if (actualSonucu.contains(arananKelime)) {
            System.out.println("java testi PASS");
        } else {
            System.out.println("java testi FAİLED");
        }




    }


    @Test
    public void test03() {
        //amazon sayfasında ali için arama yapıp
        //sonuç yazısının ali içerdiğini test edelim


        aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.clear();

        aramaKutusu.sendKeys("ali" + Keys.ENTER);
        sonucYazisiElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        String actualSonucu = sonucYazisiElementi.getText();
        String arananKelime = "ali";

        if (actualSonucu.contains(arananKelime)) {
            System.out.println("ali testi PASS");
        } else {
            System.out.println("ali testi FAİLED");
        }




    }








    @BeforeClass//bunu yazdıysak hermethoddan önce çalışırı
    public static void ayarlarıDuzenle() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.amazon.com");
        aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));



    }

    @AfterClass  //dediğimiz için çalışan her methoddan sonra çalışır
    public static void ortalıgıTopla() {

        driver.close();

    }


}
