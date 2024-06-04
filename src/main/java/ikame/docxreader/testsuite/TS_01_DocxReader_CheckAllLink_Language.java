package ikame.docxreader.testsuite;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ikame.docxreader.common.Management_Account;
import ikame.docxreader.common.commonBase;
import ikame.docxreader.ui.PageUI_DocxReader;

import static ikame.docxreader.common.TestLogger.info;

public final class TS_01_DocxReader_CheckAllLink_Language extends commonBase {

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
	public void TC_001_CheckAllLink_Language_TiengAnh() {
		info("Mở app và chọn tiếng Anh ");
		managementAccount.openHomePage();
		info("Kiểm tra UI tổng quan của màn hình Home");
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
		captureScreen(driver, "TiengAnh");
	}

	@Test
	public void TC_002_CheckAllLink_Language_TayBaNha() {
		info("Mở app và chọn tiếng Tây Ba Nha");
		managementAccount.openHomePageWithSelectLanguageNoScroll("Español");
		info("Kiểm tra UI tổng quan của màn hình Home");
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
		captureScreen(driver, "TiengTayBanNha");
	}
	
	@Test
	public void TC_003_CheckAllLink_Language_ARapXeUt() {
		info("Mở app và chọn tiếng A Rập");
		managementAccount.openHomePageWithSelectLanguageNoScroll("عربي");

		info("Kiểm tra UI tổng quan của màn hình Home");
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
		captureScreen(driver, "TiengARap");
	}
	
	@Test
	public void TC_004_CheckAllLink_Language_AnDo() {
		info("Mở app và chọn tiếng Ấn Độ");
		managementAccount.openHomePageWithSelectLanguageNoScroll("हिंदी");

		info("Kiểm tra UI tổng quan của màn hình Home");
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
		captureScreen(driver, "TiengAnDo");
	}
	
	@Test
	public void TC_005_CheckAllLink_Language_HanQuoc() {
		info("Mở app và chọn tiếng Hàn Quốc");
		managementAccount.openHomePageWithSelectLanguageNoScroll("한국인");

		info("Kiểm tra UI tổng quan của màn hình Home");
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
		captureScreen(driver, "TiengHanQuoc");
	}
	
	@Test
	public void TC_006_CheckAllLink_Language_NhatBan() {
		info("Mở app và chọn tiếng Nhật Bản");
		managementAccount.openHomePageWithSelectLanguageNoScroll("日本");

		info("Kiểm tra UI tổng quan của màn hình Home");
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
		captureScreen(driver, "TiengNhatBan");
	}
	
	@Test
	public void TC_007_CheckAllLink_Language_TrungQuoc() {
		info("Mở app và chọn tiếng Trung Quốc");
		managementAccount.openHomePageWithSelectLanguageNoScroll("中国人");

		info("Kiểm tra UI tổng quan của màn hình Home");
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
		captureScreen(driver, "TiengTrungQuoc");
		
	}
	
	@Test
	public void TC_008_CheckAllLink_Language_Duc() {
		info("Mở app và chọn tiếng Đức");
		managementAccount.openHomePageWithSelectLanguageNoScroll("Deutch");

		info("Kiểm tra UI tổng quan của màn hình Home");
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
		captureScreen(driver, "TiengDuc");
	}
	
	@Test
	public void TC_009_CheckAllLink_Language_Phap() {
		info("Mở app và chọn tiếng Pháp");
		managementAccount.openHomePageWithSelectLanguage("Français");

		info("Kiểm tra UI tổng quan của màn hình Home");
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
		captureScreen(driver, "TiengPhap");
		
	}
	@Test
	public void TC_010_CheckAllLink_Language_BoDaoNha() {
		info("Mở app và chọn tiếng Bồ Đào Nha");
		managementAccount.openHomePageWithSelectLanguage("Português");

		info("Kiểm tra UI tổng quan của màn hình Home");
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
		captureScreen(driver, "TiengBoDaoNha");
		
	}
	
	@Test
	public void TC_011_CheckAllLink_Language_Nga() {
		info("Mở app và chọn tiếng Nga");
		managementAccount.openHomePageWithSelectLanguage("Русский");

		info("Kiểm tra UI tổng quan của màn hình Home");
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
		captureScreen(driver, "TiengNga");
	}


	private Management_Account managementAccount;

}
