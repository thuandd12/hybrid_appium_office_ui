package ikame.docxreader.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_08_DocxReader_CheckAllLink_MenuTrai extends commonBase {

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
	public void TC_001_CheckAllLink_MenuTrai() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Kiểm tra Menu trái");
		click(PageUI_DocxReader.ICON_AVATAR);
		getElementPresent(PageUI_DocxReader.IMG_AVATAR);
		getElementPresent(PageUI_DocxReader.TEXT_WELCOME);
		getElementPresent(PageUI_DocxReader.TEXT_LOGIN_TO_GOOGLE_DRIVER);
		captureScreen(driver, "MenuTrai");
		click(PageUI_DocxReader.BTN_LOGIN);
		clickElementIfDisplay(PageUI_DocxReader.BTN_CONFIRM);
		getElementPresent(PageUI_DocxReader.TITLE_MY_CLOUD);
		getElementPresent(PageUI_DocxReader.TEXT_WELL_COME_TO_CLOUD);
		getElementPresent(PageUI_DocxReader.BTN_LOGIN_WITH_GOOGLE_DRIVER);
		getElementPresent(PageUI_DocxReader.BTN_LOGIN_WITH_ONE_DRIVER);
		click(PageUI_DocxReader.BTN_TITLE_BACK);
		click(PageUI_DocxReader.TAB_LEARN_ABOUT_PREMIUM_FEATURES);
		getElementPresent(PageUI_DocxReader.TEXT_UNLOCK_ALL_PREMIUM_BENEFITS);
		getElementPresent(PageUI_DocxReader.BTN_START_FREE_TRIAL);
		click(PageUI_DocxReader.BTN_IV_CLOSE_PREMIUM);
		click(PageUI_DocxReader.ICON_AVATAR);
		click(PageUI_DocxReader.BTN_REMOVE_ADS);
		getElementPresent(PageUI_DocxReader.TEXT_ARE_YOU_SURE);
		getElementPresent(PageUI_DocxReader.BTN_REMOVE_ADS_NOW);
		click(PageUI_DocxReader.BTN_IV_CLOSE);
		click(PageUI_DocxReader.ICON_AVATAR);
		click(PageUI_DocxReader.BTN_PREMIUM);
		getElementPresent(PageUI_DocxReader.TEXT_UNLOCK_ALL_PREMIUM_BENEFITS);
		getElementPresent(PageUI_DocxReader.BTN_START_FREE_TRIAL);
		click(PageUI_DocxReader.BTN_IV_CLOSE_PREMIUM);
		click(PageUI_DocxReader.ICON_AVATAR);
		click(PageUI_DocxReader.BTN_MY_CLOUD);
		getElementPresent(PageUI_DocxReader.TITLE_MY_CLOUD);
		getElementPresent(PageUI_DocxReader.TEXT_WELL_COME_TO_CLOUD);
		getElementPresent(PageUI_DocxReader.BTN_LOGIN_WITH_GOOGLE_DRIVER);
		getElementPresent(PageUI_DocxReader.BTN_LOGIN_WITH_ONE_DRIVER);
		click(PageUI_DocxReader.BTN_TITLE_BACK);
		click(PageUI_DocxReader.BTN_SETTING);
		getElementPresent(PageUI_DocxReader.BTN_POLICY);
		getElementPresent(PageUI_DocxReader.BTN_TEAM_AND_CONDITION);
		getElementPresent(PageUI_DocxReader.BTN_RATE);
		getElementPresent(PageUI_DocxReader.BTN_FEEDBACK);
		getElementPresent(PageUI_DocxReader.BTN_VERSION_UPDATE);
		getElementPresent(PageUI_DocxReader.BTN_LANGUAGE);
		getElementPresent(PageUI_DocxReader.BTN_FACEBOOK);
		
	}
	private Management_Account managementAccount;

}
