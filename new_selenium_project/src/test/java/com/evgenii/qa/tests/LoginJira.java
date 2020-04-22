package com.evgenii.qa.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
       wd.findElement(By.id("login-form-username")).click();
       wd.findElement(By.id("login-form-username")).clear();
       wd.findElement(By.id("login-form-username")).sendKeys("kozinevgenii85");
       wd.findElement(By.id("login-form-password")).click();
       wd.findElement(By.id("login-form-password")).clear();
       wd.findElement(By.id("login-form-password")).sendKeys("Stekla136");
       wd.findElement(By.id("login")).click();
       Thread.sleep(3000);



   }

   @AfterMethod
    public void tearDown(){
       wd.quit();
   }




}
