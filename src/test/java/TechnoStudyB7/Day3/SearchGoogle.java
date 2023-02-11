package TechnoStudyB7.Day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        String input="bamboo pen";
        WebElement searchBox= driver.findElement(By.name("q"));
        searchBox.sendKeys(input+ Keys.ENTER);

        //VERIFICATION
        String actualTitle= driver.getTitle();
        String expectedTitle="bamboo pen - Google search";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("verification is done pass");
        }else{
            System.out.println("verification is failed");
            System.out.println("actual title is "+actualTitle);
        }




    }
}
