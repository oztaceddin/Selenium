package tests.day20;

import org.apache.poi.ss.usermodel.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_ReadExcel {

    /*
     aynı isimdeki methodları tek bir methodun sonuna * ekleyerk hepsini seçmesini sağlarız

    import org.apache.poi.ss.usermodel.Row;
    import org.apache.poi.ss.usermodel.Sheet;
    import org.apache.poi.ss.usermodel.Workbook;
    import org.apache.poi.ss.usermodel.WorkbookFactory;
     */


    @Test
    public void test01() throws IOException {


        String path = "src/test/java/resources/ulkeler.xlsx";


        FileInputStream fileInputStream = new FileInputStream(path);


        //biz fileinputstream ile okudugumuz excel dosyasını projemız içerisine kullanabilmek için
        //apachi poı depenceny yardımı ile workbook oluşturduk

        //bu workbook bizim projemizin içerisinde ülkeler excelinin bir kopyasını
        //kullanmamızı sağlar

        // Excelin yapisi geregi bir hucreye(Cell) ulasabilmek icin workbookdan baslayarak
        // sirasiyla sheet, row ve cell objeleri olusturmamiz gerekiyor



        Workbook workbook = WorkbookFactory.create(fileInputStream);

        Sheet sheet = workbook.getSheet("Sayfa1");

        Row row = sheet.getRow(4);

        Cell cell=row.getCell(2);

        System.out.println(cell);



        //indexi 4 olan satırdaki indexi 2 olan hücrenin  andora oldugunu tets edin

        String expectedData="Andorra";

        Assert.assertEquals(cell.getStringCellValue(),expectedData);


        //5.index deki satırın 3. indexdeki hücre(cell) bilgisini getir

        row=sheet.getRow(5);
        cell= row.getCell(3);

        System.out.println(cell);




    }


}
