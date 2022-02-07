package tests.day20;

import org.apache.poi.ss.usermodel.*;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_ReadExcel {



   @Test
   public void test01() throws IOException {


       //ülkeler excelinin 3. satırını yazdırın


       String path = "src/test/java/resources/ulkeler.xlsx";


       FileInputStream fileInputStream = new FileInputStream(path);

       Workbook workbook = WorkbookFactory.create(fileInputStream);

       //Sheet sheet = workbook.getSheet("Sayfa1");


       for (int i=0; i<4;i++){
           System.out.println(workbook.getSheet("Sayfa1").getRow(2).getCell(i).toString());

       }



       //ilk 20 ülkenin başkentlerinin türkçe isimlerini yazdırın

       for (int i=0; i<21;i++){

           System.out.print(workbook.getSheet("Sayfa1").getRow(i).getCell(3)+",");

           //yazdırma yapacagımız zaman to stringe gerek yoktur
       }





   }


}
