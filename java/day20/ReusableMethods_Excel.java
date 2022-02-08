package tests.day20;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ReusableMethods_Excel {


    // bir method olusturalim
    // dosya yolu,sayfa ismi ve satir, hucre indexini verince hucre bilgisini dondursun

    public static Cell hucreGetir(String path, String sayfaIsmi, int satirIndex, int hucreIndex) {
        Cell cell = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(fileInputStream);
            cell = workbook.getSheet(sayfaIsmi).getRow(satirIndex).getCell(hucreIndex);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return cell;
    }


    public static Map<String, String> mapOlustur(String path, String sayfaAdi) {

        Map<String, String> excelmap = new TreeMap();

        //ilk adım excele ulaşmak

        Workbook workbook = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(fileInputStream);


        } catch (IOException e) {
            e.printStackTrace();
        }

        int satirSayisi = workbook.getSheet(sayfaAdi).getLastRowNum();
        String key = "";
        String value = "";


        for (int i = 0; i < satirSayisi; i++) {

            //2.adım tablodaki hücreleri map e uygun hale dönüştürmek

            key = workbook.getSheet("Sayfa1").getRow(i).getCell(0).toString();
            value = workbook.getSheet("Sayfa1").getRow(i).getCell(1).toString() +
                    ", " + workbook.getSheet("Sayfa1").getRow(i).getCell(2).toString() +
                    ", " + workbook.getSheet("Sayfa1").getRow(i).getCell(3).toString();

            //3.adım key ve value haline getirdiğimiz satırları map e eklemek


            excelmap.put(key,value);


        }


        return excelmap;
    }
}
