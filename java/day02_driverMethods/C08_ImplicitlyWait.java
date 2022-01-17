package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C08_ImplicitlyWait {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();//alışkanlık haline getir
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //implicitlyWait(Duration.ofSeconds(15)----
        //testimiz boyunca sayfa açılması ve element bulunması konusunda
        //driverin bekleyeceği max süreyi belirlememize yarar
        //bu süre içerisinde görevini bitirr bitirmez bir sonraki adıma geçer
        //bu süre içinde görevini bitiremesse hata verir

        //belirlenen max süre "thread sleep" gibi mutlak bekleme süresi değildir

        driver.get("https://www.techproeducation.com");

        //Thread.sleep(5000);
        driver.close();


    }
}
