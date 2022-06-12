package domaci_zadatak_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
//        2.Zadatak
//        Napisati program koji ucitava stranicu https://geodata.solutions/
//        Bira proizvoljan Country, State i City
//        Pritom potrebno je izvrsiti cekanje da se povaje State-ovi nakon izbora Country-a
//        I takodje je potrebno izvrsiti cekanje da se ucitaju gradovi nakon izbora State-a
//        Izabrerit Country, State i City tako da imate podatke da selektujete!

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://geodata.solutions/");
        driver.manage().window().maximize();

        WebElement country = driver.findElement(By.id("countryId"));
        Select selectCountry = new Select(country);
        List<WebElement> opcije = selectCountry.getOptions();
        Random random = new Random();
        int randomBroj = random.nextInt(opcije.size());
        selectCountry.selectByIndex(randomBroj);
        Thread.sleep(1000);


        WebElement state = driver.findElement(By.id("stateId"));
        Select selectState = new Select(state);
        List<WebElement> opcijeState = selectState.getOptions();
        Random randomState = new Random();
        int randomBrojState = randomState.nextInt(opcijeState.size());
        selectState.selectByIndex(randomBrojState);
        Thread.sleep(1000);

        WebElement city = driver.findElement(By.name("city"));
        Select selectCity = new Select(city);
        List<WebElement> opcijeCity = selectCity.getOptions();
        Random randomCity = new Random();
        int randomBrojCity = randomCity.nextInt(opcijeCity.size());
        selectCity.selectByIndex(randomBrojCity);
        Thread.sleep(1000);




    }
}
