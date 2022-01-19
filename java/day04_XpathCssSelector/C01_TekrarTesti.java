package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_TekrarTesti {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();//alışkanlık haline getir
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1. Bir class oluşturun : AmazonSearchTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        // a.amazon web sayfasına gidin. https://www.amazon.com/

        driver.get("https://www.amazon.com/");


        //    b. Search(ara) “city bike” yazıp arattırın

        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys("city bike"+ Keys.ENTER);

       // aramaKutusu.submit();  //istersek keys.enter yerinede bunu yazabiliriz


        //    c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın

        WebElement sonucYazisiElementi=driver.findElement(By.className("sg-col-inner"));

        System.out.println(sonucYazisiElementi.getText());


        //    e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.


         WebElement ilkUrunResmi=driver.findElement(By.className("s-image"));

        ilkUrunResmi.click();

        //sadece clik yapmak gibi basit işlemde kullanacagımız web elementleri
        //için variable oluşturmadan direk locate edip istediğimiz işlemi
        //yapabiliriz





        //2.yöntem

        //driver.findElement(By.className("s-image")).click();


        Thread.sleep(2000);
        driver.close();





















    }


}
