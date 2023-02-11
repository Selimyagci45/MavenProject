package TechnoStudyB7.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");
        WebElement startButton=driver.findElement(By.cssSelector("#start>button"));
        WebElement hiddenText=driver.findElement(By.cssSelector("#finish>h4"));
        System.out.println("BEFORE  :"+hiddenText.isDisplayed());
        startButton.click();
        Thread.sleep(7000);
        System.out.println("AFTER  :"+hiddenText.isDisplayed());

    }
}
