package ToolsQAHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Elements {
	/*
	 * public static String browser = "chrome"; public static WebDriver driver;
	 * 
	 * 
	 * public static void main(String[] args){
	 * 
	 * if (browser.equals("Firefox")) { WebDriverManager.firefoxdriver().setup();
	 * driver = new FirefoxDriver(); }else if (browser.equals("chrome")){
	 * WebDriverManager.chromedriver().setup(); driver = new ChromeDriver(); } }
	 */
		private static WebElement element = null;
		
		/*
		 * public static WebElement Demo_home(WebDriver driver) {
		 * 
		 * element = driver.get("https://demoqa.com/"); return element;
		 * 
		 * }
		 */
	public static WebElement E_menu(WebDriver driver) 
	{
	    element = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]"));
	    return element;
	}

}
