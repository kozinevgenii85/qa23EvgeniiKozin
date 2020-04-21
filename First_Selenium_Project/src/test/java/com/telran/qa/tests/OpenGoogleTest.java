package com.telran.qa.tests;

//import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class OpenGoogleTest {
WebDriver wd;


@BeforeClass
public void setUp(){
    //WebDriverManager.chromedriver().setup();
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    wd.get("https://www.google.com/");



}
@Test
public void testOpenGoogle(){

    wd.findElement(By.id("gbwa")).click();
    wd.findElement(By.id("gbwa")).click();
}

    @Test
    public void testSearchGoogle() throws InterruptedException {
        wd.findElement(By.name("q")).click();
        wd.findElement(By.name("q")).clear();
        wd.findElement(By.name("q")).sendKeys("yandex");
        wd.findElement(By.className("gNO89b")).click();
        Thread.sleep(3000);
    }

@AfterClass
public void  tearDown(){
    wd.quit();

}
}
