package tests.day11;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.Set;

public class C02_WindowHanle {

    //● Tests package’inda yeni bir class olusturun: WindowHandle2


    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void windowhanleTest(){

        //● https://the-internet.herokuapp.com/windows adresine gidin.

       driver.get("https://the-internet.herokuapp.com/windows");


        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.

        WebElement sayfadakiYaziElementi=driver.findElement(By.tagName("h3"));

        SoftAssert softAssert=new SoftAssert();

       softAssert.assertEquals(sayfadakiYaziElementi.getText(),"Opening a new window","sayfadaki yazı beklenenden farklı");

        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.

        softAssert.assertEquals(driver.getTitle(),"The Internet","sayfa title ı beklenenden farklı");




        //● Click Here butonuna basın.
        //soruda windowhandle değerini bilmediğimiz bir window açılıyor
        //o sayfanın wind. handle değer. bulmak için geçtiğimiz sayfaların handl. degerini almalıyız

        String windowHandleDegeri1=driver.getWindowHandle();


        driver.findElement(By.xpath("//a[text()='Click Here']")).click();




        //● Acilan yeni pencerenin sayfa başlığının (title) “New Window” oldugunu dogrulayin.

//önce açılan yeni sayfanın handle degerini elde etmeliyiz
        //önce tüm handle degerini alıp bir set e koyalım

        Set<String> handleDegerleriSeti=driver.getWindowHandles();
        String windowHandleDegeri2=driver.getWindowHandle();

        for (String each:handleDegerleriSeti
             ) {
            if (!each.equals(windowHandleDegeri1)){
                windowHandleDegeri2=each;
            }
        }

        //artık yeni sayfaya geçiş yapabiliriz

        driver.switchTo().window(windowHandleDegeri2);

        softAssert.assertEquals(driver.getTitle(),"New Window","yeni sayfa title si farklı");



        //● Sayfadaki textin “New Window” olduğunu doğrulayın.

        WebElement ikinciSayfadakiYaziElementi=driver.findElement(By.tagName("h3"));

        softAssert.assertEquals(ikinciSayfadakiYaziElementi.getText(),"New Window","ikinci sayfadaki yazi farklı");





        //● Bir önceki pencereye geri döndükten sonra
        // sayfa başlığının “The Internet” olduğunu doğrulayın.

        driver.switchTo().window(windowHandleDegeri1);

        softAssert.assertEquals(driver.getTitle(),"The Internet","ilk sayfanın title farklı");




       softAssert.assertAll();

    }


    @AfterClass
    public void teardown() {
        driver.quit();
    }



}
