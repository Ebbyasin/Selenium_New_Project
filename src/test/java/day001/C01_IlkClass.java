package day001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {
        /*
        en ilkel haliyle jar dosyalarini file/project structure/modules/dependencies sonra + ya basilir ,jar dosyalari
        secilir,ordan projemizi acariz,src/resources/libraries/Lib acip jar larin hepsi secilir.apply,ok
        en basta birini secersin,sonra shift e basili tutup asagi okla hepsini seceriz

         */


        // En temel haliyle otomasyon yapmak icin class'imiza otomasyon icin gerekli olan webdriver'in
        //yerini gostermemiz gerekir.
       // bunun icin java kutuphanesinde System.setProperty() methodunu kullaniriz.
        //ve methodun icine ilk olarak driver i yazariz.ikinci olarak onun fiziki yolunu kopyalariz.



        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        /*
        javaya adres gostermenin "aha bu Surda demenin"en kolay yolu o şeyin uzerine sag tik yapip sonra
        /copy path reference/path from content rooth / secip tirnak icine yapistirmaktir...mesela burda javaya
        otomasyon icin gerekli olan webdriver in yerini gostermek istedigimizde,sol tarafta(proje ekrani kisminda)
        chromedriver.exe uzerine sag tik yapip yukarda anlattigim hamleleri yapariz.en sonunda System.setProperty
        de parantez icindeki ikinci tirnak icine yazariz..
         */
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");  //www olmasada olur,ama https de s olmali,s security demek...
        System.out.println("Actual Title : "+driver.getTitle()); // gidilen sitenin basligini yazdirir.
        System.out.println("Actual Url "+driver.getCurrentUrl()); //gidilen sayfanin url sini getirir.

        System.out.println(driver.getPageSource());
        /*
        yorum icin iyi renk secmisiz
         */
        driver.close();


    }
}
