package com.espn.training.test;

import com.espn.training.pages.EspnHomePage;
import org.testng.annotations.Test;

public class EspnTest extends BaseTest{

    @Test
    public void testEspnLogin() {
        EspnHomePage home = getEspnHomePage();
        home.triggerUser();
        home.logIn();
        home.signUp();
    }
}
