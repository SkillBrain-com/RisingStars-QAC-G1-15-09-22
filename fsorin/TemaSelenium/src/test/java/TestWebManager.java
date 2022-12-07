import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestWebManager {
    public static void main(String[] args) throws InterruptedException {
        WebManager.createDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.manage().window().maximize();
        // exercitiul 1
        driver.navigate().to("https://testpages.herokuapp.com/styled/basic-web-page-test.html");
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().to("https://testpages.herokuapp.com/styled/attributes-test.html");
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().to("https://testpages.herokuapp.com/styled/find-by-playground-test.html");
        Thread.sleep(3000);
        driver.navigate().back();
        driver.navigate().to("https://testpages.herokuapp.com/styled/tag/table.html");
        Thread.sleep(3000);
        driver.navigate().back();

        // exercitiul 2
        driver.navigate().to("https://testpages.herokuapp.com/styled/basic-web-page-test.html");
        WebElement p = driver.findElement(By.xpath("/html/body/div/div[2]/child::*"));
        System.out.println(p.getText());
        WebElement p1 = driver.findElement(By.id("para1"));
        System.out.println(p1.getText());
        WebElement p2 = driver.findElement(By.id("para2"));
        System.out.println(p2.getText());
        driver.navigate().to("https://testpages.herokuapp.com/styled/attributes-test.html");
        WebElement p2page = driver.findElement(By.xpath("/html/body/div/div[2]/child::*"));
        System.out.println(p2page.getText());
        WebElement button = driver.findElement(By.className("styled-click-button"));
        button.click();
        driver.navigate().to("https://testpages.herokuapp.com/styled/find-by-playground-test.html");
        WebElement p3page = driver.findElement(By.xpath("//*[@id=\"div18\"]"));
        System.out.println(p3page.getText());
        WebElement p10 = driver.findElement(By.id("li11"));
        System.out.println(p10.getText());
        driver.navigate().to("https://testpages.herokuapp.com/styled/tag/table.html");
        WebElement p4page = driver.findElement(By.xpath("/html/body/div"));
        System.out.println(p4page.getText());
    }
}
