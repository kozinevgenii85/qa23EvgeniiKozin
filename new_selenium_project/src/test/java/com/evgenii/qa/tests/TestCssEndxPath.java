package com.evgenii.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestCssEndxPath {
    WebDriver wd;

@BeforeMethod
public void setUp(){
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    wd.get("https://www.copart.com/");
}

@Test
    public void testSearchCss() throws InterruptedException {
    click(By.cssSelector("a.dropdown-toggle[data-uname=homePageFindAVehicle]"));
    click(By.cssSelector("a[data-uname=vehicleFinderTab]"));
    click(By.cssSelector("a.dropdown-toggle[data-uname=homePageSignIn]"));
    click(By.cssSelector("a.btn.btn-lblue[data-uname='homePageMemberSignIn']"));
    type(By.cssSelector("input#username"), "kozinevgenii85@gmail.com");
    type(By.cssSelector("input#password"), "Stekla_136");
    click(By.cssSelector("button.btn.btn-lblue.loginfloatright"));
    click(By.cssSelector("span.signout"));
    click(By.cssSelector("a.logo.copart-img"));
    type(By.cssSelector("input#input-search"), "volvo");
    click(By.cssSelector("button.btn.btn-lightblue"));
    Thread.sleep(3000);


}

    public void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    private void click(By locator) {
        wd.findElement(locator).click();
    }

    @Test
    public void testSearchXPath() throws InterruptedException {
        click(By.xpath("//a[contains(text(),'Find Vehicles')]"));
        click(By.xpath("//a[@class='menu_click'][contains(text(),'Vehicle Finder')]"));
        click(By.xpath("//a[@class='textbtn dropdown-toggle']"));
        click(By.xpath("//a[@class='btn btn-lblue'][contains(text(),'Member')]"));
        type(By.xpath("//input[@id='username']"), "kozinevgenii85@gmail.com");
        type(By.xpath("//input[@id='password']"), "Stekla_136");
        click(By.xpath("//button[@class='btn btn-lblue loginfloatright margin15']"));
        click(By.xpath("//span[@class='signout singOutCursor']"));
        click(By.xpath("//img[@class='img-responsive copart-img']"));
        type(By.xpath("//input[@id='input-search']"),"volvo");
        click(By.xpath("//button[@class='btn btn-lightblue marginleft15']"));
        Thread.sleep(3000);


    }


@AfterMethod

public void tearDown(){
    wd.quit();

}







}
