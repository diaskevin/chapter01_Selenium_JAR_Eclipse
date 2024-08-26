package test.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JarTest {

	    WebDriver driver;
	    @Test
	    public void sysOut_Test() {
	        System.out.println("hello world");
	    }
	    @Test
	    public void openGoogle_test() {
	        System.setProperty("webdriver.chrome.driver", "C:\\qa\\projectShare\\resource\\chromedriver\\chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.get("https://BBC.co.uk");

	        assertEquals(driver.getTitle(), "BBC - Home");
	        System.out.println(driver.getTitle());

	        driver.quit();
	    }
}
