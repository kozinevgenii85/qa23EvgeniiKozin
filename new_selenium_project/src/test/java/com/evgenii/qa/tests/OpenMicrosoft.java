package com.evgenii.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class OpenMicrosoft {
    WebDriver wd;




    @BeforeMethod
    public void  setUp() {
        wd = new ChromeDriver();
        wd.get("https://www.microsoft.com/en-us/");
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

//    @Test
//    public void testOpenMicrosoft(){
//        wd.findElement(By.id("uhfLogo")).click();
//    }

    @Test
    public void testOpen(){
        wd.findElement(By.id("shellmenu_0")).click();
        wd.findElement(By.id("uhfLogo")).click();
    }

    @Test
    public void testXbox(){
        wd.findElement(By.id("shellmenu_4")).click();
        wd.findElement(By.id("uhfLogo")).click();
    }

    @Test
    public void testSignIn() throws InterruptedException {
        wd.findElement(By.id("mectrl_headerPicture")).click();
        wd.findElement(By.id("i0116")).click();
        wd.findElement(By.id("i0116")).clear();
        wd.findElement(By.id("i0116")).sendKeys("kozinevgenii85@gmail.com");
        wd.findElement(By.id("idSIButton9")).click();
        Thread.sleep(3000);


    }

    @AfterMethod
    public void tearDown(){
        wd.quit();
    }

}
