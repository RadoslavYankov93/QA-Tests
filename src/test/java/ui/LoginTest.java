package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static String browser = "chrome";
public static WebDriver driver;
	public static void main(String[] args) {

		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}else if (browser.equals("chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		driver.get("http://softuni-qa-loadbalancer-2137572849.eu-north-1.elb.amazonaws.com:81/Identity/Account/Register");
		driver.findElement(By.id("Input_Username")).sendKeys("Radoslav93");
		driver.findElement(By.id("Input_Email")).sendKeys("radozaeka@abv.bg");
		driver.findElement(By.id("Input_Password")).sendKeys("1234567887654321");
		driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("1234567887654321");
		driver.findElement(By.id("Input_FirstName")).sendKeys("Radoslav");
		driver.findElement(By.id("Input_LastName")).sendKeys("Yankov");
		driver.findElement(By.xpath("/html/body/div/main/div/div/form/button")).click();
		driver.close();
    }

}
