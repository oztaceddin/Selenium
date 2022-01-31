package tests.day14;

import org.openqa.selenium.Cookie;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.util.Set;

public class C03_Cookies extends TestBase {


       @Test
    public void test01(){

           //Yeni bir class olusturun : cookiesAutomation
           //1- Amazon anasayfaya gidin

           driver.get("https://www.amazon.com");


           //2- tum cookie’leri listeleyin

         Set<Cookie> cookieSet=driver.manage().getCookies();

           System.out.println(cookieSet);

           int sayac=1;

           for (Cookie each:cookieSet
                ) {
               System.out.println(sayac+".cookie :"+each);
               sayac++;
           }


           //3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin

           Assert.assertTrue(cookieSet.size()>5);


           //4- ismi i18n-prefs olan cookie degerinin "USD" oldugunu test edin

          Cookie cookiesi18n=driver.manage().getCookieNamed("i18n-prefs");

           System.out.println("cookiesi18n degeri :"+cookiesi18n);

           Assert.assertTrue(driver.manage().getCookieNamed("i18n-prefs").getValue().equals("USD"))  ;

           //5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun ve sayfaya ekleyin

           Cookie myCookie=new Cookie("en sevdiğim cookie","cikolatali");

           driver.manage().addCookie(myCookie);


           Set<Cookie> cookieSet2=driver.manage().getCookies();

           System.out.println(cookieSet2);

           int sayac1=1;

           for (Cookie each:cookieSet2
           ) {
               System.out.println(sayac1+".cookie :"+each);
               sayac1++;
           }

           //6- eklediginiz cookie’nin sayfaya eklendigini test edin

           Assert.assertTrue(cookieSet2.contains(myCookie));


           //7- ismi skin olan cookie’yi silin ve silindigini test edin

           driver.manage().deleteCookieNamed("skin");

           Set<Cookie> cookieSet3=driver.manage().getCookies();

           System.out.println(cookieSet3);

           int sayac2=1;

           for (Cookie each:cookieSet2
           ) {
               System.out.println(sayac2+".cookie :"+each);
               sayac2++;
           }


           Assert.assertFalse(cookieSet3.contains(driver.manage().getCookieNamed("skin")));

           //8- tum cookie’leri silin ve silindigini test edin

           driver.manage().deleteAllCookies();

           Set<Cookie> cookieSet4=driver.manage().getCookies();

           System.out.println(cookieSet4);

           Assert.assertTrue(cookieSet4.size()==0);









       }
}
