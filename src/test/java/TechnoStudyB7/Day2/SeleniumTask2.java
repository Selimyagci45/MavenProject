package TechnoStudyB7.Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTask2 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        int input = 20;
        int input1 = 30;

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement valueBox1 = driver.findElement(By.id("sum1"));
        valueBox1.sendKeys(Integer.toString(input));

        WebElement valueBox2 = driver.findElement(By.id("sum2"));
        valueBox2.sendKeys(Integer.toString(input1));
        WebElement showMessageButton = driver.findElement(By.cssSelector("button[onclick='return total()']"));
        showMessageButton.click();
        WebElement value = driver.findElement(By.id("displayvalue"));
        System.out.println(value.getText());

        if (value.getText().equals(Integer.toString(input+input1))){
            System.out.println("Verification is done : PASS");
            System.out.println(value.getText());
        }else {
            System.out.println("Verification is done : FAILED");
            System.out.println(value.getText());
        }
    }
}