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

WebUI.navigateToUrl('https://mustahikdev.petikjombang.com/backend/web/index.php?r=site%2Flogin')

WebUI.setText(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/input_PeTIK MUSTAHIK_LoginFormusername (9)'), 'adminprogram@ybmpln.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/input_PeTIK MUSTAHIK_LoginFormpassword (9)'), 
    'U54oLL1U6TIkPGb6YLpL4w==')

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/button_Masuk (9)'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Profil_toggle-sidebar (8)'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Mustahik (5)'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Data Mustahik (5)'))

WebUI.clickOffset(findTestObject('Object Repository/Page_Mustahik/td_Mardalina (2)'), 0, 0)

WebUI.enhancedClick(findTestObject('Object Repository/Page_Mardalina/a_Buat pengajuan dari mustahik ini (1)'))

WebUI.click(findTestObject('Object Repository/Page_Pengajuan Baru/a_Load dari Template (1)'))

WebUI.click(findTestObject('Object Repository/Page_Tambah Bantuan/span_---- Pilih Bantuan ----'))

WebUI.click(findTestObject('Object Repository/Page_Tambah Bantuan/button_Simpan (1)'))

WebUI.click(findTestObject('Object Repository/Page_Update PB-1878U10EKOPENVII2024/button_Simpan Pengajuan'))

WebUI.closeBrowser()

