package technostudyB7_day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoreNavigations {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com");
        System.out.println(driver.getTitle());
        String expectedTitle= "Selenium Easy - Best Demo website to practice Selenium Webdriver Online";
        String actualTitle= driver.getTitle();

        if (expectedTitle.equals(actualTitle)){
            System.out.println("Verification is done:PASS ");
            System.out.println(actualTitle);
        }else {
            System.out.println("Verification is failed ");
            System.out.println(actualTitle);
        }
        Thread.sleep(3000);
        String teslaUrl="https://www.tesla.com/";
        driver.navigate().to(teslaUrl);
        driver.manage().window().maximize();

        Thread.sleep(10000);
        driver.close();//close only one page
        driver.quit();//close all the pages
    }
}
