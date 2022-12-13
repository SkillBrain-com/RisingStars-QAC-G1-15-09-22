import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.http.WebSocket;

public class BrowserManager {

    public static ChromeDriver createDriver() {       //creez metoda createDriver pt a crea/a deschide browserul driver (Google Chrome) pe care vom lucra si in care
        WebDriverManager.chromedriver().setup();     //WebDriver-ul face setarile browserului de Chrome  (chromedriver)
        return new ChromeDriver();                          //si returneaza instanta de ChromeDriver
    }

    public static void closeChromeDriver(ChromeDriver driver) {     //cream metoda prin care inchidem driverul si in care
    driver.quit();                                                  //apelam metoda de inchidere a browserului Chrome
    }


}
