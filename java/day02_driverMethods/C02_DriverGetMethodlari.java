package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverGetMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("https://www.amazon.com");

        System.out.println(driver.getTitle());

        //get title gittiğimiz sayfanın başlığını etiri

        System.out.println(driver.getCurrentUrl());
         //https://www.amazon.com/


        System.out.println(driver.getWindowHandle());
        //CDwindow-2654573D91DC8153ECECB6C0F7667425

        System.out.println(driver.getPageSource());
        //sistem içinde yazılan bütün kodlar gelir












    }
}
