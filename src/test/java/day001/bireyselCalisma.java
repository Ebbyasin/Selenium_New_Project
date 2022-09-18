package day001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bireyselCalisma {

    public static void main(String[] args) {
        /*
        otomasyon yapmak icin webdriver gerekli ,uzerinde calistigimiz class a webdriver in yerini
        gostermeliyiz.bunun icin System.setProperty() methodu gerekli,
        property=mulkiyet demek, setProperty =mulkiyeti ayarla,adresi goster
        ?????burda bir soru "webdriver.chrome.driver" ne anlama geliyor
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");

        //sonrada driver i kullanabilmek icin webdriver dan bir obje olusturuyorum,ama chromdriver constructorini
        //kullaniyorum,asagidakileri import edebilmem icin intellijeye bu kutuphaneyi tanimlamam gerekiyor
        // file/project structure/modules/dependendies +jars or directors/projem/src/resources/librares/lib altin
        //dakileri sec.sadece jar dosyalarini sec

        WebDriver driver=new ChromeDriver(); // bu obje olusturmayla calistirdigimizda sayfamiz olusur,bos bir
                                             // sekilde.simdi hangi sayfayi acacagini soyleriz
        driver.get("https://trendyol.com"); // burda istedigimiz sayfaya gidebilmek icin adres yazariz get() methodu
                                            // ile..(string olarak girilen url e gider)artik trendyolun icindeyiz
        System.out.println("Actual Title :"+driver.getTitle()); //bu basligi gorebilmem icin yazdirmam
                                                                // gerekiyor soutla,girilen sitenin basligini yazdrr
                                                     //title=baslik  , current :guncel , actuel=gercek,asil
        System.out.println("Actual Url :"+driver.getCurrentUrl()); // girilen sayfanin url sini getirir

        System.out.println(driver.getPageSource());// o sitenin arkasindaki butun kaynak kodlarini getirir
                                                   // ayni zamanda sitenin sayfasinda boslukta sag tik/incele
        driver.close();
        //driver.quit();acilan tum browserleri kapatir,birden fazla tabi,sekmeyi kapatmak icin kullanilir.
        //search box:arama kutusu
        //text box=metin kutusu
        //headers=basliklar
        //otomasyon icin uniwue(tek) web ogelerini(element) tanimlamak uzere html kodunu inceleyecegiz(inspect)
        //web elementleri birlikte kullanici arayuzunde (UI) bir web sayfasi olustururlar.


    }
}
