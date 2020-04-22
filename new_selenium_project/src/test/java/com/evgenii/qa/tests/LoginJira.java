package com.evgenii.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginJira {
    WebDriver wd;

   @BeforeMethod
   public void setUp(){
       wd=new ChromeDriver();
       wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       wd.get(" http://jira.tel-ran.net/");
   }

   @Test
    public void signInJira() throws InterruptedException {
       type(By.id("login-form-username"), "kozinevgenii85");
       type(By.id("login-form-password"), "Stekla136");
       click(By.id("login"));
       Thread.sleep(3000);


//       String errorMessage = wd.findElement(By.id("usernameerror")).getText();
//       Assert.assertEquals(errorMessage, "Sorry, your username and password are incorrect - please try again.");
       Assert.assertFalse(isElementPresent(By.id("usernameerror")));



   }

    private void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    private void click(By user) {
        wd.findElement(user).click();
    }

    public  boolean isElementPresent(By locator){
       return wd.findElements(locator).size()>0;
    }

   @AfterMethod
    public void tearDown(){
       wd.quit();
   }




}
