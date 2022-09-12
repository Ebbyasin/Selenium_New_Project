package day002;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ManageMethodlari {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //Yeni bir Class olusturalim.C06_ManageWindow
        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");

        //Sayfanin konumunu ve boyutlarini yazdirin
        System.out.println("Pencere Konumu :"+driver.manage().window().getPosition()); //acilan browser in konumunu
                                                                                       // verir
        System.out.println("Pencere Olculeri :"+driver.manage().window().getSize()); // acilan browser in olculerini verir

        //Sayfayi simge durumuna getirin
        driver.manage().window().minimize(); //pencereyi simge durumuna getirir

        // simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        Thread.sleep(3000);
        driver.manage().window().maximize();
        //Sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        System.out.println("Yeni Pencere Konumu :"+driver.manage().window().getPosition());
        System.out.println("Yeni Pencere Olculeri :"+driver.manage().window().getSize());

        //Sayfayi fullscreen yapin
        Thread.sleep(3000);
        driver.manage().window().fullscreen();

        //Sayfanin konumunu ve boyutlarini fullscreen durumunda yazdirin
        System.out.println("FullScreen Pencere Konumu :"+driver.manage().window().getPosition());
        System.out.println("Fullscreen Pencere Olculeri :"+driver.manage().window().getSize());

        //Sayfayi kapatin
        Thread.sleep(3000);
        driver.close();

    }
}
