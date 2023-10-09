package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import ToolsQAHomePage.Elements;

public class E_TextBox {
	
	private static WebDriver driver1 = null;
	public static String browser = "chrome";
public static WebDriver driver;

	public static void main(String[] args) {
		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver1 = new FirefoxDriver();
		}else if (browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver1 = new ChromeDriver();
		}
		
		driver1.get("https://demoqa.com/");
		
		Elements.E_menu(driver1).click();
		driver1.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();
	}
}
