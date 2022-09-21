package TestOdev;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Notlar1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("pencere olculeri :"+driver.manage().window().getSize());
        System.out.println("pencere konumu :"+driver.manage().window().getPosition());
        Thread.sleep(3000);

        driver.manage().window().setSize(new Dimension(900,600));
        driver.manage().window().setPosition(new Point(15,15));

        System.out.println("pencere olculeri :"+driver.manage().window().getSize());
        System.out.println("pencere konumu :"+driver.manage().window().getPosition());

        driver.close();
    }
}
