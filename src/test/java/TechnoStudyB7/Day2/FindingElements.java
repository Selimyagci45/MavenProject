package TechnoStudyB7.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {
    public static void main(String[] args) throws InterruptedException {
        // set up the browser driver (Selenium gonna knock the door of browser driver)
        WebDriverManager.chromedriver().setup();
        // to open the browser
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techno.study");
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");
        driver.navigate().back();
        // get() method wait the page for loading , navigate().to() method not wait for the page to load.
        driver.navigate().forward();
   //finding the web element on facebook page connect with with friends
        WebElement sloganText=driver.findElement(By.className("_8eso"));
        String expsloganText="connect with your friends and the world around you on Facebook";
        String actSloganText=expsloganText;
    if (expsloganText.equals(actSloganText)){
        System.out.println("verification is done: pass");
    }else{
        System.out.println("verification is failed");
        System.out.println("actual slogan text is : "+actSloganText);

    }
    }
}

