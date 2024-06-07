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
public class SignUp {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://eboighar.com/login?ui=signup");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("Abu Jafor");
        Thread.sleep(2000);
         driver.findElement(By.id("mobile")).sendKeys("01767606839");
        Thread.sleep(2000);
        driver.findElement(By.id("email")).sendKeys("abujaforhadi@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("jafor321");
        Thread.sleep(3000);
        driver.findElement(By.id("confirmpassword")).sendKeys("jafor321");
        Thread.sleep(3000);
        driver.findElement(By.id("signupconditionaccept")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("btnSignup")).click();
        String actual = driver.getTitle();
        System.out.println(""+actual);
        Thread.sleep(2000);
        String expected = "My Login at eBoighar.com in Bangladesh";

        driver.close();
        if (actual.equalsIgnoreCase(expected)) {
            System.out.println("Test Successfull");
        } else {
            System.out.println("Test faile!!");
        }
    }

}
