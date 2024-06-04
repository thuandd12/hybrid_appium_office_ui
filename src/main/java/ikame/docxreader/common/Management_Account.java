package ikame.docxreader.common;

import ikame.docxreader.common.constant.CT_Account;
import ikame.docxreader.ui.PageUI_DocxReader;
import io.appium.java_client.AppiumDriver;

public class Management_Account extends commonBase {
	public Management_Account(AppiumDriver dr) {
		driver = dr;
	}

	public void optionLanguage(String value) {
		String TEXT_LANGUAGE = parseStringToObject(PageUI_DocxReader.OPTION_LANGUAGE, value);
		scrollDown(2);
		click(TEXT_LANGUAGE);
	}
	public void optionLanguageNoScroll(String value) {
		String TEXT_LANGUAGE = parseStringToObject(PageUI_DocxReader.OPTION_LANGUAGE, value);
		click(TEXT_LANGUAGE);
	}

	public void openHomePage() {
		pause(8000);
		clickElementIfDisplay(CT_Account.BUTTON_CONTINUE);
		clickElementIfDisplay(CT_Account.BUTTON_SELECT);
		clickElementIfDisplay(CT_Account.BUTTON_SKIP);
		clickElementIfDisplay(CT_Account.BUTTON_CLOSE_PREMIUM);
	}
	public void openHomePageWithSelectLanguageNoScroll(String value) {
		pause(8000);
		clickElementIfDisplay(CT_Account.BUTTON_CONTINUE);
		pause(3000);
		optionLanguageNoScroll(value);
		clickElementIfDisplay(CT_Account.BUTTON_SELECT);
		clickElementIfDisplay(CT_Account.BUTTON_SKIP);
		clickElementIfDisplay(CT_Account.BUTTON_CLOSE_PREMIUM);
	}

	public void openHomePageWithSelectLanguage(String value) {
		pause(8000);
		clickElementIfDisplay(CT_Account.BUTTON_CONTINUE);
		pause(3000);
		optionLanguage(value);
		clickElementIfDisplay(CT_Account.BUTTON_SELECT);
		clickElementIfDisplay(CT_Account.BUTTON_SKIP);
		clickElementIfDisplay(CT_Account.BUTTON_CLOSE_PREMIUM);
	}

}
