package ikame.docxreader.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_15_DocxReader_CheckAllLink_TabTool_CapQuyen extends commonBase {

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
public void TC_001_CheckAllLink_Tool() {
	info("Mở app và mở màn hình Home");
	managementAccount.openHomePage();
	
	info("Kiểm tra tab Tool");
	click(PageUI_DocxReader.TEXT_TOOL);
	getElementPresent(PageUI_DocxReader.ICON_TOOL);
	getElementPresent(PageUI_DocxReader.TEXT_PDF_TOOLS);
	getElementPresent(PageUI_DocxReader.TAB_MAY_YOU_LIKE);
	captureScreen(driver, "TabToolCapQuyen");

	info("Kiểm tra tab Image to PDF");
	click(PageUI_DocxReader.TAB_IMG_TO_PDF);
	getElementPresent(PageUI_DocxReader.TEXT_ALL_IMAGE);
	getElementPresent(PageUI_DocxReader.BTN_CONFIRM);
	click(PageUI_DocxReader.BUTTON_IV_BACK);

	info("Kiểm tra tab Scan File");
	click(PageUI_DocxReader.TAB_SCAN_FILE);
	getElementPresent(PageUI_DocxReader.ICON_TAKE);
	getElementPresent(PageUI_DocxReader.TEXT_SINGLE);
	getElementPresent(PageUI_DocxReader.TEXT_MULTIPLE);
	click(PageUI_DocxReader.BUTTON_HOME);

	info("Kiểm tra tab Merge PDF");
	click(PageUI_DocxReader.TAB_MERGE_PDF);
	getElementPresent(PageUI_DocxReader.LIST_FOLDER);
	click(PageUI_DocxReader.BTN_TITLE_BACK);

	info("Kiểm tra tab Set Password");
	click(PageUI_DocxReader.TAB_SET_PASSWORD);
	getElementPresent(PageUI_DocxReader.LIST_FOLDER);
	click(PageUI_DocxReader.BTN_TITLE_BACK);


	info("Kiểm tra tab Split PDF");
	click(PageUI_DocxReader.TAB_SPLIT_PDF);
	getElementPresent(PageUI_DocxReader.TAB_SPLIT_PDF);

	info("Kiểm tra tab Convert to PDF");
	click(PageUI_DocxReader.TAB_CONVERT_TO_PDF);
	getElementPresent(PageUI_DocxReader.LIST_FOLDER);
	click(PageUI_DocxReader.BTN_TITLE_BACK);

	info("Kiểm tra tab Text Recognize");
	click(PageUI_DocxReader.TAB_TEXT_RECOGNIZE);
	getElementPresent(PageUI_DocxReader.ICON_TAKE);
	getElementPresent(PageUI_DocxReader.TEXT_SINGLE);
	getElementPresent(PageUI_DocxReader.TEXT_MULTIPLE);
	click(PageUI_DocxReader.BUTTON_HOME);

	info("Kiểm tra tab Print");
	click(PageUI_DocxReader.TAB_PRINT);
	getElementPresent(PageUI_DocxReader.TAB_PRINT);

	info("Kiểm tra tab File Transfer");
	click(PageUI_DocxReader.TAB_FILE_TRANSFER);
	getElementPresent(PageUI_DocxReader.TEXT_WIFI_CONNECTED);
	getElementPresent(PageUI_DocxReader.BTN_TURN_ON);
	click(PageUI_DocxReader.BTN_TITLE_BACK);

	info("Kiểm tra tab Recycle Bin");
	click(PageUI_DocxReader.TAB_RECYCLE_BIN);
	getElementPresent(PageUI_DocxReader.TITLE_RECYCLE_BIN);
	getElementPresent(PageUI_DocxReader.IMG_EMPTY_FILE);
}

	private Management_Account managementAccount;

}
