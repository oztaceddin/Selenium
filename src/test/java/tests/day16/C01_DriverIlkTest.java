package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {

    //driver classı sayesinde eski driver kullanışsız oldu
    //artık driver e ihtiyaç varsa Driver.getdriver yapmalıyız


    @Test
    public void test01(){

        //amzona gidelim

        Driver.getDriver().get("https://www.amazon.com");

        //amazona gittiğini

        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains("Amazon"));


        //Driver.getdriver her çalıştıgından
        //driver=new ChoromeDriver(): komutundan ötürü yeni bir driver oluşturuyor
        //biz Driver classından getdriveri ilk çalıştırdıgımızda new ataması olsun
        //sonraki çalışmalarda atama olmasın istiyoruz
        //bunun için driver=new ChromeDriver(); satırını if bloguna almalıyız


     Driver.closeDriver();


    }


    @Test
    public void test02(){

        //bestbuy ana sayfasına gidelim

      Driver.getDriver().get("https://www.bestbuy.com");


       //best buya gittiğimizi test edelim

        String actualUrl=Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualUrl.contains("best"));


      Driver.closeDriver();


    }



}
