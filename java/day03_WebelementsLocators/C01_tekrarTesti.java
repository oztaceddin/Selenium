package day03_WebelementsLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_tekrarTesti {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();//alışkanlık haline getir
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

         //1. Yeni bir class olusturun (TekrarTesti)
        //2. Youtube web sayfasına gidin ve sayfa başlığının “youtube” olup olmadığını doğrulayın (verify), eğer değilse doğru başlığı(Actual Title) konsolda yazdirin.

        driver.navigate().to("https://www.youtube.com");

        String titleYoutube= driver.getTitle();
        String expectedYoutubeTitle="youtube";

        if (titleYoutube.equals(expectedYoutubeTitle)){
            System.out.println("youtube title testi PASS");
        }else {
            System.out.println("yotube title testi FAİLED "+titleYoutube);
        }


        //3. Sayfa URL'sinin “youtube” içerip içermediğini (contains) doğrulayın, içermiyorsa doğru URL'yi yazdırın.
        String youTubeUrl=driver.getCurrentUrl();
        String arananKelimeYouTubeUrl="youtube";

        if (youTubeUrl.contains(arananKelimeYouTubeUrl)){
            System.out.println("youtube url testi PASS");
        }else {
            System.out.println("youtube url testi FAİLED "+youTubeUrl);
        }

        //4. Daha sonra Amazon sayfasina gidin https://www.amazon.com/

        driver.navigate().to("https://www.amazon.com");

        //5. Youtube sayfasina geri donun

        driver.navigate().back();

        //6. Sayfayi yenileyin
        driver.navigate().refresh();

        //7. Amazon sayfasina donun
        driver.navigate().forward();

        //8. Sayfayi tamsayfa yapin

        driver.manage().window().fullscreen();
        //9. Ardından sayfa başlığının "Amazon" içerip içermediğini (contains) doğrulayın, Yoksa doğru başlığı(Actual Title) yazdırın.

       String amazonTitle=driver.getTitle();
       String arananKelimeAmazon="Amazon";

       if (amazonTitle.contains(arananKelimeAmazon)){
           System.out.println("amazon title testi PASS");
       }else {
           System.out.println("amazon title testi FAİLED " +amazonTitle);
       }


        //10.Sayfa URL'sinin https://www.amazon.com/ olup olmadığını doğrulayın, degilse doğru URL'yi yazdırın

      String actualAmazonUrl=driver.getCurrentUrl();
       String expectedAmazonUrl="https://www.amazon.com/";

       if (expectedAmazonUrl.equals(actualAmazonUrl)){
           System.out.println("amazon url testi PASS");
       }else {

           System.out.println("amazon url testi FAİLED "+actualAmazonUrl);
       }


        //11.Sayfayi kapatin

        driver.close();













    }
}
