package com.SeleniumDriver.Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {

	public static void main(String[] args) throws Exception {
	WebDriver driver = new ChromeDriver();	 //created object of the class using new keyword
    driver.get("https://www.selenium.dev/downloads/");
    driver.manage().window().maximize(); //maximize the window
    //Thread.sleep(3000);
    //driver.manage().window().minimize(); //minimize the window
    String Title = driver.getTitle();
    System.out.println(Title);
    String URL = driver.getCurrentUrl();
    System.out.println(URL);
    String PageSource = driver.getPageSource();
    System.out.println(PageSource);
    
    driver.quit();
    
	}

}
