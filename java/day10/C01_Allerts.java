package tests.day10;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class C01_Allerts {


    //● Bir class olusturun: Alerts
    //● https://the-internet.herokuapp.com/javascript_alerts adresine gidin.
    //● Bir metod olusturun: acceptAlert
    //        ○ 1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının       “You successfully clicked an alert” oldugunu test edin.
    //● Bir metod olusturun: dismissAlert
    //        ○ 2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının       “successfuly” icermedigini test edin.
    //● Bir metod olusturun: sendKeysAlert
    //        ○ 3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin, OK butonuna     tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.

    WebDriver driver;
    WebElement sonucYazisiElementi;


@BeforeClass
    public void setup(){

    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();

    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("https://the-internet.herokuapp.com/javascript_alerts");



}



@Test
    public void accesAlertTest01() throws InterruptedException {

    //● Bir metod olusturun: acceptAlert
    //        ○ 1. butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının

    driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
    Thread.sleep(3000);

    driver.switchTo().alert().accept();
    //        “You successfully clicked an alert” oldugunu test edin.
     sonucYazisiElementi=driver.findElement(By.xpath("//p[@id='result']"));
    Thread.sleep(3000);

    String actualSonucYazisi=sonucYazisiElementi.getText();
    String expectesSonucyazisi="You successfully clicked an alert";

    Assert.assertEquals(actualSonucYazisi,expectesSonucyazisi);




}


@Test
    public void dismissAlertTest02() throws InterruptedException {

    //● Bir metod olusturun: dismissAlert
    //        ○ 2. butona tıklayın, uyarıdaki Cancel butonuna tıklayın ve result mesajının
    //        “successfuly” icermedigini test edin.

    driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
   Thread.sleep(3000);

    driver.switchTo().alert().dismiss();


    sonucYazisiElementi=driver.findElement(By.xpath("//p[@id='result']"));

    Thread.sleep(3000);
    String actualSonucyazisi=sonucYazisiElementi.getText();
    String istenmeyenKelime="successfuly";

    Assert.assertFalse(actualSonucyazisi.contains(istenmeyenKelime));




}

@Test
    public void sendKeysAlerttest03() throws InterruptedException {

    driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
    Thread.sleep(3000);
    driver.switchTo().alert().sendKeys("deneme");
    Thread.sleep(3000);

    //● Bir metod olusturun: sendKeysAlert
    //        ○ 3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin,
    //        OK butonuna     tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.

    driver.switchTo().alert().accept();
    Thread.sleep(3000);
    sonucYazisiElementi=driver.findElement(By.xpath("//p[@id='result']"));
    String actualSonucyazisi=sonucYazisiElementi.getText();

    String arananKelime="deneme";


    Assert.assertTrue(actualSonucyazisi.contains(arananKelime));

}






@AfterClass
    public void teardown(){

    driver.close();

}








}
