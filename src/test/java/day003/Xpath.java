package day003;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Xpath {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // 2- Add Element butonuna basin
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[@onclick='addElement()']")).click();
        driver.findElement(By.xpath("//*[text()='Add Element']")).click(); //xpath de text ile locate alma
        /*
        Locate alirken sadece text kullanicaksak //*[text()='Add Element' bu format kullanilir.
        Atribute kullanicaksak "//*[@onclick='addElement()']" bu format kullanilir.
         */

        // Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteButon= driver.findElement(By.xpath("//*[@class='added-manually']"));
        if (deleteButon.isDisplayed()){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAİLED");

        // Delete tusuna basin
        Thread.sleep(3000);
        deleteButon.click();

        // “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement =driver.findElement(By.xpath("//h3"));
        //WebElement addRemoveElement =driver.findElement(By.xpath("//*[text()='Add/Remove Elements']")); boylede
                                                                                // yapilir.text ile

        if (addRemoveElement.isDisplayed()){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAİLED");

        //sayfayi kapatiniz.
        driver.close();
        /*
     https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
     2- Add Element butonuna 10 kez basin
     3-10 kez Add element butonuna basilgini test ediniz
     4-Delete butonuna gorunmeyene dek basiniz
     5-Delete butonu’nun gorunmedigini test ediniz
     6-sayfayi kapatiniz.

     */
    }
}
