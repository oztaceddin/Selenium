package day05_RelativeXpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C02_RelativeXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();//alışkanlık haline getir
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //,
        //1 ) https://www.diemol.com/selenium-4-demo/relative-locators-demo.html  adresine gidin

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        // once uzerlerinden tarif yapacagimiz web elementlerini tarif etmeliyiz


        WebElement sailor = driver.findElement(By.id("pid11_thumb"));
        WebElement boston = driver.findElement(By.id("pid6_thumb"));
        WebElement byArea = driver.findElement(By.id("pid8_thumb"));
        WebElement nyc = driver.findElement(By.id("pid3_thumb"));



        // 2 ) Berlin’i  3 farkli relative locator ile locate edin


        WebElement berlin1 = driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(boston).toLeftOf(byArea));
       WebElement berlin2=driver.findElement(RelativeLocator.with(By.tagName("img")).above(sailor).toLeftOf(byArea));
       WebElement berlin3= driver.findElement(RelativeLocator.with(By.tagName("img")).below(nyc).above(sailor));




        // 3 ) Relative locator’larin dogru calistigini test edin


       String expectedİdDegeri="pid7_thumb";
       String actualDegeri=berlin1.getAttribute("id");
       String actualDegeri1=berlin2.getAttribute("id");
       String actualDegeri2=berlin3.getAttribute("id");


       if (expectedİdDegeri.equals(actualDegeri)){
           System.out.println("1.relativ testi PASS");
       }else {
           System.out.println("1.relativ testi FAİLED");
       }

        if (expectedİdDegeri.equals(actualDegeri1)){
            System.out.println("2,relativ testi PASS");
        }else {
            System.out.println("2.relativ testi FAİLED");
        }

        if (expectedİdDegeri.equals(actualDegeri2)){
            System.out.println("3.relativ testi PASS");
        }else {
            System.out.println("3.relativ testi FAİLED");
        }


    }
}
