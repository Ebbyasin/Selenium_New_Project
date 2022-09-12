package day002;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        //amazonda nutella aratiniz
        //  WebElement aramaKutusu =  driver.findElement(By.id("twotabsearchtextbox"));// amazon sayifasinin arama motorunun adresini alip yapistirdik
        // aramaKutusu.sendKeys("Nutella" + Keys.ENTER);//arama motoruna nutella yazdirip enter'ladik
        //id uniqe oldugu icin sorunsuz calisti
        // WebElement aramaKutusu =  driver.findElement(By.name("field-keywords"));// amazon sayifasinin arama motorunun adresini alip yapistirdik
        // aramaKutusu.sendKeys("Nutella" + Keys.ENTER);//arama motoruna nutella yazdirip enter'ladik
        //id uniqe oldugu icin sorunsuz calisti
        /*
        bu locator calismayabilir
        Locater alirken gozden kacan detaylar olabilir
        aldigimiz bir locator calismazsa alternatif yollar denenebilir
         */
        // driver.findElement(By.linkText("Become an Affiliate")).click();// amazonda belirledigimiz bir linke gittik
        driver.findElement(By.partialLinkText(" an Affiliate")).click();// amazonda belirledigimiz bir linkten parca aldik ve  gittik
        driver.close();
    }
}
