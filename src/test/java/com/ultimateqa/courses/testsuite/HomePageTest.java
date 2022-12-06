package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.testbase.BaseTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    HomePage homePage = new HomePage();

    @Test
    public void verifyElementsOnHomePage(){
        homePage.getPageTitle();
        homePage.getTheCurrentUrl();
        homePage.printThePageSource();
        homePage.enterEmailAddress("Testerhv@gmail.com");
        homePage.enterPassword("password123");
    }
}
