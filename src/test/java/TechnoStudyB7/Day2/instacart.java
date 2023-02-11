package TechnoStudyB7.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class instacart {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.instacart.ca");

        WebElement login=driver.findElement(By.className("css-utfnc"));
        login.click();

        WebElement email=driver.findElement(By.id("id-ctu5c1"));
        email.sendKeys("selimyagci1512@gmail.com");

        WebElement password=driver.findElement(By.id("id-jclrnq"));
        password.sendKeys("Sellom45");

        WebElement loginBox=driver.findElement(By.className("css-em7yaz"));
        loginBox.click();



    }
}
