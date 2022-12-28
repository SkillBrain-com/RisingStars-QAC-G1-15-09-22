import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class TablePageTest {
    public static void main(String[] args) {
        ChromeDriver driver = BrowserManager.createDriver();
        TablePageManagement tablePage = new TablePageManagement("https://testpages.herokuapp.com/styled/tag/dynamic-table.html",driver);
        System.out.println(tablePage.checkPage());
        System.out.println(tablePage.getTableTitle());
        System.out.println(tablePage.getTableData());
        tablePage.clickTableData();
        System.out.println(TablePageManagement.changeTableTitle("New Title"));
        TablePageManagement.changeTableId("newId");
        List<String> name = new ArrayList<>();
        name.add("Maria");
        name.add("Ion");
        name.add("Geroge");
        List<Integer> age = new ArrayList<>();
        age.add(1);
        age.add(2);
        age.add(3);
        String jsonFormated = TablePageManagement.createJson(name, age);
        System.out.println(jsonFormated);
        TablePageManagement.changeTableData(jsonFormated);

        BrowserManager.closeCromeDriver(driver);
    }

}
