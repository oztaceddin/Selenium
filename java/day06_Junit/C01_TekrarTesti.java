package day06_Junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;

public class C01_TekrarTesti {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1-C01_TekrarTesti isimli bir class olusturun
        //2- https://www.google.com/ adresine gidin

        driver.get("https://www.google.com/");

        //3- cookies uyarisini kabul ederek kapatin
        //4-Sayfa basliginin “Google” ifadesi icerdigini test edin

        String actualSayfaTitle = driver.getTitle();
        String arananKelime = "Google";

        if (actualSayfaTitle.contains(actualSayfaTitle)) {
            System.out.println("title testi PASS");

        } else {
            System.out.println("title testi FAİLDE");
        }

        //5- Arama cubuguna “Nutella” yazip aratin

        WebElement aramaÇubuguElementi = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));

        aramaÇubuguElementi.sendKeys("Nutella" + Keys.ENTER);

        //6-Bulunan sonuc sayisini yazdirin

        WebElement sonucSayisiElementi = driver.findElement(By.xpath("//div[@id='result-stats']"));

        System.out.println(sonucSayisiElementi.getText());

        //7- sonuc sayisinin 10 milyon’dan fazla oldugunu test edin

        String sonucSayisiString = sonucSayisiElementi.getText();

        String sonucKelimeleri[] = sonucSayisiString.split(" ");

        // System.out.println(Arrays.toString(sonucKelimeleri));

        String sonucNutellaSayisiString = sonucKelimeleri[1];
        sonucNutellaSayisiString = sonucNutellaSayisiString.replace(".", "");

        int nutellaAramaSonucu = Integer.parseInt(sonucNutellaSayisiString);

        if (nutellaAramaSonucu > 10000000) {
            System.out.println("nutella arama testi PASS");
        } else {
            System.out.println("nutella arama testi FAİLED");
        }

        //8-Sayfayi kapatin

        driver.close();


    }
}
