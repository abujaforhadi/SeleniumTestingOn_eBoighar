/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookshop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author JAFOR
 */
public class Login {

    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic hereWebDriver driver = new ChromeDriver();

        WebDriver driver = new ChromeDriver();
        driver.get("https://eboighar.com/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("emailf")).sendKeys("abujaforhadi@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("user_password")).sendKeys("jafor321");
        Thread.sleep(3000);
        driver.findElement(By.id("rememberme")).click();
        driver.findElement(By.id("btnLogin")).click();
        String actual = driver.getTitle();
        Thread.sleep(15000);
        String expected = "My Login at eBoighar.com in Bangladesh";
        
        driver.close();
        if (actual.equalsIgnoreCase(expected)) {
            System.out.println("Test Successfull");
        } else {
            System.out.println("Test faile!!");
        }

    }
}
