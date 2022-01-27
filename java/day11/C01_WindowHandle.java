package tests.day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class C01_WindowHandle {


    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }


    @Test
    public void handleWindos() throws InterruptedException {

        driver.get("https://www.amazon.com");
        String windowHanleDegeri = driver.getWindowHandle();

        System.out.println("ilk sayfanın handle değeri :" + driver.getWindowHandle());

        driver.switchTo().newWindow(WindowType.WINDOW);//yeni pencere açılır
        driver.get("https://www.bestbuy.com");
        System.out.println("2.sayfanın handle degeri" + driver.getWindowHandle());
        String windowHanleDegeri1 = driver.getWindowHandle();

        Set<String> hanleDegerleriSet = driver.getWindowHandles();
        System.out.println(hanleDegerleriSet);


        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://facebook.com");


        //amazo un açık oldugu sayfaya geçin ve nutella için arama yapın

        driver.switchTo().window(windowHanleDegeri);
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        aramaKutusu.sendKeys("nutella" + Keys.ENTER);
        Thread.sleep(4000);

        //bestbuy açık olan sayfaya geçin ve title in BestBuy  içerdiğini test edin

        driver.switchTo().window(windowHanleDegeri1);
        Assert.assertTrue(driver.getTitle().contains("Best Buy"));


        //facebookun oldugu sayfaya geçin ve ,
        // url in https://facebook.com oldugunu test edin
        //eger açık olan pencerelerden sadece bir tanesinin window handle degeri biliniyorsa
        //once tüm handle degerlerini bulup bir sete koyarız

        hanleDegerleriSet = driver.getWindowHandles();


        //bu soru için şuanda set'te 3 window handle degeri var
        // 1 ve 2. sayfanın window hanle degerlerini biliyoruz
        //setimizde olup ilk iki sayfa olmayan handle değeri 3.sayfanın degeri olacaktır

        String windowHandleDegeri2="";
        for (String each:hanleDegerleriSet
             ) {
            if (!(each.equals(windowHanleDegeri) ||
                    each.equals(windowHanleDegeri1))){

                windowHandleDegeri2=each;
            }
        }


        System.out.println(windowHandleDegeri2);
        System.out.println(hanleDegerleriSet);

        driver.switchTo().window(windowHandleDegeri2);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.facebook.com/");





        Thread.sleep(4000);



    }


    @AfterClass
    public void teardown() {
        driver.quit();
    }


}
