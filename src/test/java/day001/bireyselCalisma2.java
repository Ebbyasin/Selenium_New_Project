package day001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bireyselCalisma2 {

    public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver","src/resource/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize(); // acilan sayfayi buyutur..driver sonra yonet(manage),neyi :window
                                             //maximize et.
        //Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://amazon.com");

        //Sayfa basligini(title) yazdirin
        System.out.println("Actual Title :"+driver.getTitle());

        //Sayfa basliginin “Amazon” icerdigini test edin
        String istenenKelime = "Amazon";


    }
}
