package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class Homepage extends BasePage{

	public Homepage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="txtUsername")
	private WebElement usernameTxtBox;
	@FindBy(id="txtPassword")
	private WebElement pwdTxtBox;
	@FindBy(id="btnLogin")
	private WebElement loginBtn;
	@FindBy(xpath="//li/a[@id='menu_pim_viewPimModule']")
	private WebElement PIM_Menu;
	@FindBy(xpath="//li/a[@id='menu_pim_addEmployee']")
	private WebElement Add_Emp;
	@FindBy(xpath="//input[@id='firstName']")
	private WebElement fname;
	@FindBy(xpath="//input[@id='lastName']")
	private WebElement lname;
	@FindBy(id="btnSave")
	private WebElement SaveBtn;
	@FindBy(id="menu_pim_viewEmployeeList")
	private WebElement emp_List;



	public void SetUserName(String un) {
		usernameTxtBox.sendKeys(un);
	}
	public void SetPwd(String Pwd) {
		pwdTxtBox.sendKeys(Pwd);
	}
	public void ClickloginBtn() {
		loginBtn.click();
	}
	public void ClickPIM_Menu() {
		PIM_Menu.click();
	}
	public void ClickAdd_Emp() {
		Add_Emp.click();
	}
	public void SetFirstName(String fn) {
		fname.sendKeys(fn);
	}
	public void Setlastname(String ln) {
		lname.sendKeys(ln);
	}
	public void clickSaveBtn() {
		SaveBtn.click();
	}
	public void clickEmpList() {
		emp_List.click();
	}
}
