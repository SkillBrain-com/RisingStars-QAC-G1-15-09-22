import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {

    public static void main(String[] args) {
        ChromeDriver driver = BrowserManager.createDriver();    //cream instanta de Chrome (driver) folosita de chrome driver, adica ne deschidem un browser

        //Ex 1 si 2 din 5.3.2.Locator Exercises
//        Herokucom herokucom = new Herokucom("https://testpages.herokuapp.com/styled/index.html", driver);   //apelam constructorul Herokucom (adica ne cream obiectul paginii Herokucom) avand nevoie de url respectiv si de browser

//        herokucom.clickOnLink1();               //testez daca se deschide primul link de pe pagina url Herokucom (testez ce face metoda clickOnLink1())
//        driver.navigate().back();               //revenim la url de baza
//        herokucom.clickOnLink2();               //testez daca se deschide al 2-lea link de pe pagina url Herokucom (testez ce face metoda clickOnLink2())
//        driver.navigate().back();                //revenim la url de baza
//        herokucom.clickOnLink3();               //testez daca se deschide al 3-lea link de pe pagina url Herokucom (testez ce face metoda clickOnLink3())
//        driver.navigate().back();               //revenim la url de baza
//        herokucom.clickOnLink4TableTestPage();   //testez daca se deschide primul link din al 4-lea link de pe pagina url Herokucom (testez ce face metoda clickOnLink4TableTestPage())
//        driver.navigate().back();                    //revenim la url de baza
//        herokucom.clickOnLink4DynamicTable();       //testez daca se deschide al doilea link din al 4-lea link de pe pagina url (testez ce face metoda clickOnLink4DynamicTable())
//        driver.navigate().back();                       //revenim la url de baza
//        herokucom.clickOnLink1();                       //clic pe primul Link1
//        System.out.println(herokucom.checkLink1());     //testez daca afiseaza textul din paragraful din Link1
//        driver.navigate().back();                      //revenim la url de baz
//        herokucom.clickOnLink2();                       //clic pe Link2
//        System.out.println(herokucom.checkLink2FirstParagraph());     //testez daca afiseaza textul din paragraful din Link2
//        driver.navigate().back();
//        herokucom.clickOnLink2();
//        System.out.println(herokucom.checkLink2SecondPragraph());
//        driver.navigate().back();
//        herokucom.clickOnLink2();
//        System.out.println(herokucom.checkLink2ThirdPragraph());
//        driver.navigate().back();
//        herokucom.clickOnLink2();
//        driver.navigate().back();
//        herokucom.checkLink2Buttom();
//        driver.navigate().back();
//        herokucom.clickOnLink3();
//        System.out.println(herokucom.checkLink3());
//        driver.navigate().back();
//        herokucom.clickOnLink4TableTestPage();
//        System.out.println(herokucom.clickOnLink4TableTestPageParagraph());
//        driver.navigate().back();
//        herokucom.clickOnLink4DynamicTable();
//        System.out.println(herokucom.clickOnLink4DynamicTableParagraph());
//        driver.navigate().back();
//        herokucom.clickOnLink4TableTestPage();
//        System.out.println(herokucom.showTableLink4TableTestPageParagraph());
//        driver.navigate().back();
//        herokucom.clickOnLink4DynamicTable();
//        System.out.println(herokucom.showTableLink4DynamicTableParagraph());
//        herokucom.clickOnTableDataLink4DynamicTableParagraph();
//        herokucom.changeTableId();

        //Ex. 3 din 5.3.2. Locator Exercies
        Demoqacom demoqacom = new Demoqacom("https://demoqa.com", driver);     //apelam constructorul Demoqacom (adica ne cream obiectul paginii Demoqacom) avand nevoie de url respectiv si de browser

        driver.get("https://demoqa.com/elements");
        demoqacom.checkTextBox();
        demoqacom.checkCheckBox();
        demoqacom.checkRadioButton();
        demoqacom.checkWebTables();
        demoqacom.checkButtons();

        demoqacom.checkLinks();

        demoqacom.checkBrokenLinksImages();    //nu ruleaza

        demoqacom.checkUploadAndDownload();     //nu ruleaza

        demoqacom.checkDynamicProperties();



        BrowserManager.closeChromeDriver(driver);       //iesim de pe browser, apeland metoda closeChromeDriver(driver) initializata in instanta BrowserManager
    }
    }
