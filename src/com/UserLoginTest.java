package com;

import org.openqa.selenium.chrome.ChromeDriver;
import com.UserLogin;

public class UserLoginTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/dtring/Downloads/Selenium Downloads/chromedriver");
        ChromeDriver driver = new ChromeDriver();

        UserLogin.method();

        driver.get("https://bidjs.com/");
        String urlTestComplete = driver.getCurrentUrl();
        if (urlTestComplete.endsWith("bidjs.com/"))   {
            System.out.println("return to homepage successful");
        }
        else {
            System.out.println("return to homepage failed");
        }


        System.out.println("Test complete!");

        driver.close();
        driver.quit();

        System.out.println("test ended");

    }
}
