package tests.day20;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C06_WriteExcel {


    @Test
    public void test01() throws IOException {

        //ülkeler excel ine 5. sutun olarak  nufus sutunu ekleyelim

        //3.satırdaki ülkenin nufusunu 1 milyon yapalım



        //dosyaya ulaşalım

        String path="src/test/java/resources/ulkeler.xlsx";

        FileInputStream fileInputStream = new FileInputStream(path);

        //classda çalışmak için dosyanın bir kopyası olan workbook oluşturalım

        Workbook workbook = WorkbookFactory.create(fileInputStream);

        //dosyada yapmak istediğimiz değişiklikleri
        //kopya wprkbook da yapalım


        //ilk önce ilk satırın 5. hücresine nufus başlıgı yazdıralım

        workbook.getSheet("sayfa1").getRow(0).createCell(4).setCellValue("NUFUS");

        //3.satırdaki ülkenin nufusunu 1 milyon yapalım

        workbook.getSheet("sayfa1").getRow(2).createCell(4).setCellValue("1000000");



        //---kopyada yaptıgımız değişiklikleri ana dosyaya kaydedelim

        FileOutputStream fileOutputStream=new FileOutputStream(path);

        workbook.write(fileOutputStream);




    }




}
