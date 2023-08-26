package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    private static WebDriver driver;
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\Users\\ZIP-B205-E-019\\IdeaProjects\\test\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.imalittletester.com/");
        driver.manage().window().maximize();




    }
}