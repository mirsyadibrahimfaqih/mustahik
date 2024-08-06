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

WebUI.setText(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/input_PeTIK MUSTAHIK_LoginFormusername'), 'adminprogram@ybmpln.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/input_PeTIK MUSTAHIK_LoginFormpassword'), 'U54oLL1U6TIkPGb6YLpL4w==')

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Profil_toggle-sidebar'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Mustahik'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Data Mustahik'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_Mustahik/td_Tes12'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_tes12/a_Buat pengajuan dari mustahik ini'))

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_Judul_Bantuanjudul'), 'tes')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Pengajuan Baru/select_-- Pilih pilar --PENDIDIKAN'), 'PENDIDIKAN', 
    true)

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/textarea_Deskripsi_Bantuandeskripsi'), 'tes')

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/textarea_Lokasi Penyaluran_Bantuanlokasi'), 'tes')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Pengajuan Baru/select_-- Pilih kategori --PERORANGANLEMBAGA'), 
    'PERORANGAN', true)

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_Nama Pengaju_Bantuannama_pengaju'), 'tes')

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_NIK_Bantuannik_pengaju'), '234')

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_Telepon_Bantuantelepon_pengaju'), '4324')

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_Email_Bantuanemail_pengaju'), 'dsf@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_Nama Pemilik_Bantuanbank_pemilik_pengaju'), 'tes')

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_Nomor Rekening_Bantuanbank_rekening_pengaju'), 
    '432')

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_Nama Referensi_Bantuannama_referensi'), 'tes')

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_NIK_Bantuannik_referensi'), '324')

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_Telepon_Bantuantelepon_referensi'), '234')

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_Email_Bantuanemail_referensi'), 'fd@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Pengajuan Baru/button_Simpan Pengajuan'))

WebUI.closeBrowser()

