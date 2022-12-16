import org.openqa.selenium.By;
<<<<<<< HEAD
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;
=======
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
>>>>>>> c649c06b8f87d1d53606b773da6ec87a01899c34

public class Demoqacom {            //am creat clasa in care lucrez pe Demoqa.com

//atributes

    private static String url;                      //creez atributul url-ului, care este de fapt Demoqa.com
    private static ChromeDriver driver = null;  //creez atributul driver de tip ChromeDriver prin care salvez instanta de Chrome pe care o folosesc in toate metodele din clasa


//constructor

    Demoqacom (String url, ChromeDriver driver){        //creez constructorul de tipul clasei care accepta ca parametrii, atributele create mai sus: url si browserul
        this.url = url;                                 //pe care ii initializez folosind this
        this.driver = driver;
    }


//methods

<<<<<<< HEAD
    public void checkTextBox(String fullNameInput, String EmailInput, String currentAddressInput, String permanentAddressInput) {   //creez o metoda care gaseste sectiunea TextBox si completeaza toate campurile din ea cu datele pe care le introducem
        WebElement TextBox = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[1]"));  //gaseste TextBox
        TextBox.click();        //da click
        WebElement fullNameButton = driver.findElement(By.id("userName"));      //gaseste FullName
        WebElement EmailButton = driver.findElement(By.id("userEmail"));        //gaseste Email
        WebElement currentAddress = driver.findElement(By.id("currentAddress"));      //gaseste currentAddress
        WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));    //gaseste permanentAddress
        fullNameButton.click();     //da clic pe FullName
        fullNameButton.clear();     //sterge in campul FullName
        fullNameButton.sendKeys(fullNameInput);     //introduce un fullname
        fullNameButton.sendKeys(Keys.TAB);  //da tab
        EmailButton.click();        //da clic pe email
        EmailButton.clear();        //sterge in campul Email
        EmailButton.sendKeys(EmailInput);       //introduce un email
        EmailButton.sendKeys(Keys.TAB); //da tab
        JavascriptExecutor js = (JavascriptExecutor) driver;        //face scroll la pagina
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        currentAddress.click();     //da clic pe currentAddress
        currentAddress.clear();     //sterge din campul Email
        currentAddress.sendKeys(currentAddressInput);       //introduce o adresa curenta
        currentAddress.sendKeys(Keys.TAB); //da tab
        permanentAddress.click();       //da clic pe permanentAddress
        permanentAddress.clear();       //sterge din campul permanentAddress
        permanentAddress.sendKeys(permanentAddressInput);       //introduce o adresa permanenta
        permanentAddress.sendKeys(Keys.TAB); //da tab
        WebElement submitButton = driver.findElement(By.id("submit"));     //gaseste butonul de submit
        submitButton.sendKeys(Keys.ENTER);       //da ENTER pe submit
    }

=======
    public static void checkTextBox() {            //cream o metoda care verifica primul element din lista Elemets -> TextBox
        WebElement TextBox = driver.findElement(By.xpath("//ul[@class='menu-list']/li"));
        TextBox.click();            // da clic pe TextBox
        WebElement fullNameButton = driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-12']/input"));       //gaseste sectiunea de Full Name
        fullNameButton.click();             //da clic pe ea
        fullNameButton.sendKeys("Tinca Georgiana Alina");       //introduce numele
        fullNameButton.sendKeys(Keys.ENTER);            //da enter
        WebElement EmailButton = driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));   //gaseste sectiunea Email
        EmailButton.click();                //da clic pe ea
        EmailButton.sendKeys("tincageorgianaalina@gmail.com");      //introduce e-mailul
        EmailButton.sendKeys(Keys.ENTER);       //da enter
        WebElement currentAddress = driver.findElement(By.cssSelector("textarea[placeholder='Current Address']"));    //gaseste sectiunea Current Address
        currentAddress.click();
        currentAddress.sendKeys("Bucuresti,Romania");
        currentAddress.sendKeys(Keys.ENTER);
        WebElement permanentAddress = driver.findElement(By.cssSelector("textarea[id='permanentAddress']"));   //gaseste sectiunea Permanent Address
        permanentAddress.click();
        permanentAddress.sendKeys("Romania");
        permanentAddress.sendKeys(Keys.ENTER);
}
>>>>>>> c649c06b8f87d1d53606b773da6ec87a01899c34

    public static void checkCheckBox() {                         //cream o metoda care verifica  urmatorul element din Elements -> Check Box
        WebElement CheckBox = driver.findElement(By.cssSelector("#item-1"));   //gaseste elementul Home
        CheckBox.click();   //da clic pe el
        WebElement minCheckBox = driver.findElement(By.cssSelector(".rct-checkbox svg[stroke='currentColor']"));        //gaseste casuta
        minCheckBox.click();   //da clic pe ea
    }

    public static void checkRadioButton() {        //cream o metoda care verifica  urmatorul element din Elements -> Radio Button
        WebElement RadioButton = driver.findElement(By.cssSelector("#item-2"));    //gaseste elementul Radio Button
        RadioButton.click();
        WebElement yesRadio = driver.findElement(By.cssSelector("label[for='yesRadio']")); //gaseste sectiunea Yes
        yesRadio.click();       //da clic pe ea
    }

