package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_CssSelector {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();//alışkanlık haline getir
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //,

        //1 ) Bir class oluşturun : Locators_css
        //2 ) Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //    a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in

        driver.get("http://a.testaddressbook.com/sign_in");


        //    b. Locate email textbox

        WebElement emailTextBox = driver.findElement(By.cssSelector("input[id='session_email']"));

        //    c. Locate password textbox ve

        WebElement passwordTextBox = driver.findElement(By.cssSelector("input[id='session_password']"));

        //    d. Locate signin button

        WebElement signintextBox = driver.findElement(By.cssSelector("input[name='commit']"));


        //    e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        //        i. Username : testtechproed@gmail.com
        //        ii. Password : Test1234!


        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTextBox.sendKeys("Test1234!");
        signintextBox.click();


        //NOT: cssSelector kullanarak elementleri locate ediniz.

        driver.close();


        // ıd ile yapiliyorsa id yerine  # koyarsak ıd yi direk buluyor
        // class ile yapiliyorsa class yerine  . koyarsak classi  direk buluyor


    }
}
