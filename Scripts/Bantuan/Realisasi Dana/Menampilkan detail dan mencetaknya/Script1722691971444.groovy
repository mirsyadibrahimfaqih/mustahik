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

WebUI.setText(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/input_PeTIK MUSTAHIK_LoginFormusername (39)'), 'adminprogram@ybmpln.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/input_PeTIK MUSTAHIK_LoginFormpassword (39)'), 
    'U54oLL1U6TIkPGb6YLpL4w==')

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/button_Masuk (39)'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Profil_toggle-sidebar (37)'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Bantuan (21)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Realisasi Dana 1 (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Realisasi Dana/td_Bantuan Dana Tupen Anak Pegawai Smki Uta_d62bfe'))

WebUI.click(findTestObject('Object Repository/Page_Bantuan Dana Tupen Anak Pegawai Smki U_a3fb9b/a_Approval'))

WebUI.click(findTestObject('Object Repository/Page_Bantuan Dana Tupen Anak Pegawai Smki U_a3fb9b/a_Cetak Detail'))

WebUI.closeBrowser()

