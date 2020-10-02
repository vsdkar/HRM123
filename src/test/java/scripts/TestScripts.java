 package scripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generic.BasePage;
import generic.BaseTest;
import generic.Excel;
import generic.GenericUtils;
import pom.Homepage;

public class TestScripts extends BaseTest {

	@Test(enabled=false)
	public void testcreateemployee() throws InterruptedException {
		Homepage p = new Homepage(driver);
		p.SetUserName("Admin");
		p.SetPwd("admin123");
		p.ClickloginBtn();
		BasePage.verifyTitle("OrangeHRM");
		p.ClickPIM_Menu();
		Thread.sleep(2000);
		p.ClickAdd_Emp();
		p.SetFirstName("Aditya");
		p.Setlastname("kadri");
		p.clickSaveBtn();
	}
	@Test(enabled=true)
	public void testSortlistBox() throws InterruptedException, EncryptedDocumentException, IOException {
		Homepage p = new Homepage(driver);
		p.SetUserName(Excel.readData("Sheet1", 0, 1));
		p.SetPwd(Excel.readData("Sheet1", 1, 1));
		p.ClickloginBtn();
		BasePage.verifyTitle("OrangeHRM");
		p.ClickPIM_Menu();
		Thread.sleep(2000);
		p.clickEmpList();
		GenericUtils.sortListBox(driver.findElement(By.xpath("//select[@id='empsearch_job_title']")));
		
	}
	
}
