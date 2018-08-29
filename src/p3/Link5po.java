package p3;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Link5po {
	public Link5po(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(id="a1")
	private WebElement chkBx1;
	public WebElement chkBx1() {
		return chkBx1;
	}
	@FindBy(id="a2")
	private WebElement chkBx2;
	public WebElement chkBx2() {
		return chkBx2;
	}
	@FindBy(id="a3")
	private WebElement chkBx3;
	public WebElement chkBx3() {
		return chkBx3;
	}
	@FindBy(id="a4")
	private WebElement chkBx4;
	public WebElement chkBx4() {
		return chkBx4;
	}
	@FindBy(id="a5")
	private WebElement chkBx5;
	public WebElement chkBx5() {
		return chkBx5;
	}
	@FindBys({
	@FindBy(xpath="//input[@type='checkbox']"),
	})private List<WebElement>allchkBx;
	public int allChkBxSize(){
		return allchkBx.size();
		
	}
	public WebElement getAllChkBx(int i) {
		return allchkBx.get(i);
	}
	@FindAll({
		@FindBy(id="a1"),
		@FindBy(id="a2"),
		@FindBy(id="a3")
	}) private List<WebElement>allChkBx3;
	public int allChkBx3Size() {
    return allchkBx.size();
}
	public WebElement getAllChkBx3(int i) {
		return allChkBx3.get(i);
	}
}