package p3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpo {
	public Loginpo(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement unTxtBx;
	public WebElement unTxtBx() {
		return unTxtBx;
		
	}
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement pwTxtBx;
	public WebElement pwTxtBx() {
		return pwTxtBx;
	}
	@FindBy(xpath="//a[@id='loginButton']")
	private WebElement loginBtn;
	public WebElement loginBtn() {
		return loginBtn;
}
	public void loginToHome(String un,String pw) {
		unTxtBx.sendKeys(un);
		pwTxtBx.sendKeys(pw);
		loginBtn().click();
	}
}
