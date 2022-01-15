package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_ilkClass {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        //biz driver objesi oluşturdugumuzda
        //boş bir browser açılır

        driver.get("https://www.amazon.com");

        //driver.get methodu drivera gidecegi web adresini girmemizi sağlar

        Thread.sleep(4000);
        driver.close();


    }
}
