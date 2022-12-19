import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class DemoqaManager {
    private String url;
    private static ChromeDriver driver = null;

    DemoqaManager(String url, ChromeDriver driver) {
        this.url = url;
        this.driver = driver;
        driver.get(url);
    }

    public static int selectTabElement(){
        List<WebElement> tabElement = driver.findElements(By.cssSelector("ul.menu-list"));
        List<String> nameTab =  new ArrayList<>();
        for(WebElement elem:tabElement){
            nameTab.add(elem.getText());
        }
        System.out.println(nameTab);
        WebElement textBox = tabElement.get(tabElement.size()-6);

        return tabElement.size()-6;

    }


}

//        List<String> nameTab =  new ArrayList<>();
//        for(WebElement elem:tabElement){
//            nameTab.add(elem.getText());
//        }
//
//        return nameTab;


// public static int selectTabElement() {
//        List<WebElement> tabElement = driver.findElements(By.cssSelector("ul.menu-list"));
//        WebElement textBox = tabElement.get(tabElement.size() - 6);
//        return tabElement.size() - 6;