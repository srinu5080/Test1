package p3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1Link5po {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("file:///F:/sri/Link5.html");
		Link5po link5po=new Link5po(driver);
		link5po.chkBx1().click();
		link5po.chkBx2().click();
		link5po.chkBx3().click();
		link5po.chkBx4().click();
		link5po.chkBx5().click();
		System.out.println(link5po.allChkBxSize());
		System.out.println(link5po.allChkBxSize());  //findby
		for (int i = 0; i < link5po.allChkBxSize(); i++) {
			link5po.getAllChkBx(i).click();
			/*link5po.getAllChkBx(0).click();
			link5po.getAllChkBx(1).click();       //findall
			link5po.getAllChkBx(2).click();*/
		}
		driver.close();
	}

}
