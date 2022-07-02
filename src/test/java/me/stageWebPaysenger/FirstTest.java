package me.stageWebPaysenger;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver","/Users/Staffa01/Desktop/Chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://stage-web.paysenger.me/");
    }
}
