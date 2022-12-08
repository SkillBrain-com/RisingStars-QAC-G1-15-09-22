import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.Json;

import java.util.ArrayList;
import java.util.List;

public class TablePageManagement {
    private static String url; //pagina pe care lucram
    private static ChromeDriver driver = null;// salvam instanta de chrome pe care o vom folosi in toate metodele
    private static String primulTableId;


    TablePageManagement(String url, ChromeDriver driver){   //constructorul
        this.url= url;
        this.driver = driver;
        driver.get(url);
        this.primulTableId = "dynamictable";
    }

    public static String checkPage(){
        WebElement pageParagraph = driver.findElement(By.className("explanation"));
        return pageParagraph.getText();
    }

  public static String getTableTitle(){
//        WebElement tableTitle = driver.findElement(By.cssSelector("#dynamictable caption"));
        WebElement tableTitle = driver.findElement(By.cssSelector("#"+getPrimulTableId()+" caption"));
        return tableTitle.getText();
    }

    public static List<String> getTableData(){
//        List<WebElement> tableRows = driver.findElements(By.cssSelector("#dynamictable ts"));
        List<WebElement> tableRows = driver.findElements(By.cssSelector("#"+getPrimulTableId()+" ts"));

        List<String> tableData = new ArrayList<>();
        for(WebElement elem:tableRows){
            tableData.add(elem.getText());
        }
        return tableData;
    }
    public static void clickTableData(){
        WebElement tableDataButon = driver.findElement(By.tagName("details"));
        tableDataButon.click();
        if (checkRefreshButtonAppears() == true)
            System.out.println("Table Data Button was cliket");
        else System.out.println("Table Data Button was not cliket");
    }
    public static boolean checkRefreshButtonAppears(){
        WebElement refreshTable = driver.findElement(By.id("refreshtable"));
        if (refreshTable.getText().equals("Refresh Table"))
            return true;
        else return false;
    }

    public static boolean changeTableTitle(String newTableTitle) {
        WebElement captionImput = driver.findElement(By.id("caption"));
        captionImput.click();
        captionImput.clear();
        captionImput.sendKeys(newTableTitle);
//        WebElement refreshTable = driver.findElement(By.id("refreshtable"));
//        refreshTable.click();
        clickRefreshButton();
        if (getTableTitle().equals(newTableTitle))
            return true;
        else return false;
    }

    private static void  clickRefreshButton(){
        WebElement refreshTable = driver.findElement(By.id("refreshtable"));
        refreshTable.click();
    }

    public static void changeTableId(String newTableId){
        WebElement tableIdInput = driver.findElement(By.id("tableid"));
        tableIdInput.click();
        tableIdInput.clear();
        tableIdInput.sendKeys(newTableId);
        clickRefreshButton();
        WebElement newIdCheck = driver.findElement(By.id(newTableId));
        System.out.println(newIdCheck.getText());

    }

    public static void  changeTableData(String newData){
        WebElement changeTableDataImput = driver.findElement(By.id("jsondata"));
        changeTableDataImput.click();
        changeTableDataImput.clear();
        changeTableDataImput.sendKeys(newData);
        clickRefreshButton();
        System.out.println(getTableData());
    }

    public static String createJson (List<String> name, List<Integer> age){
        String finalString = "[";
        for(int i = 0; i < name.size(); i++){
            finalString = finalString + "{\"name\" : \"%s\",\"age\" : %d },".formatted(name.get(i),age.get(i));
        }
        finalString = finalString.substring(0,finalString.length()-1);
        finalString = finalString + "]";
        return finalString;
    }
    public static String getPrimulTableId(){
        return primulTableId;
    }
    public static void setPrimulTableId(String primulTableId){
        TablePageManagement.primulTableId = primulTableId;
    }

}
