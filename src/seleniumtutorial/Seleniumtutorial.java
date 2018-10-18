/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumtutorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author s530711
 */
public class Seleniumtutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\S530711\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://gdpexam.herokuapp.com/");
        Thread.sleep(1000);
        Scanner scan = new Scanner(new File("test.txt"));

        while (scan.hasNextLine()) {
            try {
                String[] data = scan.nextLine().split(" ");
                if(data.length == 1){
                    continue;
                }
//                WebElement make;
//                make = 
                driver.findElement(By.id("inputEmail3")).sendKeys(data[0]);
                Thread.sleep(1000);

                WebElement model;
                model = driver.findElement(By.id("inlineFormCustomSelect"));
                model.sendKeys(data[1]);
                Thread.sleep(1000);

                WebElement year;
                year = driver.findElement(By.id("inputPassword3"));
                year.sendKeys(data[2]);
                Thread.sleep(1000);

                WebElement type;
                type = driver.findElement(By.id("gridRadios1"));
                type.click();
                Thread.sleep(1000);

                WebElement submit;
                submit = driver.findElement(By.id("submit"));
                submit.click();
                Thread.sleep(1000);

                WebElement features;
                features = driver.findElement(By.id("GPS"));
                features.click();
                Thread.sleep(1000);

                WebElement date;
                date = driver.findElement(By.id("inputEmail3"));
                date.sendKeys(data[3]);
                Thread.sleep(1000);

                WebElement submit1;
                submit1 = driver.findElement(By.id("submit"));
                submit1.click();
                Thread.sleep(1000);
                
                String[] Date = data[3].split("/");
                
                WebElement resultparagraph;
                resultparagraph = driver.findElement(By.id("resultpagereview"));
                
                String str = "The user selected the following input:\n"
                        + data[0] + " " + data[1] + " " + data[2] + "\n"
                        + "with GPS\n"
                        + "accessories on " + Date[2] + "-" + Date[0] + "-" + Date[1] + "\n"
                        + "The user will get 30% discount.";
                System.out.println(resultparagraph.getText().equals(str));
                Thread.sleep(1000);
                
                driver.navigate().to("https://gdpexam.herokuapp.com/");
            } catch (Exception e) {
                System.out.println("false");
                Alert alert = driver.switchTo().alert();
                alert.accept();
                driver.navigate().to("https://gdpexam.herokuapp.com/");
            }
        }

    }

}
