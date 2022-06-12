package domaci_zadatak_09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {

//        Zadatak
//        Maksimizirati prozor
//        Ucitati stranicu https://s.bootsnipp.com/iframe/WaXlr
//        Dohvatite dugmice za rejting kao listu. XPath za trazenje treba da bude preko id atributa i za ovo trebace vam contains u xpath-u
//        Od korisnika ucitati broj (preko scannera) na koju zvezdicu je potrebno kliknuti (u rasponu od 1 do 5)
//        I izvrsite akciju klik na odgovarajuci element preko indeksa
//        Na kraju programa ugasite pretrazivac.


                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://s.bootsnipp.com/iframe/WaXlr");

        driver.manage().window().maximize();

        List <WebElement> ocena = driver.findElements(By.xpath("//*[contains(@id , 'rating-star')]"));

        Scanner s = new Scanner(System.in);
        System.out.print("Unesite ocenu: ");
        int zvezdica = s.nextInt();

        for (int i = 0; i < zvezdica; i++) {
            if (zvezdica == 1){
                ocena.get(0).click();
            } else if (zvezdica == 2){
                ocena.get(1).click();
            } else if (zvezdica == 3) {
                ocena.get(2).click();
            } else if (zvezdica == 4){
                ocena.get(3).click();
            } else if (zvezdica == 5){
                ocena.get(4).click();
            }

            Thread.sleep(4000);
        }

        driver.quit();
    }
}
