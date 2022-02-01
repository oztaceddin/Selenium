package tests.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C04_JsExecuterClick extends TestBase {


    @Test
    public void test01() throws InterruptedException {

        //amazon sayfasına git
        //selllinkine jsexecutor ile tıklayalım
        //ilgili testin sayfaya gittiğini test et

        driver.get("https://www.amazon.com");

        //1.adım JSEXECUTER objesi oluşturalım

        JavascriptExecutor jse= (JavascriptExecutor) driver;


        //2.adım ilgili web elementi locate edelim


        WebElement sellElementi=driver.findElement(By.xpath("//a[normalize-space()='Sell']"));


        //3.adım ilgili script ve argument(bizim web elemntimiz)
        //ile objemiz uzerinden executeScript methodunu çalıştıralım



        jse.executeScript("arguments[0].click();",sellElementi);

        Thread.sleep(5000);







    }



}
