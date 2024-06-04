package ikame.docxreader.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_09_DocxReader_CheckAllLink_Premium extends commonBase {

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
	public void TC_001_CheckAllLink_DocxReader_Premium() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Kiểm tra button Premium");
		click(PageUI_DocxReader.BUTTON_PREMIUM);
		getElementPresent(PageUI_DocxReader.IMG_PREMIUM);
		getElementPresent(PageUI_DocxReader.TEXT_UNLOCK_ALL_PREMIUM_BENEFITS);
		getElementPresent(PageUI_DocxReader.TEXT_PRIVILLEGE);
		getElementPresent(PageUI_DocxReader.TEXT_NORMAL);
		getElementPresent(PageUI_DocxReader.TEXT_PREMIUM);
		getElementPresent(PageUI_DocxReader.TEXT_BASIC_READING_OPERATION);
		getElementPresent(PageUI_DocxReader.TEXT_CREATE_ALL_FIRE);
		getElementPresent(PageUI_DocxReader.TEXT_CONVERT_TO_PDF);
		getElementPresent(PageUI_DocxReader.TEXT_POWERFUL_EDITING_TOOL);
		getElementPresent(PageUI_DocxReader.BANNER_PACKAGE2);
		getElementPresent(PageUI_DocxReader.TEXT_DAY);
		getElementPresent(PageUI_DocxReader.TEXT_START_FREE_TRIAL);
		captureScreen(driver, "Premium");
		click(PageUI_DocxReader.BANNER_PACKAGE1);
		getElementPresent(PageUI_DocxReader.TEXT_MONTHLY);
		getElementPresent(PageUI_DocxReader.BNT_UPGRADE_TO_PREMIUM);
		click(PageUI_DocxReader.BANNER_PACKAGE3);
		getElementPresent(PageUI_DocxReader.TEXT_LIFETIME);
		getElementPresent(PageUI_DocxReader.BNT_UPGRADE_TO_PREMIUM);
		getElementPresent(PageUI_DocxReader.TEXT_SUBSCRIPTION_TERMS);
		getElementPresent(PageUI_DocxReader.TEXT_TERM_AND_CONDITION);
		getElementPresent(PageUI_DocxReader.TEXT_PRIVACY_POLICY);
	}
	private Management_Account managementAccount;

}
