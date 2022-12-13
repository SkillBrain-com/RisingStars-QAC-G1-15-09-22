import org.example.BrowserManager;
import org.example.DemoQA;
import org.example.InputData;
import org.example.TablePageManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.Collections;

import static org.testng.Assert.assertEquals;

public class TablePageTests implements InputData {

    public static void main(String[] args) {
        //        ChromeDriver driver = org.example.BrowserManager.createDriver();
//        org.example.TablePageManager tablePage = new org.example.TablePageManager(url,driver);
//
//        System.out.println(tablePage.checkPage());
//        System.out.println(tablePage.getTableTitle());
//        System.out.println(tablePage.getTableData());
//
//        tablePage.clickTableData();
//        System.out.println(tablePage.changeTableTitle("New Title"));
//        tablePage.changeTableId("newId");
//
//        Collections.addAll(name,"Maria","Ion","George");
//        Collections.addAll(age,1,2,3);
//
//
//        String jsonFormated = tablePage.createJson(name,age);
//        System.out.println(jsonFormated);
//        tablePage.changeTableData(jsonFormated);
//
//
//        org.example.BrowserManager.closeChromeDriver(driver);

        ChromeDriver driver = BrowserManager.createDriver();
        DemoQA demoqa = new DemoQA(url_demoqa,driver);
        demoqa.clickTextBoxLink();
        demoqa.fillTextBoxPage("ana casu","bla@test.com","adress","permanent address");
        demoqa.checkTextBoxPage();

        BrowserManager.closeChromeDriver(driver);

    }

    }


