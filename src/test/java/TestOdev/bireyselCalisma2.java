package TestOdev;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bireyselCalisma2 {
               // Mehmet bulutluoz hocanin derslerinden...notlar..
    //ilkel yollarla bir proje yaptigimizda her proje icin jar dosyalarini indirmek ve yuklemek zorundayiz..
    //yazilim testi Expected Result ile Actual Result un karsilastirilmasindan ibarettir.
    //manuel tester=functional demektir.
    //once manuel test yapilmali muhakkak.buglar oyle gorulmeli.yani functional test yapilmali
    //stlc=bir bug bulundugun da izlenecek surec,yapilacak isler ,paylasimlar
    //selenium ile web uygulamalarini test ederiz,performans testleri ve captcha(ben robot degilim)
    // selenium ile yapilamaz

    public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize(); // acilan sayfayi buyutur..driver sonra yonet(manage),neyi :window
                                             //maximize et.
        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");

        //Sayfa basligini(title) yazdirin
        System.out.println("Actual Title :"+driver.getTitle());

        //Sayfa basliginin “Amazon” icerdigini test edin
        String istenenKelime = "Amazon";

        driver.close();


    }
}
