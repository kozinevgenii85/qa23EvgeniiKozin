package com.qa.trello;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver wd;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp(){
        wd = new ChromeDriver();
        wd.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
        wd.manage().window().maximize();
        wd.navigate().to("https://trello.com/");



    }

    public void confirmLogin(By locator) {
        wd.findElement(locator).click();
    }

    public void fillLoginForm(String userEmail, String userPassword) {
        type(By.cssSelector("input#user"), userEmail);
        type(By.cssSelector("input#password"), userPassword);
    }

    public void type(By locator, String text) {
        clickLogIn(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void clickLogIn(By locator) {
        confirmLogin(locator);
    }

    // @AfterMethod
     public void tearDown(){
         wd.quit();
     }

    public void initBoardCreation(By locator) {
        click(locator);
        click(locator);
    }

    public void fillBoardForm() {
        type(By.className("_23NUW98LaZfBpQ"), "111155");
    }

    public void confirmBoardCreation(By locator) {
        click(locator);
    }

    public void returnToHomePage(By locator) {
        click(locator);
    }

    public void confirmLogin(By locator) {
    wd.findElement(locator).click();

    }

    public void initLogin(By locator) {
        click(locator);
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }
}
