package domaci_zadatak_14_06_2022;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class BootstrapTableTests {
    private WebDriver driver;
    private String baseUrl = "https://s.bootsnipp.com";

    @BeforeClass
    public void beforeClass (){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @BeforeMethod
    public void beforeMethod(){
        this.driver.get(baseUrl);
        driver.manage().window().maximize();
    }
    @Test (priority = 1)
    public void editRow (){
        this.driver.get(baseUrl + "/iframe/K5yrx");

        Assert.assertEquals(
                this.driver.getTitle(),
                "Table with Edit and Update Data - Bootsnipp.com",
                "[ERROR] Page title is not valid.");

        this.driver
                .findElement(By.xpath("//button[contains(@type, 'button')]"))
                .click();

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("modal-content")));

//        brisanje
        this.driver
                .findElement(By.id("fn")).clear();

        this.driver
                .findElement(By.id("ln")).clear();

        this.driver.findElement(By.id("mn")).clear();

//unos novih podataka
        this.driver
                .findElement(By.id("fn"))
                .sendKeys("Sanela");
        this.driver
                .findElement(By.id("ln"))
                .sendKeys("Solunac");
        this.driver
                .findElement(By.id("mn"))
                .sendKeys("Sanelko");

//        update
        this.driver
                .findElement(By.id("up"))
                .click();

//        cekanje
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("modal-content")));


        Assert.assertEquals(this.driver.findElement(By.id("f1")).getText(),
                "Sanela",
                "[ERROR] The name is not correct.");

        Assert.assertEquals(this.driver.findElement(By.id("l1")).getText(),
                "Solunac",
                "[ERROR] The last name is not correct.");

        Assert.assertEquals(this.driver.findElement(By.id("m1")).getText(),
                "Sanelko",
                "[ERROR] The middle name is not correct.");

    }
    @Test (priority = 2)
    public void deleteRow (){
        this.driver.get(baseUrl + "/iframe/K5yrx");

        Assert.assertEquals(
                this.driver.getTitle(),
                "Table with Edit and Update Data - Bootsnipp.com",
                "[ERROR] Page title is not valid.");

        this.driver
                .findElement(By.xpath("//button[contains(@data-target, '#delete')]"))
                .click();

        WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("modal-content")));

        this.driver.findElement(By.id("del")).click();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("modal-content")));

        List<WebElement> deletedRows = this.driver.findElements(By.xpath("//tbody/table/tr[0]"));

        Assert.assertTrue(deletedRows.isEmpty(), "[ERROR] Row is not deleted.");

    }
    @Test(priority = 3)
    public void takeAScreenshot () throws IOException {
        this.driver.get(baseUrl + "/iframe/K5yrx");

        Assert.assertEquals(
                this.driver.getTitle(),
                "Table with Edit and Update Data - Bootsnipp.com",
                "[ERROR] Page title is not valid.");

        TakesScreenshot screenshot = ((TakesScreenshot)driver);
        File srcFile = screenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("src/main/resources/screenshot.png");
        FileHandler.copy(srcFile,destFile);
    }
    @AfterClass
    public void afterClass (){
        this.driver.quit();
    }
}
