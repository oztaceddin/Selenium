package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class C05_ExceliMapeYukleme {


    @Test
    public  void test01(){

        //dosya yolu ve sayfa ismi verilen bir exele sheet i map olarak kaydeden
        //reusable bir method oluştr


        String path="src/test/java/resources/ulkeler.xlsx";

        String sayfaAdi="sayfa1";

        System.out.println(ReusableMethods_Excel.mapOlustur(path,sayfaAdi));



        //oluşturdugumuz map i kullanarak ülke ismi Turkey in bilgilerini yazdırın

        Map<String,String> ulkelerMap= ReusableMethods_Excel.mapOlustur(path,sayfaAdi);

        System.out.println(ulkelerMap.get("Turkey"));


        //listede netherlands oldugunu test edin

        Assert.assertTrue(ulkelerMap.containsKey("Netherlands"));



    }



}
