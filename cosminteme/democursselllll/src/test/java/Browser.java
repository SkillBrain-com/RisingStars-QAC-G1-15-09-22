import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

        public static ChromeDriver createDriver() {
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
    }
