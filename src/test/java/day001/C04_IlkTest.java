package day001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_IlkTest {

    public static void main(String[] args) {
        /*
        1-Amazon sayfasina gidiniz.
        2-Basligin "Amazon" icerdigini test ediniz.
        3-Url nin amazon icerdigini test ediniz.
        4-Sayfayi kapatiniz
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //1-Amazon sayfasina gidiniz.

        driver.get("https://amazon.com");

        //2-Basligin "Amazon" icerdigini test ediniz.
        String actualTitle= driver.getTitle();
        String istenenKelime="Amazon";
        if (actualTitle.contains(istenenKelime)){
            System.out.println("Title testi PASSED");
        }
        //3-Url nin amazon icerdigini test ediniz.
        String actualUrl =driver.getCurrentUrl();
        String arananKelime="amazon";
        if (actualUrl.contains(arananKelime)){
            System.out.println("Url testi PASSED");
        }else System.out.println("Url testi FAİLED");

        //4-Sayfayi kapatiniz
        driver.close();
    }
}
