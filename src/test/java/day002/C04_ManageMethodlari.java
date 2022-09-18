package day002;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_ManageMethodlari {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(5000);
        driver.get("https://amazon.com");
        driver.close();
        /*
        Ileride wait konusunu daha genis olarak ele alacagiz
        Bir sayfa acilirken, ilk basta sayfanin icerisinde bulunan elementlere gore bir
        yukleme suresine ihtiyac vardir veya bir webelementin kullanilabilmesi icin zamana ihtiyac olabilir
        implicitWait bize sayfanin yuklenmesi ve sayfadaki elementlere ulasim icin beklenecek
        MAXİMUM sureyi belirleme olanagi tanir

        OZEL NOT(ARKADAS NOTU) ÖNEMLİİİ!!!!!!!!!!!!!!!!1
        //implicity, çalısmıyorsa beklemez kapanır.diyelim ki 5 sn de acildi acmak istedigimiz site,implicitly
        15 sn diye beklemez(hemen arkasindan driver.close varsa kapanir acildigi anda..
        //thread.sleep çalışsada çalısmasada verdiginiz saniye kadar bekler.
         */
        /*
        driver.close() la ,driver quit arasindaki fark sudur.bir sayfada 4 farkli sekme varsa,close dendiginde
        sadece en son acilan kapanir,hepsini kapatmak istiyorsak driver.quit() deriz
         */


    }
}
