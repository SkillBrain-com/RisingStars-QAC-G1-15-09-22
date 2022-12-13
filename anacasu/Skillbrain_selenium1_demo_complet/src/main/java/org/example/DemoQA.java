package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQA implements Selectors{

    private static String url; // pagina pe care lucram
    private static ChromeDriver driver = null; // salvam instanta de chrome pe care o vom folosi in tate emtodele din clasa


    public DemoQA(String url, ChromeDriver driver) // constructor
    {
        this.url = url;
        this.driver = driver;
        driver.get(url);
    }

    public void clickTextBoxLink(){
        WebElement textBox = driver.findElement(By.xpath(clickTextBoxLinkXPath));
        textBox.click();
    }

    public void fillTextBoxPage(String fullName,String email,String currentAddress,String permanentAddress){
        WebElement fullNameInput = driver.findElement(By.id("userName"));
        WebElement emailInput = driver.findElement(By.id("userEmail"));
        WebElement currentAddressInput = driver.findElement(By.id("currentAddress"));
        WebElement permanentAddressInput = driver.findElement(By.id("permanentAddress"));
        fullNameInput.click();
        fullNameInput.clear();
        fullNameInput.sendKeys(fullName);
        emailInput.click();
        emailInput.clear();
        emailInput.sendKeys(email);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
        currentAddressInput.click();
        currentAddressInput.clear();
        currentAddressInput.sendKeys(currentAddress);
        permanentAddressInput.click();
        permanentAddressInput.clear();
        permanentAddressInput.sendKeys(permanentAddress);
        permanentAddressInput.sendKeys(Keys.TAB);

        WebElement submitButton = driver.findElement(By.id("submit"));
//        submitButton.click();
        submitButton.sendKeys(Keys.ENTER);
    }

    public void checkTextBoxPage(){
        WebElement nameOutput = driver.findElement(By.id("name"));
        WebElement emailOutput = driver.findElement(By.id("email"));
        WebElement addressOutput = driver.findElement(By.cssSelector("#output #currentAddress"));
        WebElement permanentAddressOutput = driver.findElement(By.cssSelector("#output #permanentAddress"));
        System.out.println("Name output : %s .Email output: %s.Address output : %s.Permanent address output: %s".formatted(
                nameOutput.getText(),emailOutput.getText(),addressOutput.getText(),permanentAddressOutput.getText()));

    }
}
