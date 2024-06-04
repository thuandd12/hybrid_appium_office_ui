package ikame.docxreader.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_04_DocxReader_CheckAllLink_TabCreate_ChuaCapQuyen extends commonBase {

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
public void TC_001_CheckAllLink_TabCreate() {
	info("Mở app và mở màn hình Home");
	managementAccount.openHomePage();
	
	info("Kiểm tra tab Create");
	click(PageUI_DocxReader.ICON_CREATE);
	getElementPresent(PageUI_DocxReader.TEXT_PDF_FILE);
	getElementPresent(PageUI_DocxReader.TEXT_CREATE);
	captureScreen(driver, "TabCreateChuaCQ");

	info("Kiểm tra tab Scanner");
	click(PageUI_DocxReader.TAB_SCANNER);
	getElementPresent(PageUI_DocxReader.ICON_TAKE);
	getElementPresent(PageUI_DocxReader.TEXT_SINGLE);
	getElementPresent(PageUI_DocxReader.TEXT_MULTIPLE);
	click(PageUI_DocxReader.BUTTON_HOME);

	info("Kiểm tra tab DOCX");
	click(PageUI_DocxReader.ICON_CREATE);
	click(PageUI_DocxReader.TAB_DOCX);
	getElementPresent(PageUI_DocxReader.TEXT_ALL_FILES_ACCESS);
	getElementPresent(PageUI_DocxReader.ICON_DOCX_READER);
	getElementPresent(PageUI_DocxReader.TEXT_SUMMARY);
	getElementPresent(PageUI_DocxReader.TEXT_ALLOW_ACCESS);
	getElementPresent(PageUI_DocxReader.BUTTON_SWITCH_OFF);
	click(PageUI_DocxReader.BUTTON_NAVIGATE);
	click(PageUI_DocxReader.BUTTON_CLOSE);

	info("Kiểm tra tab XLSX");
	click(PageUI_DocxReader.ICON_CREATE);
	click(PageUI_DocxReader.TAB_XLSX);
	getElementPresent(PageUI_DocxReader.TEXT_ALL_FILES_ACCESS);
	getElementPresent(PageUI_DocxReader.ICON_DOCX_READER);
	getElementPresent(PageUI_DocxReader.TEXT_SUMMARY);
	getElementPresent(PageUI_DocxReader.TEXT_ALLOW_ACCESS);
	getElementPresent(PageUI_DocxReader.BUTTON_SWITCH_OFF);
	click(PageUI_DocxReader.BUTTON_NAVIGATE);
	click(PageUI_DocxReader.BUTTON_CLOSE);

	info("Kiểm tra tab PPTX");
	click(PageUI_DocxReader.ICON_CREATE);
	click(PageUI_DocxReader.TAB_XLSX);
	getElementPresent(PageUI_DocxReader.TEXT_ALL_FILES_ACCESS);
	getElementPresent(PageUI_DocxReader.ICON_DOCX_READER);
	getElementPresent(PageUI_DocxReader.TEXT_SUMMARY);
	getElementPresent(PageUI_DocxReader.TEXT_ALLOW_ACCESS);
	getElementPresent(PageUI_DocxReader.BUTTON_SWITCH_OFF);
	click(PageUI_DocxReader.BUTTON_NAVIGATE);
	click(PageUI_DocxReader.BUTTON_CLOSE);
}
	private Management_Account managementAccount;

}
