/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleniumtutorial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author s530711
 */
public class Seleniumtutorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\S530711\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://gdpexam.herokuapp.com/");
        Thread.sleep(1000);
        
        WebElement make;
        make = driver.findElement(By.id("inputEmail3"));
        make.sendKeys("Civic");
        Thread.sleep(1000);
        
        WebElement model;
        model = driver.findElement(By.id("inlineFormCustomSelect"));
        model.sendKeys("Civic");
        Thread.sleep(1000);
        
        WebElement year;
        year = driver.findElement(By.id("inputPassword3"));
        year.sendKeys("2017");
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
        date.sendKeys("09/11/2018");
        Thread.sleep(1000);
        
        WebElement submit1;
        submit1 = driver.findElement(By.id("submit"));
        submit1.click();
        Thread.sleep(1000);
        
        WebElement resultparagraph;
        resultparagraph = driver.findElement(By.id("resultpagereview"));
        System.out.println(resultparagraph.getText());
        Thread.sleep(1000);
        
    }
    
}
