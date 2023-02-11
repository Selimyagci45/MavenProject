package TechnoStudyB7.Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.facebook.com");
        WebElement email= driver.findElement(By.id("email"));
        email.sendKeys("selimyagci1512@gmail.com");
        WebElement password= driver.findElement(By.id("pass"));
        password.sendKeys("sellom");

        WebElement loginClick= driver.findElement(By.name("login"));
        loginClick.click();

    }
}
