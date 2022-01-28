package tests.day12;

import org.testng.annotations.Test;
import tests.day10.C01_Allerts;

public class C01_TestBaseKullanım {










    @Test
    public void test01(){
        //projemizin içerisinde herhangi bir class dan obje oluşturabilir
        //ve o obje sayesinde ait oldugu class daki tüm variable ve method ları
        //(access modifier) izin verdiği sürece ulaşabiliriz

        C01_Allerts obj =new C01_Allerts();

        //eger proje kapsamında bir classdan obje oluşturulmasını engellemek istersek
        //1-o class ın constructor ini private yapabiliriz
        //2-class ın kendisini abstract yapabiliriz
        //1. methodu çok tercih etmeyiz çünkü OOP consept e uymaz(çok sınırlı kullanımı vardır)
        //2.methodu kullanabiliriz böylece o class daki abstract olmayan(concrete)
        //methodları averride etmek mecburiyeti olmadan kullanabiliriz
        //ama obje oluşturamayız



        //örnegin biz testBase class ini abstrack yaptıgımızdan obje oluşturamayız
        // ama child class'lardan TestrBase'deki setUp ve teardown method'larini kullanabiliriz
        // TestBase obj1=new TestBase();




    }








}
