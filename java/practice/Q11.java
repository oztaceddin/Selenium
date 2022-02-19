package tests.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.TestBase;

public class Q11 extends TestBase {


    /*
@DataProvider bir TestNG annotation'idir. Dolayisiyla sadece TestNG ile kullanilir.
Veri sağlamak için kullanılır. DDT (Data Driven Test) yapilir
Cucumber'daki Scenario Outline ile ayni isleve sahiptir
 */



    //***************************************************************************

    // http://amazon.com adresine gidiniz
    // araba, ev, anahtarlik, ayakkabi, gomlek  kelimelerini arayiniz


@Test(dataProvider="urunler")
    public void amazonTesti(String kelime){

    driver.get("http://amazon.com");
    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(kelime+ Keys.ENTER);

}

@DataProvider(name="urunler")
    public Object[][] getUrunler(){

    Object[][] urunler={{"araba"},{"ev"},{"ayakkabı"},{"gömlek"}};

    return urunler;
}



//****************************************************************************************



// https://www.gittigidiyor.com/ adresine gidiniz
// java, javascript ve python kelimelerini arayiniz

    @Test(dataProvider = "aranacakKelime")
    public void  gittigidiyortesti(String aranacakKelime){

    driver.get("https://www.gittigidiyor.com/");
    driver.findElement(By.xpath("//input[@name='k']")).sendKeys(aranacakKelime+Keys.ENTER);


    }

    @DataProvider
    public static Object[][] aranacakKelime(){

    String kelime[][]={{"java"},{"javascript"},{"python"}};


    return  kelime;
    }




















}
