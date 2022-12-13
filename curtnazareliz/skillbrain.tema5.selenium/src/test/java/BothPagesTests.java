import org.openqa.selenium.chrome.ChromeDriver;

public class BothPagesTests {
    public static void main(String[] args) {
        ChromeDriver driver = BrowserManager.createDriver();
    //    TestPagesHerokuappManager herokuapp = new TestPagesHerokuappManager("https://testpages.herokuapp.com/styled/index.html", driver);
        DemoqaManager demoqaPage = new DemoqaManager("https://demoqa.com/elements", driver);


//        herokuapp.goToTheFirstPage();
//
//        herokuapp.goToTheSecondPage();
//
//        herokuapp.goToTheThirdPage();
//
//        herokuapp.goToTheFourthPage();

        demoqaPage.selectTabElement();
        System.out.println(demoqaPage.selectTabElement());
        System.out.println("jhggg");


        // cand metoda este void putem returna direct in metoda. numai trebuia afisat si pe clasa de test.
        //cand are return afisam in clasa de test.

       // BrowserManager.closeChromeDriver(driver);

    }


}


