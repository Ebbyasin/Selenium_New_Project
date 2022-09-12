package day003;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class SinifCalismasi {

    public static void main(String[] args) throws InterruptedException {
        /*
        Main method oluşturun ve aşağıdaki görevi tamamlayın.
        a. http://a.testaddressbook.com adresine gidiniz.
        b. Sign in butonuna basin
        c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        i. Username : testtechproed@gmail.com
        ii. Password : Test1234!
        e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        3. Sayfada kac tane link oldugunu bulun.
         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        //1- http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        //2-Sign in butonuna basin
        driver.findElement(By.id("sign-in")).click();
        Thread.sleep(3000);
        /*
        bir kere kullanacaksak direk locate edip sonuna click diyebiliriz ama birden fazla kullanacaksak
         ber WebElement e atarak kullanabiiriz.
         */


        //3-email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailButton=driver.findElement(By.id("session_email"));
        WebElement passwordButton=driver.findElement(By.id("session_password"));
        WebElement signinButton=driver.findElement(By.name("commit"));

        //Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //Username : testtechproed@gmail.com
        //Password : Test1234!
        emailButton.sendKeys("testtechproed@gmail.com");
        Thread.sleep(3000);
        passwordButton.sendKeys("Test1234!");
        Thread.sleep(3000);
        signinButton.click();
        Thread.sleep(3000);
        /*
        yukarıda web element olusturdugumuz icin sadece isim. sendkseys ile yapabiliyoruz.
         */


        //4-Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        //---------------1.yol------------------------//
        WebElement expectedUser = driver.findElement(By.className("navbar-text"));
        if (expectedUser.isDisplayed()){
            System.out.println("Expecteduser testi PASSED: "+expectedUser.getText());
        }else {
            System.out.println("Expecteduser testi FAILED");
        }
        //--------------2.yol------------------------//
        String istenenUserYazisi="testtechproed@gmail.com";
        String actualUserYazisi=expectedUser.getText(); //gercekuser yazisi
        if (actualUserYazisi.equals(istenenUserYazisi)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }
        /*
        bir webelementin üzerin8deki yaziyi konsolda yazdırabilmek icin getText() methodu kullanilir.
         */


        //5-“Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adresses=driver.findElement(By.linkText("Addresses"));
        if (adresses.isDisplayed()){
            System.out.println(" Adresses testi PASSED");
        }else{
            System.out.println("Adresses testi FAILED");
        }
        WebElement signout=driver.findElement(By.linkText("Sign out"));
        if (signout.isDisplayed()){
            System.out.println("SignOut testi PASSED");
        }else{
            System.out.println("SignOut testi FAILED");
        }

        //6-Sayfada kac tane link oldugunu bulun.
        List<WebElement> link =driver.findElements(By.tagName("a"));
        System.out.println("a tag'i ile " + link.size() + "  tane link vardir");
        System.out.println(link);

        //4-)Linkleri yazdiriniz!
        for (WebElement each:link) {
            System.out.println("Linkler : "+each.getText());
        }
        //5-)Linkleri LAMBDA ile yazdiriniz.
        link.forEach(t-> System.out.println(t.getText()));

        //6-)Sayfayi kapatiniz
        driver.close();

    }
}
