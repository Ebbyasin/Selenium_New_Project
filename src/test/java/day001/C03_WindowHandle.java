package day001;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_WindowHandle {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        System.out.println(driver.getWindowHandle());// CDwindow-C5145BF159D0A40C1686805C987F15B6
        // farklı pencereler arasında gezinebilmek için getWindowHandle() methodunu kullanırız
        //benzersiz olarak acilan window  a ait hashcode unu verir


        driver.close();
    }
}
