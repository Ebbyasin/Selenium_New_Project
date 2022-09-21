package TestOdev;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Test1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        //WebElement aramaKutusu=driver.findElement(By.name("field-keywords")); bu attiributlede calisti..
        //bu locatorle calismadi,aldigimizla calismazsa alternatif denemeliyiz

        //eger yanlis id locate edilirse ;NoSuchElementException hatasi olusur.

        //class ve value unique ise,bu metodu da kullanabilirsiniz,ancak genelde class attribute ayni islevi yapan
        //grup web elementi icin kullanilir
        //class attirubetnun degeri bosluk iceriyorsa genelde by.classname ile yapilan locate ler saglikli
        // calismaz

        //linktest yalnizca html baglantilarini(link) tanimlamak icin kullanilabilir.
        //link test attirbute nu kullandigimizda  once link old. kontrol ederiz <a kisaltmasi olmali
        //string olarak alindigi icin bosluk varsa o da alinmali.

        /*
        BU KISIM ELEMENTİN TAG VE ATTİRİBUTU OLAN UZERİ RENKLİ (ASAGİDAKİ KİSİM)DA SAG TİK YAPARAK,COPY/ELEMENT
        SECİMİYLE ELEMENTİN ATTİRİBUT KİSMİNİN KOPYALANMASİ DİR,ORDA NET GOZUKMUYOR BAZEN,BU SEKİL KOPYALAYARAK
        CALİSTİGİMİZ SAYFAYA GETİREBİLİYORUZ.
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off"
        placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Ara">*/

        //findElement() bize istedigimiz web elementini bize dondurur
        //biz de o webelementini kullanmak icin bir objeye assign ederiz.

        //herhangi bir webelementine istedigimiz yaziyi yollamak istersek;
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        /*
        Locator bulmak icin kullanilan methodlar;
        1-tanimladigimiz web elementin yerini driverin bulabilmesi icin findElement(Locator) methodunu kullaniriz.
        driver.findDelement(locator)
        2-findElement(locator) methodunun icine parameter olarak yazacagimiz locator in 8 locator dan hangisi old.
        belirtmak icin de By.LocatorTuru("locateBilgisi"); kullanilir
        driver.findElement(By.id("twotabsearchtextbox"));
        3-locate ettigimiz WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox")); (kapici-ekmek)
         */

        //bir webelementin uzerinde ne yazdigini gormek istersek webElementIsmi.getText()  kullaniriz

        driver.close();
    }
}
