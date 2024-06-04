package ikame.docxreader.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_14_DocxReader_CheckAllLink_TabStorage_CapQuyen extends commonBase {

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
public void TC_001_CheckAllLink_Storege() {
	info("Mở app và mở màn hình Home");
	managementAccount.openHomePage();
	
	info("Kiểm tra tab Storage");
	click(PageUI_DocxReader.TEXT_STORAGE);
	getElementPresent(PageUI_DocxReader.ICON_STORAGE);
	captureScreen(driver, "TabStoregeCapQuyen");
	click(PageUI_DocxReader.BTN_INTERAL_STORAGE);
	getElementPresent(PageUI_DocxReader.FOLDER_MOVIES);
	getElementPresent(PageUI_DocxReader.FOLDER_MUSIC);
	click(PageUI_DocxReader.BTN_TITLE_BACK);
	
	click(PageUI_DocxReader.BTN_SD_CARD);
	getElementPresent(PageUI_DocxReader.FOLDER_MOVIES);
	getElementPresent(PageUI_DocxReader.FOLDER_MUSIC);
	click(PageUI_DocxReader.BTN_TITLE_BACK);
	
	click(PageUI_DocxReader.BTN_ADD_ACCOUNT);
	clickElementIfDisplay(PageUI_DocxReader.BTN_CONFIRM);
	getElementPresent(PageUI_DocxReader.TITLE_MY_CLOUD);
	getElementPresent(PageUI_DocxReader.TEXT_WELL_COME_TO_CLOUD);
	getElementPresent(PageUI_DocxReader.BTN_LOGIN_WITH_GOOGLE_DRIVER);
	getElementPresent(PageUI_DocxReader.BTN_LOGIN_WITH_ONE_DRIVER);
	click(PageUI_DocxReader.BTN_TITLE_BACK);
	
	click(PageUI_DocxReader.BTN_DEVICES_FILE);
	getElementPresent(PageUI_DocxReader.TITLE_RECENT);
	getElementPresent(PageUI_DocxReader.LIST_FILE_IN_FOLDER);
}
	private Management_Account managementAccount;

}
