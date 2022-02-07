package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C04_SatirSayisi {



    @Test
    public void  test01() throws IOException {

        //ülkeler excelindeki sayfa 1 ve sayfa 2 deki satir sayılarını
        //ve kullanılan satır sayısını bulun

        String path="src/test/java/resources/ulkeler.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        Workbook workbook = WorkbookFactory.create(fileInputStream);

        int sayfa1SatirSayisi=workbook.getSheet("Sayfa1").getLastRowNum();

        int sayfa1FizikiKullanılanSatirSayisi=workbook.getSheet("Sayfa1").getPhysicalNumberOfRows();


        System.out.println("1. sayfa satır sayısı :"+sayfa1SatirSayisi);

        System.out.println("1. sayfada kullanılan satır sayısı :"+sayfa1FizikiKullanılanSatirSayisi);



        int sayfa2SatirSayisi=workbook.getSheet("Sayfa2").getLastRowNum();

        int sayfa2FizikiKullanılanSatirSayisi=workbook.getSheet("Sayfa2").getPhysicalNumberOfRows();


        System.out.println("2. sayfa satır sayısı :"+sayfa2SatirSayisi);

        System.out.println("2. sayfada kullanılan satır sayısı :"+sayfa2FizikiKullanılanSatirSayisi);









    }





}
