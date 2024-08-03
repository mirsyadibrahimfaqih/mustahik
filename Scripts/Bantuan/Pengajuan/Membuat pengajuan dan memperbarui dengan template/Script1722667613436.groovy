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

WebUI.setText(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/input_PeTIK MUSTAHIK_LoginFormusername (24)'), 'adminprogram@ybmpln.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/input_PeTIK MUSTAHIK_LoginFormpassword (24)'), 
    'U54oLL1U6TIkPGb6YLpL4w==')

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/button_Masuk (24)'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Profil_toggle-sidebar (22)'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Bantuan (6)'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Pengajuan 49 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Pengajuan/a_Pengajuan Baru (3)'))

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_Judul_Bantuanjudul (4)'), 'tes')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Pengajuan Baru/select_-- Pilih pilar --PENDIDIKAN (4)'), 
    'PENDIDIKAN', true)

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/textarea_Deskripsi_Bantuandeskripsi (4)'), 'tes')

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/textarea_Lokasi Penyaluran_Bantuanlokasi (4)'), 'tes')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Pengajuan Baru/select_-- Pilih kategori --PERORANGANLEMBAGA (4)'), 
    'PERORANGAN', true)

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_Nama Pengaju_Bantuannama_pengaju (4)'), 'tes')

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_NIK_Bantuannik_pengaju (4)'), '54')

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_Telepon_Bantuantelepon_pengaju (4)'), '543')

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_Email_Bantuanemail_pengaju (4)'), 'tes@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_Nama Pemilik_Bantuanbank_pemilik_pengaju (4)'), 
    'tes')

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_Nomor Rekening_Bantuanbank_rekening_pengaju (4)'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_Nama Referensi_Bantuannama_referensi (4)'), 'tes')

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_NIK_Bantuannik_referensi (4)'), '5345435')

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_Telepon_Bantuantelepon_referensi (4)'), '543')

WebUI.setText(findTestObject('Object Repository/Page_Pengajuan Baru/input_Email_Bantuanemail_referensi (4)'), '4535')

WebUI.click(findTestObject('Object Repository/Page_Pengajuan Baru/button_Simpan Pengajuan (3)'))

WebUI.closeBrowser()

