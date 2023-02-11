package TechnoStudyB7.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bouncycastle.dvcs.DVCSRequestInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisabled {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        WebElement enableButton = driver.findElement(By.cssSelector("#input-example>button"));
        WebElement inputField = driver.findElement(By.cssSelector("#input-example>input"));
        boolean isInputFieldEnabled = inputField.isEnabled();
        System.out.println("before click on enable button " + isInputFieldEnabled);
        enableButton.click();
        Thread.sleep(5000);
        boolean isInputFieldEnabled2 = inputField.isEnabled();
        System.out.println("after click on enable button: " + isInputFieldEnabled2);
    }
}
