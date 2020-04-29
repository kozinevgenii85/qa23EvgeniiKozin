package com.qa.trello;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase {


    @Test
public void testBoardCreation() throws InterruptedException {
    initLogin(By.cssSelector("a.btn.btn-sm.btn-link"));
    fillLoginForm("kozinevgenii85@gmail.com", "Stekla136");
    confirmLogin(By.cssSelector("input#login"));
    Thread.sleep(5000);
    initBoardCreation(By.name("add"));
    Thread.sleep(5000);
    fillBoardForm();
    confirmBoardCreation(By.className("_3UeOvlU6B5KUnS"));
    Thread.sleep(5000);
    returnToHomePage(By.name("house"));


}


}
