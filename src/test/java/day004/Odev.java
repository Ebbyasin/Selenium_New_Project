package day004;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Odev {

     /*
     https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
     2- Add Element butonuna 10 kez basin
     3-10 kez Add element butonuna basilgini test ediniz
     4-Delete butonuna gorunmeyene dek basiniz
     5-Delete butonu’nun gorunmedigini test ediniz
     6-sayfayi kapatiniz.

     */
     public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();

         //1-https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
         driver.get("https://the-internet.herokuapp.com/add_remove_elements");


     }
}
