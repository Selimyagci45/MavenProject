package TechnoStudyB7.Day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitlyWait {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //TC
        //1- visit the page
        // 2 get the text of hidden text of (hello world.)


        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

                // div id= "start"=
                // <button>Start</button>
                //</div>

                WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        startButton.click();

        // <div id="finish" style="">
        //<h4>Hello World!</h4></div>
        Thread.sleep(7000);

        WebElement hiddenText = driver.findElement(By.cssSelector("#finish>h4"));
        String result = hiddenText.getText();
        System.out.println(result);
    }
}
