package day001;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class testYsn {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://youtube.com");
        String actualTitle=driver.getTitle();
        String beklenen="youtube";
        if (!actualTitle.equals(beklenen)){
            System.out.println(actualTitle);
        }
        driver.navigate().to("https://amazon.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().fullscreen();
        String actualTitle1=driver.getTitle();
        String istenen="Amazon";
        if (!actualTitle1.contains(istenen)){
            System.out.println(actualTitle1);
        }
        String actualUrl=driver.getCurrentUrl();
        String istenn="https://www.amazon.com/";
        if (!actualUrl.equals(istenn)){
            System.out.println(actualUrl);
        }
        driver.close();

        /*
        driver.get()-->gidecegimiz yerde
        driver.navigate()-->ileri geri de kullaniriz
        driver.manage()    methodlari diye 3 e ayirdik
        web elementler=web sayfasinda etkilesimli olan olmayan hersey. 3 bilesenden olursur.tag.attirubute,value
        tag mutlaka olmalidir,attirubute %90 olur,web elementi tanimlayan attirubute tur.

        ****ONEMLİ***Bir vebelementin html koduna ulasabiliyorsaniz,onu otomasyonda kullanabilirsiniz net...
        Benzer ozellikteki html elementlerini css araciligiyla ayri bir sayfada bicimlendiririz.class ozelligi bu
        olanlari renklendir gibi...

        testerlik -->locate et kullan,locate et kullan...inspect,incele sekmesiyle ulasiriz webelemente..
        webelementleri nerede bulacagimizi LOCATORLERLE belirleriz (yer belirlemek ,konum belirlemek)..
        W.ELEmentini bulurken cok kullandigimiz attiributler var olur,bunlarin disindada iki tane ozel locate
        etme aracimiz var
        Bir tanesi XPATH hepsini bulur cok guclu...cozemeyecegi is yok...
        digeri CSS LOCATE,,,AMA XPATH BİZE YETER..

        LİNKLERİN TAGİ A yada h-HREF GİBİ...twotabsearchtextbox

       locatorler 8 tanedir.6 tanesi attiributlerle ilgilidir.geriye kalan 2 tanesi xpath,csslocator
       bu tag attiribut ve value nun kombinasyonlariyla ilgilidir.6 tanesi cok bilinen attirubutlere gore
       mistir.id,name ,class,input,geriye kalan iki taneside linklerle ilgilidir.
       LOCATORLER
       id
       name
       className(attiribut u class,locatoru className,,sadece bunda boyle)
       tagName
       linkText
       partialLinkText
       xpath=>xpath yazmanin birden fazla yolu vardir.
       cssSelector=>css yazmanin birden fazla yolu vardir.

       driver.findElement(locator);
       driver.fintElement(By.id("twotabsearchtextbox"));

         */
        //driver.quit();acilan tum browserleri kapatir,birden fazla tabi,sekmeyi kapatmak icin kullanilir.
           //web elementler
        //button
        //search box:arama kutusu
        //text box=metin kutusu
        //headers=basliklar
        //tables(tablolar) vb..
        //otomasyon icin uniwue(tek) web ogelerini(element) tanimlamak uzere html kodunu inceleyecegiz(inspect)
        //web elementleri birlikte kullanici arayuzunde (UI) bir web sayfasi olustururlar.




    }
}
