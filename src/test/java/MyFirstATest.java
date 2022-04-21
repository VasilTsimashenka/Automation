//import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstATest {
//    @Test
//    public void openPage() {
////        Selenide.open("http://automationpractice.com/index.php");
//        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Acer\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//        WebDriver driver = new FirefoxDriver();
//        driver.get("http://automationpractice.com/index.php");
//    }
    @Test
    public void openPage2() {
//        Selenide.open("http://automationpractice.com/index.php");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

    }

    public static void main(String[] args) {
        System.out.println();
    }

}
