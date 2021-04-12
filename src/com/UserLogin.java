package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;


public class UserLogin {
        public static void main(String[] args) throws InterruptedException {


        }

        public static void method() throws InterruptedException {
                //method starts here
                System.setProperty("webdriver.chrome.driver", "/Users/dtring/Downloads/Selenium Downloads/chromedriver");
                ChromeDriver driver = new ChromeDriver();

                String url = ("https://www.bidjs.com");
                driver.get(url);


                WebElement demo = driver.findElement(By.linkText("demo"));
                demo.click();
                Thread.sleep(5000);
                //verify URL & Print success or fail
                String urlTest = driver.getCurrentUrl();
                if (urlTest.endsWith("/demo/#!/"))   {
                        System.out.println("demo page load successful");
                }
                else {
                        System.out.println("demo page load failed");
                }


                Thread.sleep(2000);

                WebElement login = driver.findElement(By.linkText("login"));
                login.click();
                Thread.sleep(5000);
                //verify URL & Print success or fail
                String urlLogin = driver.getCurrentUrl();
                if (urlLogin.startsWith("https://bidjs.com/demo/#!/login"))   {
                        System.out.println("login page load successful");
                }
                else {
                        System.out.println("login page load failed");
                }

                WebElement identifier = driver.findElement(By.id("identifier"));
                identifier.sendKeys("admin_demo");
                //confirm entered text & Print success
                System.out.println("username entry successful");

                WebElement password = driver.findElement(By.id("password"));
                password.sendKeys ("5unSh1ne");
                //confirm entered text & Print success
                System.out.println("password entry successful");

                Thread.sleep(2000);

                WebElement submit = driver.findElement(By.id("submit"));
                submit.click();
                Thread.sleep(5000);
                String urlLoggedIn = driver.getCurrentUrl();
                //confirm submission
                if (urlLoggedIn.endsWith("/demo/#!/"))   {
                        System.out.println("logged in page load successful");
                }
                else {
                        System.out.println("logged in page load failed");
                }

                String loginSuccess = driver.findElement(By.className("x-bidlogix--templated-user")).getText();
                //confirm username i.e. logged in successfully
                if (loginSuccess.startsWith("Admin_demo"))   {
                        System.out.println("login successful");
                }
                else {
                        System.out.println("login failed");
                }

                Thread.sleep(5000);

        }
}