<<<<<<< HEAD
    public static void checkWebTables() {           //cream o metoda care verifica  urmatorul element din Elements -> Web Tables si realizeaza operatii precum modificarea, stergerea sau adaugarea unor date
=======
    public static void checkWebTables() {           //cream o metoda care verifica  urmatorul element din Elements -> Web Tables
>>>>>>> c649c06b8f87d1d53606b773da6ec87a01899c34
        WebElement WebTables = driver.findElement(By.cssSelector("#item-3"));               //gaseste elementul Web Tables
        WebTables.click();
        WebElement AddButton = driver.findElement(By.cssSelector("#addNewRecordButton"));       //gaseste elementul Add (creeaza nou rand si introduce noi date)
        AddButton.click();
        WebElement firstNameButton = driver.findElement(By.cssSelector("input[placeholder='First Name']"));     //gaseste elementul First Name
        firstNameButton.click();
        firstNameButton.sendKeys("Alina Georgiana");
        WebElement lastNameButton = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));   //gaseste elementul Last Name
        lastNameButton.click();
        lastNameButton.sendKeys("Tinca");
        WebElement emailButton = driver.findElement(By.cssSelector("input[placeholder='name@example.com']"));  //gaseste elementul Email
        emailButton.click();
        emailButton.sendKeys("tincageorgianaalina@gmail.com");
        WebElement ageButton = driver.findElement(By.cssSelector("input[placeholder='Age']"));      //gaseste elementul Age
        ageButton.click();
        ageButton.sendKeys("28");
        WebElement salaryButton = driver.findElement(By.cssSelector("input[placeholder='Salary']"));  //gaseste elementul Salary
        salaryButton.click();
        salaryButton.sendKeys("6000");
        WebElement departmentButton = driver.findElement(By.cssSelector("input[id='department']"));     //gaseste elementul Department
        departmentButton.click();
        departmentButton.sendKeys("Automated QA Engineer");
        WebElement SubmitButton = driver.findElement(By.cssSelector("button[id='submit']"));            //gaseste butonul de Submit
        SubmitButton.click();
        WebElement deleteButton = driver.findElement(By.cssSelector(" span[id='delete-record-4']"));     //gaseste iconul Bin (si sterge randul 4 adaugat anterior)
        deleteButton.click();
        WebElement editButton = driver.findElement(By.cssSelector("span[id='edit-record-2']"));         //gaseste iconul Edit (si editeaza al 3-lea rand cu date noi)
        editButton.click();
        WebElement editFirstNameButton = driver.findElement(By.cssSelector("input[value='Alden']"));  //gaseste numele Alden de la sectiunea First Name
        editFirstNameButton.click();
        editFirstNameButton.clear();                                                                    //sterge numele initial
        editFirstNameButton.sendKeys("Amalia");                                             //si introduce nume nou
        WebElement editLastNameButton = driver.findElement(By.cssSelector("input[value='Cantrell']"));  //gaseste numele Cantrell de la sectiunea  Last Name
        editLastNameButton.click();
        editLastNameButton.clear();                                                                     //sterge numele initial
        editLastNameButton.sendKeys("Don");                                                 //si introduce nume nou
        WebElement editEmailButton = driver.findElement(By.cssSelector(" input[value='alden@example.com']"));       //gaseste alden@example.com de la sectiunea Email
        editEmailButton.click();
        editEmailButton.clear();                                                                            //sterge emailul initial
        editEmailButton.sendKeys("don.amalia@test.com");                                        //si introduce email nou
        WebElement editAgeButton = driver.findElement(By.cssSelector(" input[value='45']"));            //gaseste 45 de la sectiunea Age
        editAgeButton.click();
        editAgeButton.clear();                                                                              //sterge varsta initiala
        editAgeButton.sendKeys("36");                                                            //si introduce varsta  noua
        WebElement editSalaryButton = driver.findElement(By.cssSelector("input[value='12000']"));           //gaseste 12000 de la sectiunea Salary
        editSalaryButton.click();
        editSalaryButton.clear();                                                                           //si sterge salariul initial
        editSalaryButton.sendKeys("36000");                                                     //si introduce nou salariu
        WebElement verifySalaryButton = driver.findElement(By.cssSelector("input[value='Compliance']"));   //gaseste Compliance de la sectiunea Department
        verifySalaryButton.click();
        WebElement editSubmitButton = driver.findElement(By.cssSelector("button[type='submit']"));          //gaseste butonul de Submit
        editSubmitButton.click();
        WebElement TypeToSearchButton = driver.findElement(By.cssSelector("input[placeholder='Type to search']"));  //gaseste elementul Type to search (pt a cauta numele Amalia care tocmai ce a fost editat)
        TypeToSearchButton.click();
        TypeToSearchButton.sendKeys("Amalia");                                  //si introduce Amalia
        TypeToSearchButton.sendKeys(Keys.ENTER);                                            //da enter
    }

    public static void checkButtons() {                 //cream o metoda care verifica urmatorul element din Elements -> Buttons
<<<<<<< HEAD
        WebElement Buttons = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[5]"));   //gaseste elementul Buttons
        Buttons.click();
        WebElement ClickMeButtons = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button"));     //gaseste butonul Click Me
        ClickMeButtons.click();
        System.out.println(ClickMeButtons.getText());
    }

    public static void checkLinks(){                    //cream o metoda care verifica urmatorul element din Elements -> Links
        WebElement Links = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[6]"));                                //gaseste elementul Links
        Links.click();
        WebElement CreatedLink = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/p[3]/a"));   //gaseste al treilea link
        CreatedLink.click();
        driver.get("https://demoqa.com/links");

    }

    public static void checkBrokenLinksImages() {            //cream o metoda care verifica urmatorul element din Elements -> BrokenLinks
        WebElement BrokenLinksImages = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[7]/span")); //gaseste elementul BrokenLinks
        BrokenLinksImages.click();
        WebElement BrokenLink = driver.findElement(By.xpath("//a[@href='http://the-internet.herokuapp.com/status_codes/500']"));     //BrokenLinks
        JavascriptExecutor js = (JavascriptExecutor) driver;        //face scroll pe pagina
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
=======
        WebElement Buttons = driver.findElement(By.cssSelector("#item-4"));         //gaseste elementul Buttons
        Buttons.click();
        WebElement ClickMeButtons = driver.findElement(By.id("HnCy1"));     //gaseste butonul Click Me
        ClickMeButtons.click();
    }

    public static void checkLinks(){                    //cream o metoda care verifica urmatorul element din Elements -> Links
//        WebElement Links = driver.findElement(By.xpath("//li[@class='btn btn-light active']"));
        WebElement Links = driver.findElement(By.cssSelector("#item-5"));                              //gaseste elementul Links
        Links.click();
        WebElement HomeLinks = driver.findElement(By.cssSelector("a[id='dynamicLink']"));   //gaseste al doilea link
        HomeLinks.click();
        driver.get("https://demoqa.com/links");
        WebElement ForbiddenLinks = driver.findElement(By.cssSelector("#forbidden"));
        ForbiddenLinks.click();
        driver.get("https://demoqa.com/links");
    }

    public static void checkBrokenLinksImages() {            //cream o metoda care verifica urmatorul element din Elements -> BrokenLinks
//        WebElement BrokenLinksImages = driver.findElement(By.xpath("//li[@class='btn btn-light']"));
        WebElement BrokenLinksImages = driver.findElement(By.cssSelector("#item-6 "));    //gaseste elementul BrokenLinks
        BrokenLinksImages.click();
//        WebElement BrokenLink = driver.findElement(By.id("simpleLink"));     //gaseste ultimul Link -> BrokenLink
//        BrokenLink.click();
        WebElement BrokenLink = driver.findElement(By.xpath("//a[@href='http://the-internet.herokuapp.com/status_codes/500']"));     //BrokenLinks
>>>>>>> c649c06b8f87d1d53606b773da6ec87a01899c34
        BrokenLink.click();
        driver.get("https://demoqa.com/broken");
    }
    public static void checkUploadAndDownload(){         //cream o metoda care verifica urmatorul element din Elements -> UploadAndDownload
<<<<<<< HEAD
        JavascriptExecutor js = (JavascriptExecutor) driver;        //face scroll pe pagina
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        WebElement UploadAndDownload = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[8]/span"));  //gaseste elementul UploadAndDownload
=======
        WebElement UploadAndDownload = driver.findElement(By.cssSelector("#item-7"));                      //gaseste elementul UploadAndDownload
>>>>>>> c649c06b8f87d1d53606b773da6ec87a01899c34
        UploadAndDownload.click();
        WebElement DownloadButton = driver.findElement(By.cssSelector("a[id='downloadButton']"));           //gaseste butonul Download
        DownloadButton.click();                                                                             //da clic si automat se descarca imaginea
    }

    public static void checkDynamicProperties() {       //cream o metoda care verifica urmatorul element din Elements -> Dynamic Proprieties
<<<<<<< HEAD
        JavascriptExecutor js = (JavascriptExecutor) driver;        //face scroll pe pagina
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        WebElement DynamicProprieties = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div/ul/li[9]/span"));   //gaseste elementul Dynamic Proprieties
=======
        WebElement DynamicProprieties = driver.findElement(By.cssSelector("#item-8"));                        //gaseste elementul Dynamic Proprieties
>>>>>>> c649c06b8f87d1d53606b773da6ec87a01899c34
        DynamicProprieties.click();
        WebElement ColorChangeButton = driver.findElement(By.cssSelector("button[id='colorChange']"));     //gaseste butonul Color Change
        ColorChangeButton.click();
    }

}
