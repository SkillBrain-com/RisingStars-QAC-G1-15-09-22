import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoQaTema {

    public static void main(String[] args) throws InterruptedException {
        WebManager.createDriver();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");
        driver.manage().window().maximize();
        Actions act = new Actions(driver);



        driver.findElement(By.id("item-0")).click();
        driver.findElement(By.id("userName")).sendKeys("Sorin");



        driver.findElement(By.id("item-1")).click();
        WebElement checkbox = driver.findElement(By.cssSelector("label[for='tree-node-home']"));
        checkbox.click();
        if (checkbox.isSelected()){
            System.out.println("Checkbox is selected");
        }
        else {
            System.out.println("Checkbox is not selected");
        }



        driver.findElement(By.id("item-2")).click();
        WebElement checkbox1 = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        checkbox1.click();
        if (checkbox1.isSelected()){
            System.out.println("Checkbox is selected");
        }
        else {
            System.out.println("Checkbox is not selected");
        }



        driver.findElement(By.id("item-3")).click();
        WebElement button = driver.findElement(By.cssSelector("#addNewRecordButton"));
        button.click();



        driver.findElement(By.id("item-4")).click();
        WebElement elementLocator = driver.findElement(By.cssSelector("#doubleClickBtn"));
        act.doubleClick(elementLocator).perform();



        driver.findElement(By.id("item-4")).click();
        WebElement ele = driver.findElement(By.cssSelector("#rightClickBtn"));
        act.contextClick(ele).perform();



        driver.findElement(By.id("item-4")).click();
        WebElement eleL = driver.findElement(By.cssSelector("#kWpsQ"));
        act.moveToElement(eleL).click().build().perform();



        driver.findElement(By.id("item-5")).click();
        WebElement eleLe = driver.findElement(By.cssSelector("#dynamicLink"));
        act.moveToElement(eleLe).click().build().perform();



        driver.findElement(By.id("item-6")).click();
        WebElement eleLel = driver.findElement(By.cssSelector("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/a[1]"));
        act.moveToElement(eleLel).click().build().perform();



        driver.findElement(By.id("item-7")).click();
        WebElement eleLele = driver.findElement(By.cssSelector("#downloadButton"));
        act.moveToElement(eleLele).click().build().perform();



        driver.findElement(By.id("item-8")).click();
        WebElement eleMe = driver.findElement(By.cssSelector("#colorChange"));
        Thread.sleep(6000);
        act.moveToElement(eleMe).click().build().perform();

    }
}
