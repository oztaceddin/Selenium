package tests.day13;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.nio.file.Files;
import java.nio.file.Paths;


public class C02_FileExists {


    @Test
    public void test01(){

        System.out.println(System.getProperty("user.home"));




        //masaüstündeki deneme  dosyanın pathini istersem
        //C:\Users\oz_tc\Desktop\deneme\selenium.pptx

        //yani dinamik olarak masaüstündeki deneme klasörünün pathini yazmak istrsem


        String path=System.getProperty("user.home")+"\\Desktop\\deneme\\selenium.pptx";
        System.out.println(path);

        System.out.println(" user dir :"+System.getProperty("user.dir"));

        //masaüstünde denem klasörü içerisinde selenium.pptx isminde bir dosya oldugunu test et
         //*****masaüstünde denem klasörü ve içinde selenium klasörü oluştuldugundan yapıyoruz
        //1-önce dosyaya ulaşmak için dinamik path oluşturalım

        String dosyaYolu=System.getProperty("user.home")+"\\Desktop\\deneme\\selenium.pptx";


        System.out.println(Files.exists(Paths.get(dosyaYolu)));







         //projemizde pom.xhm oldugunu test edelim

        //C:\Users\oz_tc\IdeaProjects\com.TestNGBatch44\pom.xml

        System.out.println(System.getProperty("user.dir"));//projenin yolunu verir
         //C:\Users\oz_tc\IdeaProjects\com.TestNGBatch44


        String pompath=System.getProperty("user.dir")+"\\pom.xml";

        Assert.assertTrue(Files.exists(Paths.get(pompath)));


    }




}
