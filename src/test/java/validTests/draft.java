package validTests;

import org.openqa.selenium.By;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utilities.variables;

public class draft {
    static SafariDriver driver;

    @BeforeTest
    void preConditions() {
        driver = new SafariDriver();
        driver.get(variables.URL);
        driver.manage().window().maximize();
    }
    @AfterTest
    void driverQuit() {
        driver.quit();
    }
    @Test
    void tap() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(variables.menbtnXpath)).click();
        Thread.sleep(3000);
    }

}
