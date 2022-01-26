package tests.day09;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C03_SoftAssertion {









    @Test
    public void test(){

        int a=10;
        int b=20;
        int c=30;


        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals(a,b,"1.test başarısız");//failed
        softAssert.assertTrue(a>b,"2.test başarızı");//failed
        softAssert.assertTrue(a<b,"3.test başarısız");//pass
        softAssert.assertTrue(c>b,"4.test başarısız");//pass
        softAssert.assertTrue(c<a,"5.test başarısız");//failed

        //assertall demessek class çalışır ve passed yazar
        //çünkü aslinda raporlama yapmaz sadece kodlar çalışmış olur


        softAssert.assertAll();
        //assertall a kadar bütün kod çalışır asserall dan önce failed varsa çalışmaya devam eder
        //assertall dan sonra sonra kodlar çalışmaz






    }






}
