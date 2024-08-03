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

WebUI.setText(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/input_PeTIK MUSTAHIK_LoginFormusername (15)'), 'adminprogram@ybmpln.org')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/input_PeTIK MUSTAHIK_LoginFormpassword (15)'), 
    'U54oLL1U6TIkPGb6YLpL4w==')

WebUI.delay(10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_PeTIK MUSTAHIK/button_Masuk (15)'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Profil_toggle-sidebar (14)'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Lembaga (2)'))

WebUI.click(findTestObject('Object Repository/Page_Database Mustahik YBM PLN/a_Lembaga_1 (2)'))

WebUI.click(findTestObject('Object Repository/Page_Lembaga/a_Tambah Lembaga (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Tambah Lembaga/input_Kode Lembaga_Lembagakode (1)'), '2323')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Lembaga/input_Nama Lembaga_Lembaganama (1)'), 'tes')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Lembaga/select_MITRA BINAANMITRA EKSTERNALNON MITRA (1)'), 
    'MITRA BINAAN', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Lembaga/select_MITRA BINAANMITRA EKSTERNALNON MITRA (1)'), 
    'NON MITRA', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Lembaga/select_ADATIDAK ADA (1)'), 'TIDAK ADA', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Lembaga/select_-- Pilih Provinsi --ACEHSUMATERA UTA_b8d456 (1)'), 
    '35', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Lembaga/select_-- Pilih KabupatenKota --KABUPATEN B_d49847 (1)'), 
    '3517', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Lembaga/select_-- Pilih Kecamatan --BANDAR KEDUNG M_70a2e7 (1)'), 
    '3517130', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Tambah Lembaga/select_-- Pilih KelurahanDesa --BANJAR DOWO_08a6d5 (1)'), 
    '3517130011', true)

WebUI.setText(findTestObject('Object Repository/Page_Tambah Lembaga/textarea_Alamat Lengkap_Lembagaalamat (1)'), 'tes')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Lembaga/input_Nama Lengkap_Lembaganama_pj (1)'), 'tes')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Lembaga/input_Nomor KTP_Lembaganik_pj (1)'), '324234')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Lembaga/input_Email_Lembagaemail_pj (1)'), 'sdf@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Lembaga/input_Telepon_Lembagatelepon_pj (1)'), '232121')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Lembaga/input_Atas Nama_Lembagabank_nama_pemilik (1)'), 'tes')

WebUI.setText(findTestObject('Object Repository/Page_Tambah Lembaga/input_Nomor Rekening_Lembagabank_rekening (1)'), '324234432')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Tambah Lembaga/button_Simpan (1)'))

WebUI.enhancedClick(findTestObject('Object Repository/Page_tes/a_Update (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Update Lembaga/input_Nama Lembaga_Lembaganama (1)'), 'tes123')

WebUI.enhancedClick(findTestObject('Object Repository/Page_Update Lembaga/button_Simpan (1)'))

WebUI.click(findTestObject('Object Repository/Page_tes123/a_Delete (1)'))

