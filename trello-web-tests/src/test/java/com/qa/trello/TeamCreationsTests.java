package com.qa.trello;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TeamCreationsTests extends TestBase {


    @Test
    public void testCreationTeam() throws InterruptedException {
        clickLogIn(By.cssSelector("a.btn.btn-sm.btn-link"));
        fillLoginForm("kozinevgenii85@gmail.com", "Stekla136");
        clickLogIn(By.cssSelector("input#login"));
        createTeam(By.name("add"));
        type(By.className("_1CLyNodCAa-vQi"), "Evgenii");
        confirmLogin(By.className("css-3gw83x"));
        confirmLogin(By.xpath("//p[@id='aria-context']"));






        Thread.sleep(3000);


    }

    public void createTeam(By locator) {
        confirmLogin(locator);
        confirmLogin(locator);
    }


}
