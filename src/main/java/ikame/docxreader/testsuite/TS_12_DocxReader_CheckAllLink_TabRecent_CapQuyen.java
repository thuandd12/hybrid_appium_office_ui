package ikame.docxreader.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_12_DocxReader_CheckAllLink_TabRecent_CapQuyen extends commonBase {

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
public void TC_001_CheckAllLink_TabRecent() {
	info("Mở app và mở màn hình Home");
	managementAccount.openHomePage();
	
	info("Kiểm tra tab Recent");
	click(PageUI_DocxReader.TEXT_RECENT);
	//getElementPresent(getValue(PageUI_DocxReader.TAB_RECENT));
	getElementPresent(PageUI_DocxReader.IMG_EMPTY_FILE);
	getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
	captureScreen(driver, "TabRecentCapQuyen");
	click(PageUI_DocxReader.TAB_FAVOURITE_IN_RECENT);
	//getElementPresent(getValue(PageUI_DocxReader.TAB_FAVOURITE_IN_RECENT));
	getElementPresent(PageUI_DocxReader.IMG_EMPTY_FILE);
	getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
}

	private Management_Account managementAccount;

}
