package ikame.docxreader.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_10_DocxReader_CheckAllLink_CapQuyen extends commonBase {

	@BeforeMethod
	public void init() {
		driver = initDriverTest("WorkOffice.apk", "emulator-5554", "Android", "12.0", "com.happydev.wordoffice",
				"com.happydev.wordoffice.business.splash.SplashActivity", "windows", "8201");
		managementAccount = new Management_Account(driver);
	}

	@AfterMethod
	public void after() {
		quitDriver(driver);
	}

	@Test
	public void TC_001_CheckAllLink_TabHome() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Cấp quyền cho ứng dụng");
		click(PageUI_DocxReader.BUTTON_REQUESTPER_MISSION);
		click(PageUI_DocxReader.BUTTON_SWITCH_OFF);

		info("Kiểm tra UI tổng quan của màn hình Home");
		verifyCompare("true", getAttribute(PageUI_DocxReader.TAB_ALL, "selected"));
		getElementPresent(PageUI_DocxReader.TEXT_DOCX_READER);
		getElementPresent(PageUI_DocxReader.ICON_AVATAR);
		getElementPresent(PageUI_DocxReader.BUTTON_PREMIUM);
		getElementPresent(PageUI_DocxReader.BUTTON_SEARCH);
		getElementPresent(PageUI_DocxReader.BUTTON_SORT);
		getElementPresent(PageUI_DocxReader.TEXT_HOME);
		getElementPresent(PageUI_DocxReader.ICON_HOME);
		getElementPresent(PageUI_DocxReader.TEXT_RECENT);
		getElementPresent(PageUI_DocxReader.ICON_RECENT);
		getElementPresent(PageUI_DocxReader.TEXT_STORAGE);
		getElementPresent(PageUI_DocxReader.ICON_STORAGE);
		getElementPresent(PageUI_DocxReader.TEXT_TOOL);
		getElementPresent(PageUI_DocxReader.ICON_TOOL);
		getElementPresent(PageUI_DocxReader.ICON_CREATE);
		captureScreen(driver, "HomePageCapQuyen");
	}

	@Test
	public void TC_002_CheckAllLink_TabHome_ALL() {
		info("Mở app và mở màn hình Home và click button Request Permission");
		managementAccount.openHomePage();

		info("Kiểm tra UI tổng quan của tab ALL");
		click(PageUI_DocxReader.TAB_ALL);
		getElementPresent(PageUI_DocxReader.LIST_NAME_FILE);
		getElementPresent(PageUI_DocxReader.LIST_CREATE_DATE_FILE);
		getElementPresent(PageUI_DocxReader.LIST_SIZE_FILE);
		getElementPresent(PageUI_DocxReader.LIST_ICON_FAVOURITE);
		getElementPresent(PageUI_DocxReader.LIST_ICON_OPTION);
		captureScreen(driver, "TabALLCapQuyen");
		click(PageUI_DocxReader.ICON_OPTION1);
		getElementPresent(PageUI_DocxReader.TEXT_NAME_FILE);
		getElementPresent(PageUI_DocxReader.TEXT_CREATED_DATE);
		getElementPresent(PageUI_DocxReader.TEXT_SIZE_FILE);
		click(PageUI_DocxReader.TAB_FAVOURITE);
		click(PageUI_DocxReader.ICON_OPTION1);
		getElementPresent(PageUI_DocxReader.TEXT_UNFAVOURITE);
		click(PageUI_DocxReader.TEXT_UNFAVOURITE);
		click(PageUI_DocxReader.ICON_OPTION1);
		getElementPresent(PageUI_DocxReader.TEXT_FAVOURITE);
		click(PageUI_DocxReader.TAB_CREATE_SHORTCUT);
		getElementPresent(PageUI_DocxReader.TEXT_QUICKSTEP);
		getElementPresent(PageUI_DocxReader.BUTTON_ADD_TO_HOME_SCREEN);
		click(PageUI_DocxReader.BUTTON_CANCEL);
		click(PageUI_DocxReader.ICON_OPTION1);
		click(PageUI_DocxReader.TAB_CONVERT_PDF);
		getElementPresent(PageUI_DocxReader.TITLE_CONVERT_PDF);
		getElementPresent(PageUI_DocxReader.BUTTON_CONVERT_TO_PDF);
		click(PageUI_DocxReader.BTN_TOOLBAR_BACK);
		click(PageUI_DocxReader.ICON_OPTION1);
		click(PageUI_DocxReader.TAB_INFO_FILE);
		getElementPresent(PageUI_DocxReader.TEXT_NAME);
		getElementPresent(PageUI_DocxReader.TEXT_PATH);
		singleTab(444,1047);
		click(PageUI_DocxReader.ICON_OPTION1);
		click(PageUI_DocxReader.TAB_SHARE_FILE);
		getElementPresent(PageUI_DocxReader.TITLE_SHARE);
		getElementPresent(PageUI_DocxReader.IMG_HOME);
		click(PageUI_DocxReader.BUTTON_IV_BACK);
		click(PageUI_DocxReader.ICON_OPTION1);
		click(PageUI_DocxReader.TAB_DELETE);
		getElementPresent(PageUI_DocxReader.TEXT_REMOVE_THIS_ITEM);
		getElementPresent(PageUI_DocxReader.BTN_REMOVE);
		click(PageUI_DocxReader.BTN_CANCEL);
	}
	@Test
	public void TC_003_CheckAllLink_TabHome_PDF() {
		info("Mở app và mở màn hình Home và click button Request Permission");
		managementAccount.openHomePage();

		info("Kiểm tra UI tổng quan của tab PDF");
		click(PageUI_DocxReader.TAB_PDF);
		getElementPresent(PageUI_DocxReader.IMG_EMPTY_FILE);
		getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
		captureScreen(driver, "TabPDFCapQuyen");
	}
	@Test
	public void TC_004_CheckAllLink_TabHome_WORD() {
		info("Mở app và mở màn hình Home và click button Request Permission");
		managementAccount.openHomePage();

		info("Kiểm tra UI tổng quan của tab WORD");
		click(PageUI_DocxReader.TAB_WORD);
		getElementPresent(PageUI_DocxReader.LIST_NAME_FILE);
		getElementPresent(PageUI_DocxReader.LIST_CREATE_DATE_FILE);
		getElementPresent(PageUI_DocxReader.LIST_SIZE_FILE);
		getElementPresent(PageUI_DocxReader.LIST_ICON_FAVOURITE);
		getElementPresent(PageUI_DocxReader.LIST_ICON_OPTION);
		captureScreen(driver, "TabWordCapQuyen");
		click(PageUI_DocxReader.ICON_OPTION1);
		getElementPresent(PageUI_DocxReader.TEXT_NAME_FILE);
		getElementPresent(PageUI_DocxReader.TEXT_CREATED_DATE);
		getElementPresent(PageUI_DocxReader.TEXT_SIZE_FILE);
		click(PageUI_DocxReader.TAB_FAVOURITE);
		click(PageUI_DocxReader.ICON_OPTION1);
		getElementPresent(PageUI_DocxReader.TEXT_UNFAVOURITE);
		click(PageUI_DocxReader.TEXT_UNFAVOURITE);
		click(PageUI_DocxReader.ICON_OPTION1);
		getElementPresent(PageUI_DocxReader.TEXT_FAVOURITE);
		click(PageUI_DocxReader.TAB_CREATE_SHORTCUT);
		getElementPresent(PageUI_DocxReader.TEXT_QUICKSTEP);
		getElementPresent(PageUI_DocxReader.BUTTON_ADD_TO_HOME_SCREEN);
		click(PageUI_DocxReader.BUTTON_CANCEL);
		click(PageUI_DocxReader.ICON_OPTION1);
		click(PageUI_DocxReader.TAB_CONVERT_PDF);
		getElementPresent(PageUI_DocxReader.TITLE_CONVERT_PDF_TO_WORD);
		getElementPresent(PageUI_DocxReader.BUTTON_CONVERT_TO_PDF);
		click(PageUI_DocxReader.BTN_TOOLBAR_BACK);
		click(PageUI_DocxReader.ICON_OPTION1);
		click(PageUI_DocxReader.TAB_INFO_FILE);
		getElementPresent(PageUI_DocxReader.TEXT_NAME);
		getElementPresent(PageUI_DocxReader.TEXT_PATH);
		singleTab(444,1047);
		click(PageUI_DocxReader.ICON_OPTION1);
		click(PageUI_DocxReader.TAB_SHARE_FILE);
		getElementPresent(PageUI_DocxReader.TITLE_SHARE);
		getElementPresent(PageUI_DocxReader.IMG_HOME);
		click(PageUI_DocxReader.BUTTON_IV_BACK);
		click(PageUI_DocxReader.ICON_OPTION1);
		click(PageUI_DocxReader.TAB_DELETE);
		getElementPresent(PageUI_DocxReader.TEXT_REMOVE_THIS_ITEM);
		getElementPresent(PageUI_DocxReader.BTN_REMOVE);
		click(PageUI_DocxReader.BTN_CANCEL);
	}
	@Test
	public void TC_005_CheckAllLink_TabHome_HWP() {
		info("Mở app và mở màn hình Home và click button Request Permission");
		managementAccount.openHomePage();

		info("Kiểm tra UI tổng quan của tab HWP");
		click(PageUI_DocxReader.TAB_PDF);
		getElementPresent(PageUI_DocxReader.IMG_EMPTY_FILE);
		getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
		captureScreen(driver, "TabHWPCapQuyen");
	}
	@Test
	public void TC_006_CheckAllLink_TabHome_EXCELL() {
		info("Mở app và mở màn hình Home và click button Request Permission");
		managementAccount.openHomePage();

		info("Kiểm tra UI tổng quan của tab EXCELL");
		click(PageUI_DocxReader.TAB_EXCEL);
		getElementPresent(PageUI_DocxReader.LIST_NAME_FILE);
		getElementPresent(PageUI_DocxReader.LIST_CREATE_DATE_FILE);
		getElementPresent(PageUI_DocxReader.LIST_SIZE_FILE);
		getElementPresent(PageUI_DocxReader.LIST_ICON_FAVOURITE);
		getElementPresent(PageUI_DocxReader.LIST_ICON_OPTION);
		captureScreen(driver, "TabExcellCapQuyen");
		click(PageUI_DocxReader.ICON_OPTION1);
		getElementPresent(PageUI_DocxReader.TEXT_NAME_FILE);
		getElementPresent(PageUI_DocxReader.TEXT_CREATED_DATE);
		getElementPresent(PageUI_DocxReader.TEXT_SIZE_FILE);
		click(PageUI_DocxReader.TAB_FAVOURITE);
		click(PageUI_DocxReader.ICON_OPTION1);
		getElementPresent(PageUI_DocxReader.TEXT_UNFAVOURITE);
		click(PageUI_DocxReader.TEXT_UNFAVOURITE);
		click(PageUI_DocxReader.ICON_OPTION1);
		getElementPresent(PageUI_DocxReader.TEXT_FAVOURITE);
		click(PageUI_DocxReader.TAB_CREATE_SHORTCUT);
		getElementPresent(PageUI_DocxReader.TEXT_QUICKSTEP);
		getElementPresent(PageUI_DocxReader.BUTTON_ADD_TO_HOME_SCREEN);
		click(PageUI_DocxReader.BUTTON_CANCEL);
		click(PageUI_DocxReader.ICON_OPTION1);
		click(PageUI_DocxReader.TAB_CONVERT_PDF);
		getElementPresent(PageUI_DocxReader.TITLE_CONVERT_PDF_TO_WORD);
		getElementPresent(PageUI_DocxReader.BUTTON_CONVERT_TO_PDF);
		click(PageUI_DocxReader.BTN_TOOLBAR_BACK);
		click(PageUI_DocxReader.ICON_OPTION1);
		click(PageUI_DocxReader.TAB_INFO_FILE);
		getElementPresent(PageUI_DocxReader.TEXT_NAME);
		getElementPresent(PageUI_DocxReader.TEXT_PATH);
		singleTab(444,1047);
		click(PageUI_DocxReader.ICON_OPTION1);
		click(PageUI_DocxReader.TAB_SHARE_FILE);
		getElementPresent(PageUI_DocxReader.TITLE_SHARE);
		getElementPresent(PageUI_DocxReader.IMG_HOME);
		click(PageUI_DocxReader.BUTTON_IV_BACK);
		click(PageUI_DocxReader.ICON_OPTION1);
		click(PageUI_DocxReader.TAB_DELETE);
		getElementPresent(PageUI_DocxReader.TEXT_REMOVE_THIS_ITEM);
		getElementPresent(PageUI_DocxReader.BTN_REMOVE);
		click(PageUI_DocxReader.BTN_CANCEL);
	}
	@Test
	public void TC_007_CheckAllLink_TabHome_SLIDES() {
		info("Mở app và mở màn hình Home và click button Request Permission");
		managementAccount.openHomePage();

		info("Kiểm tra UI tổng quan của tab SLIDES");
		click(PageUI_DocxReader.TAB_EXCEL);
		click(PageUI_DocxReader.TAB_SLIDES);
		getElementPresent(PageUI_DocxReader.LIST_NAME_FILE);
		getElementPresent(PageUI_DocxReader.LIST_CREATE_DATE_FILE);
		getElementPresent(PageUI_DocxReader.LIST_SIZE_FILE);
		getElementPresent(PageUI_DocxReader.LIST_ICON_FAVOURITE);
		getElementPresent(PageUI_DocxReader.LIST_ICON_OPTION);
		captureScreen(driver, "TabSlidesCapQuyen");
		click(PageUI_DocxReader.ICON_OPTION1);
		getElementPresent(PageUI_DocxReader.TEXT_NAME_FILE);
		getElementPresent(PageUI_DocxReader.TEXT_CREATED_DATE);
		getElementPresent(PageUI_DocxReader.TEXT_SIZE_FILE);
		click(PageUI_DocxReader.TAB_FAVOURITE);
		click(PageUI_DocxReader.ICON_OPTION1);
		getElementPresent(PageUI_DocxReader.TEXT_UNFAVOURITE);
		click(PageUI_DocxReader.TEXT_UNFAVOURITE);
		click(PageUI_DocxReader.ICON_OPTION1);
		getElementPresent(PageUI_DocxReader.TEXT_FAVOURITE);
		click(PageUI_DocxReader.TAB_CREATE_SHORTCUT);
		getElementPresent(PageUI_DocxReader.TEXT_QUICKSTEP);
		getElementPresent(PageUI_DocxReader.BUTTON_ADD_TO_HOME_SCREEN);
		click(PageUI_DocxReader.BUTTON_CANCEL);
		click(PageUI_DocxReader.ICON_OPTION1);
		click(PageUI_DocxReader.TAB_CONVERT_PDF);
		getElementPresent(PageUI_DocxReader.TITLE_CONVERT_PDF);
		getElementPresent(PageUI_DocxReader.BUTTON_CONVERT_TO_PDF);
		click(PageUI_DocxReader.BTN_TOOLBAR_BACK);
		click(PageUI_DocxReader.ICON_OPTION1);
		click(PageUI_DocxReader.TAB_INFO_FILE);
		getElementPresent(PageUI_DocxReader.TEXT_NAME);
		getElementPresent(PageUI_DocxReader.TEXT_PATH);
		singleTab(444,1047);
		click(PageUI_DocxReader.ICON_OPTION1);
		click(PageUI_DocxReader.TAB_SHARE_FILE);
		getElementPresent(PageUI_DocxReader.TITLE_SHARE);
		getElementPresent(PageUI_DocxReader.IMG_HOME);
		click(PageUI_DocxReader.BUTTON_IV_BACK);
		click(PageUI_DocxReader.ICON_OPTION1);
		click(PageUI_DocxReader.TAB_DELETE);
		getElementPresent(PageUI_DocxReader.TEXT_REMOVE_THIS_ITEM);
		getElementPresent(PageUI_DocxReader.BTN_REMOVE);
		click(PageUI_DocxReader.BTN_CANCEL);
	}
	@Test
	public void TC_008_CheckAllLink_TabHome_TEXT() {
		info("Mở app và mở màn hình Home và click button Request Permission");
		managementAccount.openHomePage();

		info("Kiểm tra UI tổng quan của tab TEXT");
		click(PageUI_DocxReader.TAB_EXCEL);
		click(PageUI_DocxReader.TAB_TEXT);
		getElementPresent(PageUI_DocxReader.IMG_EMPTY_FILE);
		getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
		captureScreen(driver, "TabTextCapQuyen");
	}

	private Management_Account managementAccount;

}
