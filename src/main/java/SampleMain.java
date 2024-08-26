package main.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleMain {
	static  WebDriver driver;
	
	public static void main(String[] args) {
System.out.print("Hello");

System.setProperty("webdriver.chrome.driver", "C:\\qa\\projectShare\\resource\\chromedriver\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("https://BBC.co.uk");

assertEquals(driver.getTitle(), "BBC - Home");
System.out.println(driver.getTitle());

driver.quit();
	}

}
