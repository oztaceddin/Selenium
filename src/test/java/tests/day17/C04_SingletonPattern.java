package tests.day17;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_SingletonPattern {



    @Test
    public void test01(){


        //singleton pattern:bir classdan birden fazla obje üretilmesine
        //izin vermeyen bir pattern olarak kabul görmüştür


        //biz Driver class ını driver üretmek uzere kullanıyoruz
        //ancak driver class ında driver isminde bir instance variable da var
        //ve biz obje üreterek ve instance driver a ulaşabiliriz


      //  Driver driver1=new Driver();


       // Driver driver2=new Driver();

     //   Driver driver3=new Driver();


        //singleton pattern kabul görmüş bir pattern dir
        //amaç bir class dan obje üretilmemesini sağlamaktır
        //bunun için singleton patter de koruyacagımız class da
        //parametresiz bir constructor oluştururuz






    }





}
