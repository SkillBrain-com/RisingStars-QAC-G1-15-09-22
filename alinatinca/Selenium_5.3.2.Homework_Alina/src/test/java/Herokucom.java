import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Herokucom {      //am creat clasa in care lucrez pe Heroku.com

//atributes
    private static String url;          //creez atributul url-ului, care este de fapt Heroku.com

    private static ChromeDriver driver = null;      //creez atributul driver de tip ChromeDriver prin care salvez instanta de Chrome pe care o folosesc in toate metodele din clasa


//constructor
    Herokucom (String url, ChromeDriver driver) {        //creez constructorul de tipul clasei care accepta ca parametrii, atributele create mai sus: url si browserul
    this.url = url;                                     //pe care ii initializez folosind this
    this.driver = driver;
    driver.get(url);                                    //pe browserul nostru apelam metoda de a naviga catre url
    }


//methods - in care scriem practic ce vrem sa testam -> nume_metoda

//Ex1 - 5.3.2.Locator Exercises
    public static void clickOnLink1 (){             //creez metoda care imi cauta primul link de pe url si da clic pe el
    WebElement Link1 = driver.findElement(By.cssSelector("a[id='basicpagetest']"));
    Link1.click();
    }


    public static void clickOnLink2 (){           //creez metoda care imi cauta cel 2- doilea link de pe url si da clic pe el
    WebElement Link2 = driver.findElement(By.cssSelector("a[id='elementattributestest']"));
    Link2.click();
    }


    public static void clickOnLink3 (){        //creez metoda care imi cauta cel deal 3- link de pe url si da clic pe el
    WebElement Link3 = driver.findElement(By.cssSelector("#findbytest"));
    Link3.click();
    }

    public static void clickOnLink4TableTestPage(){         //creez metoda care imi cauta cel deal 4- link de pe url si da clic pe el
    WebElement Link4TableTestPage = driver.findElement(By.id("tablestest"));
    Link4TableTestPage.click();
    }


    public static void clickOnLink4DynamicTable() {         //creez metoda care imi cauta cel deal 4- link de pe url si da clic pe el
        WebElement Link4TDynamicTable = driver.findElement(By.id("dynamictablestest"));
        Link4TDynamicTable.click();
    }

//Ex2 - 5.3.2.Locator Exercises
    public static String checkLink1(){                  //creez metoda care imi cauta paragraful din Link1 si il afiseaza la consola
    WebElement showParagraphLink1 = driver.findElement(By.cssSelector(".explanation"));
    return showParagraphLink1.getText();
    }

    public static String checkLink2FirstParagraph(){            //cream o metoda care verifica daca gaseste primul paragraf din Link2 si afiseasa la consola
        WebElement showFirstParagraphLink2 = driver.findElement(By.cssSelector(".explanation"));
        return showFirstParagraphLink2.getText();
    }

    public static String checkLink2SecondPragraph(){            //cream o metoda care verifica daca gaseste al 2-lea paragraf din Link2 si afiseaza textul la consola
        WebElement showSecondParagraphLink2 = driver.findElement(By.cssSelector("h2 + .inline-explanation"));
        return showSecondParagraphLink2.getText();
    }


    public static String checkLink2ThirdPragraph(){         //cream o metoda care verifica daca gaseste al 3-lea paragraf din Link2 si afiseaza textul la consola
        WebElement showThirdParagraphLink2 = driver.findElement(By.cssSelector("script + .inline-explanation"));
        return showThirdParagraphLink2.getText();
    }

    public static void checkLink2Buttom(){              //cream o metoda care verifica daca gaseste butonul de pe Link2 si da clic pe buton
        WebElement addAnotherAttributeButtom = driver.findElement(By.cssSelector(".styled-click-button"));
        addAnotherAttributeButtom.click();
    }


    public static String checkLink3(){
        WebElement showParagraphLink3 = driver.findElement(By.cssSelector(".explanation"));
        return showParagraphLink3.getText();
    }

//    de revenit
    public static String clickOnLink4TableTestPageParagraph() {
        WebElement paragraphTableTestPage = driver.findElement(By.cssSelector(".explanation"));
        return paragraphTableTestPage.getText();
    }


    public static String clickOnLink4DynamicTableParagraph() {
        WebElement paragraphDynamicTable = driver.findElement(By.className("explanation"));
        return paragraphDynamicTable.getText();
    }


    public static String showTableLink4TableTestPageParagraph() {
        WebElement table = driver.findElement(By.id("mytable"));
        return table.getText();
    }

    public static String showTableLink4DynamicTableParagraph() {
        WebElement table = driver.findElement(By.id("dynamictable"));
        return table.getText();
    }

    public static void clickOnTableDataLink4DynamicTableParagraph() {
        WebElement showTableData = driver.findElement(By.tagName("details"));
        showTableData.click();
    }

    private static void clickRefreshButton() {
        WebElement refreshTable = driver.findElement(By.id("refreshtable"));
        refreshTable.click();
    }

    public static void changeTableId(){
        WebElement newCaptionInput = driver.findElement(By.id("caption"));
        newCaptionInput.click();
        newCaptionInput.clear();
        newCaptionInput.sendKeys("new Caption");
        clickRefreshButton();
        WebElement newIdInput = driver.findElement(By.id("tableid"));
        newIdInput.click();
        newIdInput.clear();
        newIdInput.sendKeys("new Id");
        clickRefreshButton();
    }

}
