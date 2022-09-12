package day001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) {


       // En temel haliyle otomasyon yapmak icin class'imiza otomasyon icin gerekli olan webdriver'in
        //yerini gostermemiz gerekir.
       // bunun icin java kutuphanesinde System.setProperty() methodunu kullaniriz.
        //ve methodun icine ilk olarak driver i yazariz.ikinci olarak onun fiziki yolunu kopyalariz.



        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println("Actual Title : "+driver.getTitle()); // gidilen sitenin basligini yazdirir.
        System.out.println("Actual Url "+driver.getCurrentUrl()); //gidilen sayfanin url sini getirir.

        System.out.println(driver.getPageSource());
        /*
        yorum icin iyi renk secmisiz
         */


    }
}
