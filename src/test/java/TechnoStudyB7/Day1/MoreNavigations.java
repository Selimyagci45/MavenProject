package TechnoStudyB7.Day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreNavigations {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.seleniumeasy.com");
        System.out.println("Title of selenium easy page "+driver.getTitle());
        String expectedTitle = "<title>Selenium Easy - Best Demo website to practice Selenium Webdriver Online</title>";
        String actualTitle= driver.getTitle();
        if (expectedTitle.equals(actualTitle)){
            System.out.println("verification is clear:passed");
            System.out.println(actualTitle);
        }else{
            System.out.println("verification is not clear:failed");
            System.out.println(actualTitle);
        }
        Thread.sleep(3000);
String teslaURL="https://www.tesla.com";
        driver.navigate().to(teslaURL);
        driver.manage().window().maximize();
        driver.close();// close only one page.
        driver.quit();// closes all pages.
    }
}
