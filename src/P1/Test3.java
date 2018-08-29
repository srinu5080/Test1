package P1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import p3.Loginpo;

public class Test3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://online.actitime.com/ccube/");
		Loginpo loginpo=new Loginpo(driver);
		loginpo.loginToHome("gsreddy5", "srinu@94");
	}

}
