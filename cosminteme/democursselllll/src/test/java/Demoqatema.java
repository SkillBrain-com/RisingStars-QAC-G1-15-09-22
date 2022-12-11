import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//cerinta 3
public class Demoqatema {

    public static void main(String[] args) throws InterruptedException {
        Browser.createDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");
        driver.manage().window().maximize();
        driver.findElement(By.id("item-0")).click();
        driver.findElement(By.id("userName")).sendKeys("Cosmin");
        driver.findElement(By.id("item-1")).click();
        WebElement checkbox = driver.findElement(By.cssSelector("label[for='tree-node-home']"));
        checkbox.click();
        if (checkbox.isSelected()) {
            System.out.println("checkbox selected");

        }else{
            System.out.println("checkbox not selected ");
        }

    }
}