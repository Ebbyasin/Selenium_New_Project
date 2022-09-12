package day001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_NavigateMethodlar {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://amazon.com");
        // driver.navigate().to() methodu ileri geri yapicaksak kullanilir.
        //driver.get() methodu gibi bizi istedigimiz url e goturur.
        driver.navigate().to("https://techproeducation.com");

        // Tekrar amazon sayfasina donelim.
        Thread.sleep(3000);
        driver.navigate().back();// bir onceki sayfaya geri doner

        // Tekrar techproed sayfasina gidelim.
        Thread.sleep(3000);
        driver.navigate().forward();// ilk sayfadan ileri gider

        //Techproed sayfasini yenileyelim
        Thread.sleep(3000);
        driver.navigate().refresh();

        // Son olarak sayfayi kapatiniz
        driver.close();

        /*
        ODEV

        Yeni bir package olusturalim : day01
        Yeni bir class olusturalim : C03_GetMethods
        Amazon sayfasina gidelim. https://www.amazon.com/
        Sayfa basligini(title) yazdirin
        Sayfa basliginin “Amazon” icerdigini test edin
        Sayfa adresini(url) yazdirin
        Sayfa url’inin “amazon” icerdigini test edin.
        Sayfa handle degerini yazdirin
        Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        Sayfayi kapatin.

        */



    }
}
