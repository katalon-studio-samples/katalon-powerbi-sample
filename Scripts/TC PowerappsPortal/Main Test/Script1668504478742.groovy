import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://mtaappsqa-3.powerappsportals.us/')

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_Home  Partner Portal/a_Sign in'))

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_Partner Portal/input_Username_Username'))

WebUI.setText(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_Partner Portal/input_Username_Username'), GlobalVariable.USERNAME)

WebUI.setText(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_Partner Portal/input_Password_PasswordValue'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_Partner Portal/button_Sign in'))

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_Home  Partner Portal/span_Toggle navigation_caret'))

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_Home  Partner Portal/a_Flagging Requests'))

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_Flagging Requests Partner Portal/a_Create Flagging Request'))

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/span_Launch lookup modal_fa fa-search'))

WebUI.click(findTestObject('OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/span_sort descending_fa fa-fw (1)'))

WebUI.click(findTestObject('OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/button_Select'))

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/input_Contractor_ctl00ctl00ContentContainer_910cc5'))

WebUI.selectOptionByValue(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/select_Maintenance of Way (MOW)Capital Prog_00ddff'), 
    '551380001', true)

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/input_Contractor_ctl00ctl00ContentContainer_910cc5'))

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/input__ctl00ctl00ContentContainerMainConten_40fdfe'))

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/input__ctl00ctl00ContentContainerMainConten_20aea9'))

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/input__ctl00ctl00ContentContainerMainConten_948f3c'))

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/input__ctl00ctl00ContentContainerMainConten_eaa01e'))

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/input__ctl00ctl00ContentContainerMainConten_73aaf2'))

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/input__ctl00ctl00ContentContainerMainConten_86c811'))

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/input__ctl00ctl00ContentContainerMainConten_b26de8'))

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/input__ctl00ctl00ContentContainerMainConten_654892'))

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/input__ctl00ctl00ContentContainerMainConten_afd06b'))

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/input__ctl00ctl00ContentContainerMainConten_c71d83'))

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/input_Contractor_ctl00ctl00ContentContainer_910cc5'))

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/a_Add Work Location'))

test1 = WebUI.getText(findTestObject('OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/label_Station From'))

println(test1)

WebUI.click(findTestObject('OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/custom_button_create_Search100', 
        [('textvalue') : test1]))

WebUI.click(findTestObject('OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/span_sort descending_fa fa-fw', [
            ('textvalue') : 'Choose one record and click Select to continue']))

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/button_Select (1)'), 
    FailureHandling.OPTIONAL)

test2 = WebUI.getText(findTestObject('OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/label_Station To'))

println(test2)

WebUI.click(findTestObject('OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/custom_button_create_Search100', 
        [('textvalue') : test2]))

WebUI.delay(2)

WebUI.click(findTestObject('OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/span_sort descending_fa fa-fw2', 
        [('textvalue') : 'Choose one record and click Select to continue']))

WebUI.click(findTestObject('OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/button_Select (2)'))

test3 = WebUI.getText(findTestObject('OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/label_Division Line Track From'))

println(test3)

WebUI.click(findTestObject('OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/custom_button_create_Search100', 
        [('textvalue') : test3]))

WebUI.delay(2)

WebUI.click(findTestObject('OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/span_sort descending_fa fa-fw3', 
        [('textvalue') : 'Choose one record and click Select to continue']))

WebUI.click(findTestObject('OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/button_Select (3)'))

test4 = WebUI.getText(findTestObject('OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/label_Division Line Track To'))

println(test4)

WebUI.click(findTestObject('OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/custom_button_create_Search100', 
        [('textvalue') : test4]))

WebUI.delay(2)

WebUI.click(findTestObject('OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/span_sort descending_fa fa-fw4', 
        [('textvalue') : 'Choose one record and click Select to continue']))

WebUI.click(findTestObject('OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/button_Select (4)'))

WebUI.setText(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/input__ctl00ContentContainerMainContentEnti_3f0bb6'), 
    'NA')

not_run: WebUI.setText(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/input__ctl00ContentContainerMainContentEnti_3f0bb6_1'), 
    'NA')

WebUI.setText(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/input__ctl00ContentContainerMainContentEnti_7a2e52'), 
    'NA')

not_run: WebUI.setText(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/input__ctl00ContentContainerMainContentEnti_7a2e52_1'), 
    'NA')

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/input__ctl00ContentContainerMainContentEnti_aa73d4'))

WebUI.setText(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/textarea__ctl00ContentContainerMainContentE_4ebc8e'), 
    'Test Katalon')

WebUI.click(findTestObject('Object Repository/OR POWERAPPPORTAL/Page_New Flagging Request Partner Portal/input__ctl00ContentContainerMainContentEnti_fa6e91'))

