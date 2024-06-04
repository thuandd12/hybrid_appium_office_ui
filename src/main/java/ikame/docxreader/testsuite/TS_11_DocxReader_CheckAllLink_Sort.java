package ikame.docxreader.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_11_DocxReader_CheckAllLink_Sort extends commonBase {

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
	public void TC_001_CheckAllLink_DocxReader_Sort_0_File() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Kiểm tra button Sort");
		click(PageUI_DocxReader.TAB_PDF);
		getElementPresent(PageUI_DocxReader.IMG_EMPTY_FILE);
		getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
		captureScreen(driver, "TabSort0File");
		click(PageUI_DocxReader.BUTTON_SORT);
		getElementPresent(PageUI_DocxReader.TEXT_FILTER);
		getElementPresent(PageUI_DocxReader.TEXT_VIEW_AS);
		getElementPresent(PageUI_DocxReader.TEXT_SORT_BY);
		getElementPresent(PageUI_DocxReader.TEXT_ORDER);
		click(PageUI_DocxReader.LIST_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_NAME);
		click(PageUI_DocxReader.RAD_ASCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.LIST_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_SIZE);
		click(PageUI_DocxReader.RAD_ASCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.LIST_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_DATE);
		click(PageUI_DocxReader.RAD_ASCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.LIST_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_TYPE);
		click(PageUI_DocxReader.RAD_ASCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.LIST_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_NAME);
		click(PageUI_DocxReader.RAD_DESCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.LIST_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_SIZE);
		click(PageUI_DocxReader.RAD_DESCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.LIST_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_DATE);
		click(PageUI_DocxReader.RAD_DESCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.LIST_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_TYPE);
		click(PageUI_DocxReader.RAD_DESCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.TEXT_GRID_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_NAME);
		click(PageUI_DocxReader.RAD_ASCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.TEXT_GRID_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_SIZE);
		click(PageUI_DocxReader.RAD_ASCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.TEXT_GRID_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_DATE);
		click(PageUI_DocxReader.RAD_ASCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.TEXT_GRID_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_TYPE);
		click(PageUI_DocxReader.RAD_ASCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.TEXT_GRID_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_NAME);
		click(PageUI_DocxReader.RAD_DESCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.TEXT_GRID_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_SIZE);
		click(PageUI_DocxReader.RAD_DESCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.TEXT_GRID_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_DATE);
		click(PageUI_DocxReader.RAD_DESCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.TEXT_GRID_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_TYPE);
		click(PageUI_DocxReader.RAD_DESCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_NO_FILE_FOUND);
		
	}
	@Test
	public void TC_002_CheckAllLink_DocxReader_Sort_1_File() {
		info("Mở app và mở màn hình Home");
		managementAccount.openHomePage();

		info("Kiểm tra button Sort");
		click(PageUI_DocxReader.TAB_EXCEL);
		click(PageUI_DocxReader.TAB_SLIDES);
		getElementPresent(PageUI_DocxReader.LIST_NAME_FILE);
		getElementPresent(PageUI_DocxReader.LIST_CREATE_DATE_FILE);
		getElementPresent(PageUI_DocxReader.LIST_SIZE_FILE);
		getElementPresent(PageUI_DocxReader.LIST_ICON_FAVOURITE);
		getElementPresent(PageUI_DocxReader.LIST_ICON_OPTION);
		captureScreen(driver, "TabSort1File");
		click(PageUI_DocxReader.BUTTON_SORT);
		getElementPresent(PageUI_DocxReader.TEXT_FILTER);
		getElementPresent(PageUI_DocxReader.TEXT_VIEW_AS);
		getElementPresent(PageUI_DocxReader.TEXT_SORT_BY);
		getElementPresent(PageUI_DocxReader.TEXT_ORDER);
		click(PageUI_DocxReader.LIST_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_NAME);
		click(PageUI_DocxReader.RAD_ASCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.LIST_NAME_FILE);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.LIST_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_SIZE);
		click(PageUI_DocxReader.RAD_ASCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.LIST_NAME_FILE);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.LIST_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_DATE);
		click(PageUI_DocxReader.RAD_ASCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.LIST_NAME_FILE);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.LIST_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_TYPE);
		click(PageUI_DocxReader.RAD_ASCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.LIST_NAME_FILE);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.LIST_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_NAME);
		click(PageUI_DocxReader.RAD_DESCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.LIST_NAME_FILE);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.LIST_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_SIZE);
		click(PageUI_DocxReader.RAD_DESCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.LIST_NAME_FILE);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.LIST_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_DATE);
		click(PageUI_DocxReader.RAD_DESCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.LIST_NAME_FILE);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.LIST_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_TYPE);
		click(PageUI_DocxReader.RAD_DESCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.LIST_NAME_FILE);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.TEXT_GRID_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_NAME);
		click(PageUI_DocxReader.RAD_ASCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_FILE_NAME_GRID_VIEW);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.TEXT_GRID_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_SIZE);
		click(PageUI_DocxReader.RAD_ASCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_FILE_NAME_GRID_VIEW);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.TEXT_GRID_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_DATE);
		click(PageUI_DocxReader.RAD_ASCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_FILE_NAME_GRID_VIEW);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.TEXT_GRID_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_TYPE);
		click(PageUI_DocxReader.RAD_ASCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_FILE_NAME_GRID_VIEW);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.TEXT_GRID_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_NAME);
		click(PageUI_DocxReader.RAD_DESCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_FILE_NAME_GRID_VIEW);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.TEXT_GRID_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_SIZE);
		click(PageUI_DocxReader.RAD_DESCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_FILE_NAME_GRID_VIEW);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.TEXT_GRID_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_DATE);
		click(PageUI_DocxReader.RAD_DESCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_FILE_NAME_GRID_VIEW);
		click(PageUI_DocxReader.BUTTON_SORT);
		click(PageUI_DocxReader.TEXT_GRID_VIEW);
		click(PageUI_DocxReader.RAD_SORT_BY_TYPE);
		click(PageUI_DocxReader.RAD_DESCENDING);
		click(PageUI_DocxReader.BTN_APPLY);
		getElementPresent(PageUI_DocxReader.TEXT_FILE_NAME_GRID_VIEW);
		click(PageUI_DocxReader.BUTTON_SORT);
		
	}
	private Management_Account managementAccount;

}
