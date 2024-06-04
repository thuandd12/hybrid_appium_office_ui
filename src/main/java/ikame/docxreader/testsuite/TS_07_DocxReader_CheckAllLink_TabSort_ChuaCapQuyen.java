package ikame.docxreader.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_07_DocxReader_CheckAllLink_TabSort_ChuaCapQuyen extends commonBase {

	@BeforeMethod
	public void init() {
//		driver = initDriverTest("192.168.115.101:5555", "Android", "12.0", "com.officedocument.word.docx.document.viewer",
//				"com.happydev.wordoffice.business.splash.SplashActivity", "8027");
		driver = initDriverTest("WorkOffice.apk", "emulator-5554", "Android", "12.0", "com.happydev.wordoffice",
				"com.happydev.wordoffice.business.splash.SplashActivity", "windows", "8201");
		managementAccount = new Management_Account(driver);
	}

	@AfterMethod
	public void after() {
		quitDriver(driver);
	}
	@Test
	public void TC_001_CheckAllLink_DocxReader_TabSort() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Kiểm tra button Sort");
		click(PageUI_DocxReader.BUTTON_SORT);
		checkElementNotPresent(PageUI_DocxReader.TEXT_FILTER,5000);
		captureScreen(driver, "ButtonSortChuaCQ");
	}
	private Management_Account managementAccount;

}
