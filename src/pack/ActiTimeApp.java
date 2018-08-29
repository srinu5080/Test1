package pack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeApp {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/ccube/");
		driver.findElement(By.id("username")).sendKeys("gsreddy529");
		driver.findElement(By.name("pwd")).sendKeys("srinu@94");
		driver.findElement(By.id("loginButton ")).click();
	}

}
