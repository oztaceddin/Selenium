package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverNavigateMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.navigate().to("https://amazon.com");

        //driver.get ile aynı işlemi yapar  ve daha hızlıdır

         driver.navigate().to("https://techproeducation.com");
         //amazondan sonra buraya gider
         driver.navigate().back();
        //geri döner
         driver.navigate().forward();
         //tekrardan tekno sayfasına gider
         driver.navigate().refresh();

         //sayfayı yeniler












    }
}
