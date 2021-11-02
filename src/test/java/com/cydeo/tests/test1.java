package com.cydeo.tests;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class test1 {
    public static void main(String[] args) {
        System.out.println("hello");
        //ll
//


    }


    @Test
    public void test1() {
        WebDriverManager.chromedriver().setup();
        WebDriver  driver = new ChromeDriver();
        driver.get("https://amazon.com");

    }
    @Test
    public void test2(){

        WebDriver driver =WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        driver.manage().window().maximize();


    }
}
