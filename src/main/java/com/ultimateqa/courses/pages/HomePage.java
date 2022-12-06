package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By emailField = By.id("user[email]");
    By passwordField = By.id("user[password]");



    public void getPageTitle(){
        System.out.println("Page Title: "+ driver.getTitle());
    }

    public void getTheCurrentUrl(){
        System.out.println("Current Url: "+driver.getCurrentUrl());
    }

    public void printThePageSource(){
        System.out.println("Page Source: " +  driver.getPageSource());
    }

    public void enterEmailAddress(String email){
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }
}
