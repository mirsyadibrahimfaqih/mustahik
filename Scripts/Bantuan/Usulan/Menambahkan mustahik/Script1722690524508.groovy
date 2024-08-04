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

WebUI.setText(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/input_PeTIK MUSTAHIK_LoginFormusername (35)'), 'adminprogram@ybmpln.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/input_PeTIK MUSTAHIK_LoginFormpassword (35)'), 
    'U54oLL1U6TIkPGb6YLpL4w==')

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/button_Masuk (35)'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Profil_toggle-sidebar (33)'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Bantuan (17)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Usulan 55 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Usulan/td_Bantuan Dana  Tupen  Anak Pegawai  Smki _defb9d'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Bantuan Dana Tupen Anak Pegawai Smki U_c4b0eb/a_Tambah Mustahik'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Tambah Mustahik/input_No HP_BantuanMustahikmustahik_id (1)'))

WebUI.click(findTestObject('Object Repository/Page_Tambah Mustahik/button_Simpan Mustahik (1)'))

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mustahikdev.petikjombang.com/backend/web/index.php?r=site%2Flogin')

WebUI.setText(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/input_PeTIK MUSTAHIK_LoginFormusername (51)'), 'adminprogram@ybmpln.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/input_PeTIK MUSTAHIK_LoginFormpassword (51)'), 
    'U54oLL1U6TIkPGb6YLpL4w==')

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/button_Masuk (51)'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Profil_toggle-sidebar (49)'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Bantuan (28)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Usulan 55 (4)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Usulan/td_Bantuan  Dana Restitusi Kesehtaan Pegawa_0e1a6d'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Bantuan Dana Restitusi Kesehtaan Pegaw_0d5916/a_Tambah Mustahik'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Tambah Mustahik/input_No HP_BantuanMustahikmustahik_id (3)'))

WebUI.click(findTestObject('Object Repository/Page_Tambah Mustahik/button_Simpan Mustahik (3)'))

WebUI.closeBrowser()

