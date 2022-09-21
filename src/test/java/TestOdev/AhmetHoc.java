package TestOdev;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AhmetHoc {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        /*
    Amazon sayfasina gidiniz
    Arama kutusunu locate ediniz
    Arama kutusunun tagName'inin input oldugunu test ediniz.
    Arama kutusunun name atributu'nun field-keywords oldugunu test ediniz.
     */
        driver.get("https://amazon.com");
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        String expectedTagName="input";
        String actualTagName=aramaKutusu.getTagName();

        if (expectedTagName.equals(actualTagName)){
            System.out.println("Tag name passed");
        }else{
            System.out.println("Tag name failed");
        }

        String expectedNameDegeri="field-keywords";
        String actualNameDegeri=aramaKutusu.getAttribute("name");

        if (expectedNameDegeri.equals(actualNameDegeri)){
            System.out.println("nameDegeri testi passed");
        }else {
            System.out.println("nameDegeri testi failed");
        }
        driver.close();



    }
}
