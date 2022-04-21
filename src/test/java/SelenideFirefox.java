import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class SelenideFirefox {
    @Test
    public void openPage() {
        System.setProperty("selenide.browser", "firefox");
        Selenide.open("http://automationpractice.com/index.php");
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
