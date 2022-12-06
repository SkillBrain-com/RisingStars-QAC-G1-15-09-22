import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class TablePageTests {
    public static void main(String[] args) {
        ChromeDriver driver = BrowserManager.createDriver();
        TablePageManager tablePage = new TablePageManager("https://testpages.herokuapp.com/styled/tag/dynamic-table.html",driver);

        System.out.println(tablePage.checkPage());
        System.out.println(tablePage.getTableTitle());
        System.out.println(tablePage.getTableData());

        tablePage.clickTableData();
        System.out.println(tablePage.changeTableTitle("New Title"));

        List<String> name = new ArrayList<>();
        name.add("Maria");
        name.add("Ion");
        name.add("George");

        List<Integer> age = new ArrayList<>();
        age.add(1);
        age.add(2);
        age.add(3);

        String jsonFormated = tablePage.createJson(name,age);
        System.out.println(jsonFormated);
        tablePage.changeTableData(jsonFormated);

        tablePage.changeTableId("newId");

        BrowserManager.closeChromeDriver(driver);
    }
}
//1.sa modificati metoda de getTableData astfel incat sa primesc ca si parametru id-ul din html si sa caute elemntele dupa el
//2.la fel  pentru getTableTitle
