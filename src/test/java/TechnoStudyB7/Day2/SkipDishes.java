package TechnoStudyB7.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkipDishes {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://couriers.skipthedishes.com");
        WebElement email=driver.findElement(By.id("login-email-field"));
        email.sendKeys("selimyagci1512@gmail.com");

        WebElement password= driver.findElement(By.id("login-password-field"));
        password.sendKeys("Sellom45");

        WebElement loginBox=driver.findElement(By.className("jss141"));
        loginBox.click();




    }
}
